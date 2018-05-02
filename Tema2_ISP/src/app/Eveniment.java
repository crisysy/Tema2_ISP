package app;
import java.sql.Date;

public class Eveniment {
	String nume;
	Date data; //sau folosim String cu formatul "zz/ll/aaaa"
	TipEveniment tip;
	String locatie;
	int locuriDisponibile;
	StareEveniment stareCurenta;
	boolean rezervare; //ce e cu asta?
			   // Sunt evenimente pentru care e necesara rezervarea unui loc => rezervare=True daca da si False daca nu. - Cristina
	
	//---------------------------------------------------
	
	//care-i rostul asteia?!
	// Daca nu sunt locuri, sa apara un mesaj ca omul sa stie ca nu mai poate sa mearga. - Cristina
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
