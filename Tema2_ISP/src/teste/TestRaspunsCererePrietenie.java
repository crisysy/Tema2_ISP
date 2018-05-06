package teste;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import app.CererePrietenie;
import app.Utilizator;

class TestRaspunsCererePrietenie {

	@Test
	void testAccept1() {
		//creare utilizatori
		Utilizator andrei = new Utilizator("Andrei");
		Utilizator radu = new Utilizator("Radu");
		
		//creare cerere de prietenie
		CererePrietenie cerere = CererePrietenie.getInstanta();
		cerere.setDestinatar(radu);
		cerere.setExpeditor(andrei);
		
		//trimiterea cererii
		cerere.trimiteCerere();
		
		//acceptarea cererii
		radu.raspunsCererePrietenie(cerere, true);
		assertTrue(radu.getUltimulPrieten().equals(andrei));
		assertTrue(andrei.getUltimulPrieten().equals(radu));
	}
	
	@Test
	void testAccept2() {
		//creare utilizatori
		Utilizator andrei = new Utilizator("Andrei");
		Utilizator radu = new Utilizator("Radu");
		Utilizator cristina = new Utilizator("Cristina");
		
		//creare cerere de prietenie 1
		CererePrietenie cerere = CererePrietenie.getInstanta();
		cerere.setDestinatar(radu);
		cerere.setExpeditor(andrei);
		
		//trimiterea cererii 1
		cerere.trimiteCerere();
		
		//accept cerere 1
		radu.raspunsCererePrietenie(cerere, true);
		
		//creare cerere de prietenie 2
		cerere = CererePrietenie.getInstanta();
		cerere.setDestinatar(radu);
		cerere.setExpeditor(cristina);
		
		//trimiterea cererii 2
		cerere.trimiteCerere();
		
		//accept cerere 2
		radu.raspunsCererePrietenie(cerere, true);
		
		ArrayList<Utilizator> lista = new ArrayList<Utilizator>(radu.getListaPrieteni());
				
		assertTrue(lista.get(0).equals(andrei));
		assertTrue(lista.get(1).equals(cristina));
		assertTrue(andrei.getUltimulPrieten().equals(radu));
		assertTrue(cristina.getUltimulPrieten().equals(radu));
	}

	@Test
	void testRespingere() {
		//creare utilizatori
		Utilizator andrei = new Utilizator("Andrei");
		Utilizator radu = new Utilizator("Radu");
		
		//creare cerere de prietenie
		CererePrietenie cerere = CererePrietenie.getInstanta();
		cerere.setDestinatar(radu);
		cerere.setExpeditor(andrei);
		
		//trimiterea cererii
		cerere.trimiteCerere();
		
		//acceptarea cererii
		radu.raspunsCererePrietenie(cerere, false);
		ArrayList<Utilizator> lista = new ArrayList<Utilizator>(radu.getListaPrieteni());
		assertEquals(lista.size(), 0);
		assertEquals(andrei.getListaPrieteni().size(), 0);
	}
	
	@Test
	void testRespingere2() {
		//creare utilizatori
		Utilizator andrei = new Utilizator("Andrei");
		Utilizator radu = new Utilizator("Radu");
		Utilizator cristina = new Utilizator("Cristina");
		
		//creare cerere de prietenie 1
		CererePrietenie cerere = CererePrietenie.getInstanta();
		cerere.setDestinatar(radu);
		cerere.setExpeditor(andrei);
		
		//trimiterea cererii 1
		cerere.trimiteCerere();
		
		//respingere cerere 1
		radu.raspunsCererePrietenie(cerere, false);
		
		//creare cerere de prietenie 2
		cerere = CererePrietenie.getInstanta();
		cerere.setDestinatar(radu);
		cerere.setExpeditor(cristina);
		
		//trimiterea cererii 2
		cerere.trimiteCerere();
		
		//accept cerere 2
		radu.raspunsCererePrietenie(cerere, true);
		
		ArrayList<Utilizator> lista = new ArrayList<Utilizator>(radu.getListaPrieteni());
				
		assertEquals(lista.size(),1);
		assertTrue(lista.get(0).equals(cristina));
		assertTrue(cristina.getUltimulPrieten().equals(radu));
		assertEquals(andrei.getListaPrieteni().size(), 0);
	}
}
