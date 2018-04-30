
public class Rezervare {
	int ID;
	Utilizator nume;
	Eveniment event;
	
	//--------------------------
	
	public void anuleazaRezervarea() {
		//si asta lucreaza pe lista totala de evenimente
	}
	
	public void completareRezervare() {
		
	}
	
	public void afisareDetalii() {
		System.out.println("ID rezervare: " + ID);
		System.out.println("Detinator: ");
		nume.afisareDetalii();
		System.out.println("Pentru evenimentul: " + event);//implem detalii event
	}
}
