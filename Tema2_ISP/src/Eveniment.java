import java.sql.Date;

public class Eveniment {
	String nume;
	Date data; //sau folosim String cu formatul "zz/ll/aaaa"
	TipEveniment tip;
	String locatie;
	int locuriDisponibile;
	StareEveniment stareCurenta;
	boolean rezervare; //ce e cu asta?
	
	//---------------------------------------------------
	
	//care-i rostul asteia?!
	public boolean verificaDisponibilitate() {
		if (this.locuriDisponibile>0) {
			return true;
		} else {
			return false;
		}
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
