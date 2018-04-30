
public class Sugestie {
	Utilizator expeditor;
	Utilizator destinatar;
	Eveniment evenimentSugerat;
	
	//------------------------------------
	
	public void trimiteSugestie() {
		this.destinatar.listaSugestii.add(evenimentSugerat);
	}
	
	public void dispareSugestie() {
		//nu se poate din interior
	}
}
