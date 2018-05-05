package app;

public class Eveniment {
	String nume;
	String data; //sau folosim String cu formatul "zz/ll/aaaa"
	TipEveniment tip;
	String locatie;
	int locuriDisponibile;
	StareEveniment stareCurenta;
	boolean rezervare; 
	
	public Eveniment(String nume, String data, TipEveniment tip, String locatie, int locuriDisponibile,
			StareEveniment stareCurenta, boolean rezervare) {
		super();
		this.nume = nume;
		this.data = data;
		this.tip = tip;
		this.locatie = locatie;
		this.locuriDisponibile = locuriDisponibile;
		this.stareCurenta = stareCurenta;
		this.rezervare = rezervare;
	}

	//---------------------------------------------------
	
	public boolean verificaDisponibilitate() {
		if (this.locuriDisponibile>0) {
			return true;
		} else {
			return false;
		}
	}
	
	public int getLocuriDisponibile() {
		return locuriDisponibile;
	}

	public void decrementeazaLocuriDisp() {
		this.locuriDisponibile--;
	}
	
	public void setActiv() {
		this.stareCurenta = StareEveniment.Activ;
	}
	
	public void setInDesfasurare() {
		this.stareCurenta = StareEveniment.InDesfasurare;
	}
	
	public void setTerminat() {
		this.stareCurenta = StareEveniment.Terminat;
	}
	
	public void setAmanat() {
		this.stareCurenta = StareEveniment.Amanat;
	}
}
