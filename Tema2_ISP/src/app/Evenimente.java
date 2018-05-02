package app;
import java.util.ArrayList;

public class Evenimente {
	ArrayList<Eveniment> listaEvenimente = new ArrayList<Eveniment>();
	
	//---------------------------------------
	
	public void adaugaEveniment(Eveniment event) {
		this.listaEvenimente.add(event);
	}
	
	public void recomandare(Utilizator user) {
		//de implementat, ca nu stiu ce face
		// Cauta utilizatori care au tipul evenimetului la interese si le recomanda evenimentul. 
		//Cred ca putem omite implementarea pentru moment daca nu o foloseste nimeni... -Cristina
	}
	
	public Eveniment cautaEveniment(String nume) {
		//returneaza doar primul eveniment gasit daca numele este scris identic; vezi solutie la urmatoarea
		for (int i=0;i<this.listaEvenimente.size();i++) {
			if (this.listaEvenimente.get(i).nume.equals(nume)) {
				return this.listaEvenimente.get(i);
			}
		}
		return null;
	}
	
	public ArrayList<Eveniment> cautaEveniment(TipEveniment tip){
		ArrayList<Eveniment> potrivire = new ArrayList<Eveniment>();
		for (int i=0;i<this.listaEvenimente.size();i++) {
			if (this.listaEvenimente.get(i).tip.equals(tip)) {
				potrivire.add(this.listaEvenimente.get(i));
			}
		}
		
		return potrivire;
	}
}
