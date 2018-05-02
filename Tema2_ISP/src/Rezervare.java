
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
	
	//Au, aici e tricky. Cred ca ambele trebuie sa primeasca paremetrii user si eveniment. Nu stiu sigur in ce clasa ar trebui sa fie
	//metoda, dar cred ca e ok si aici... O sa facen new Rezervare apoi Rezervare.completeazaRezervare(User, Eveniment)
	//Poti sa mi-i lasi mie... -Cristina
	
	public void afisareDetalii() {
		System.out.println("ID rezervare: " + ID);
		System.out.println("Detinator: ");
		nume.afisareDetalii();
		System.out.println("Pentru evenimentul: " + event);//implem detalii event
	}
}
