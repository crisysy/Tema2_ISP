
public class CererePrietenie {
	Utilizator expeditor;
	Utilizator destinatar;
	
	//----------------------------
	
	public void trimiteCerere() {
		this.expeditor.listaCereri.add(this);
	}
	
	public void dispareCerere() {
		//nu se poate sterge un obiect din interiorul clasei
		// Atunci mutam metoda asta la utilizator, nu? - Cristina
	}
}
