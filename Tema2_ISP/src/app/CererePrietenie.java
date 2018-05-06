package app;

public class CererePrietenie {
	private static CererePrietenie instanta = null;
	Utilizator expeditor;
	Utilizator destinatar;
	
	//----------------------------
	
	protected CererePrietenie() {
		
	}
	
	public static CererePrietenie getInstanta() {
		if (instanta == null) {
			instanta = new CererePrietenie();
		}
		return instanta;
	}
	
	public Utilizator getExpeditor() {
		return expeditor;
	}

	public void setExpeditor(Utilizator expeditor) {
		this.expeditor = expeditor;
	}

	public Utilizator getDestinatar() {
		return destinatar;
	}

	public void setDestinatar(Utilizator destinatar) {
		this.destinatar = destinatar;
	}

	public void trimiteCerere() {
		this.expeditor.listaCereri.add(this);
	}
	
	public void dispareCerere() {
		//nu se poate sterge un obiect din interiorul clasei
		// Atunci mutam metoda asta la utilizator, nu? - Cristina
		this.expeditor=null;
		this.destinatar=null;
	}
}
