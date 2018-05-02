package teste;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

import app.Eveniment;
import app.StareEveniment;
import app.TipEveniment;
import app.Utilizator;

class TestParticipare  {


	Utilizator user = new Utilizator("Cristina");
	
	
	
	@Test
	void testEvenimentInactiv() {
    
		Eveniment evenimentTerminat = new Eveniment("Bookfest" , "11/11/2011", TipEveniment.Carte, "Bucuresti", 3, StareEveniment.Terminat, false);
		user.participa(evenimentTerminat);
		assertEquals("Evenimentul nu mai este Activ.", user.getUltimulMesaj());
		assertEquals(false, user.contineEveniment(evenimentTerminat));
	}
	
	@Test
	void testEvenimentFaraRezervare ()
	{
		Eveniment evFaraRez = new Eveniment("StreetFood","20/12/2020", TipEveniment.Mancare, "Timisoara", 3, StareEveniment.Activ, false);
		user.participa(evFaraRez);
		assertEquals(true, user.contineEveniment(evFaraRez));
	}
	
	@Test
	void testEvFaraLocuri ()
	{
		Eveniment evFaraLoc = new Eveniment("Book Fest", "12.03.2023", TipEveniment.Carte, "Iasi", 0, StareEveniment.Activ, true);
		user.participa(evFaraLoc);
		assertEquals("Nu mai sunt locuri disponibile.", user.getUltimulMesaj());
		assertEquals(false, user.contineEveniment(evFaraLoc));
	}
	
	@Test
	void testEvCuLocuri ()
	{
		Eveniment evCuLoc = new Eveniment("Book Fest", "12.03.2023", TipEveniment.Carte, "Iasi", 5, StareEveniment.Activ, true);
		int locuriInainte = evCuLoc.getLocuriDisponibile();
		user.participa(evCuLoc);
		assertEquals(true, user.contineEveniment(evCuLoc));
		assertEquals(locuriInainte-1, evCuLoc.getLocuriDisponibile());
	}

}
