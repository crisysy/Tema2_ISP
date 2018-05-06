package app;
import java.sql.Date;
import java.util.ArrayList;

public class Utilizator {
	String nume;
	Date dataNasterii;
	String ultimulMesaj = "";
	ArrayList<TipEveniment> preferinte = new ArrayList<TipEveniment>();
	ArrayList<Eveniment> listaEvenimente = new ArrayList<Eveniment>();
	ArrayList<Utilizator> listaPrieteni = new ArrayList<Utilizator>();
	ArrayList<Eveniment> listaSugestii = new ArrayList<Eveniment>();
	ArrayList<CererePrietenie> listaCereri = new ArrayList<CererePrietenie>();
	ArrayList<Rezervare> listaRezervari = new ArrayList<Rezervare>();
	
	//----------------------------------------------------
	
	public String getUltimulMesaj() {
		return ultimulMesaj;
	}

	public Utilizator(String nume) {
		super();
		this.nume = nume;
	}
	
	public Utilizator getUltimulPrieten() {
		return this.listaPrieteni.get(this.listaPrieteni.size()-1);
	}
	
	public ArrayList<Utilizator> getListaPrieteni(){
		return this.listaPrieteni;
	}
	
	//metoda lui Andrei
	//nu va atingeti de ea
	public void raspunsCererePrietenie(CererePrietenie cerere, boolean raspuns) {
		if (raspuns) {
			cerere.expeditor.listaPrieteni.add(cerere.destinatar);
			cerere.destinatar.listaPrieteni.add(cerere.expeditor);
			
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
	
	//Cristina Pavel \/
	
	public void participa(Eveniment event) {
		if(event.stareCurenta == StareEveniment.Activ )
		{
			if(event.rezervare)
			{
				if(event.verificaDisponibilitate())
				{
					this.adaugaEveniment(event);
					Rezervare rezervare = new Rezervare (this, event);
					this.listaRezervari.add(rezervare);
					event.locuriDisponibile--;	
				}
				else {
					this.ultimulMesaj="Nu mai sunt locuri disponibile.";
					System.out.println(ultimulMesaj);
				}					
			}
			else
				this.adaugaEveniment(event);
		}
		else {
			this.ultimulMesaj="Evenimentul nu mai este Activ.";
			System.out.println(ultimulMesaj);
		}
	}
	
	public boolean contineEveniment (Eveniment event)
	{
		if (listaEvenimente.contains(event))
			return true;
		else
			return false;
	}
	
	
	public void anuleazaParicipare(Eveniment event) {

		for (int i=0;i<this.listaEvenimente.size();i++) {
			if (this.listaEvenimente.get(i).equals(event)) {
				this.listaEvenimente.remove(i);
			}
		}
	}
}
