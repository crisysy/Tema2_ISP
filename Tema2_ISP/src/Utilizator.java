import java.sql.Date;
import java.util.ArrayList;

public class Utilizator {
	String nume;
	Date dataNasterii;
	ArrayList<TipEveniment> preferinte = new ArrayList<TipEveniment>();
	ArrayList<Eveniment> listaEvenimente = new ArrayList<Eveniment>();
	ArrayList<Utilizator> listaPrieteni = new ArrayList<Utilizator>();
	ArrayList<Eveniment> listaSugestii = new ArrayList<Eveniment>();
	ArrayList<CererePrietenie> listaCereri = new ArrayList<CererePrietenie>();
	
	//----------------------------------------------------
	
	//metoda lui Andrei
	//nu va atingeti de ea
	public void raspunsCererePrietenie(CererePrietenie cerere, boolean raspuns) {
		if (raspuns) {
			cerere.expeditor.listaPrieteni.add(cerere.destinatar);
			cerere.destinatar.listaPrieteni.add(cerere.expeditor);
			cerere = null;
		} else {
			cerere = null;
		}
	}
	
	public void adaugaEveniment(Eveniment event) {
		this.listaEvenimente.add(event);
	}
	
	public void adaugaSugestie(int pozitie) {
		//adauga evenimentul de la pozitia indicata in lista de evenimente
		//apoi sterge evenimentul din lista de sugestii
		//!trebuie facuta una si pentru stergere sugestie
		this.listaEvenimente.add(this.listaSugestii.get(pozitie));
		this.listaSugestii.remove(pozitie);
	}
	
	public void afisareDetalii() {
		System.out.println("Nume utilizator: " + this.nume);
		System.out.println("Data nasterii: " + this.dataNasterii);
		System.out.println("Preferinte: " + this.preferinte);
	}
	
	public void aparticipa(Eveniment event) {
		//nush ce face asta
	}
	
	public void anuleazaParicipare(Eveniment event) {
		//adica sa stearga din lista de evenimente? ca nu mai stiu
		for (int i=0;i<this.listaEvenimente.size();i++) {
			if (this.listaEvenimente.get(i).equals(event)) {
				this.listaEvenimente.remove(i);
			}
		}
	}
}
