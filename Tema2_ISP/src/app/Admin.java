package app;

public class Admin extends Utilizator {
	//-------------------------------
	
	public Admin(String nume) {
		super(nume);
		// TODO Auto-generated constructor stub
	}

	public void adaugaEveniment(Eveniment event) {
		//ugh...discutie
		//ar merge singleton la Evenimente
		//ca asta trebuie sa adauge eveniment in lista cu toate ev
	}
	
	public void stergeEveniment(Eveniment event) {
		//idem
	}
	
	public void editeazaEveniment(Eveniment event) {
		//idem
	}
}
