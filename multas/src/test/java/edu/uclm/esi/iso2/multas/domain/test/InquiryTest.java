package edu.uclm.esi.iso2.multas.domain.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import javax.persistence.NoResultException;

import org.junit.Test;

import edu.uclm.esi.iso2.multas.dao.DriverDao;
import edu.uclm.esi.iso2.multas.domain.Driver;
import edu.uclm.esi.iso2.multas.domain.Inquiry;
import edu.uclm.esi.iso2.multas.domain.Sanction;
import edu.uclm.esi.iso2.multas.radar.Carretera;

public class InquiryTest {

	@Test
	public void test30() {
		Inquiry i = new Inquiry("0101", 31.0, Carretera.URBANA.name(), 30.0);
		Sanction s = i.createSanctionFor(i.getOwner().getDni());
		
		assertTrue(s.getPoints() == 0);
		assertTrue(s.getAmount() == 100);
		
		i = new Inquiry("0102", 51.0, Carretera.URBANA.name(), 30.0);
		s = i.createSanctionFor(i.getOwner().getDni());
		
		assertTrue(s.getPoints() == 2);
		assertTrue(s.getAmount() == 300);
		
		i = new Inquiry("0103", 61.0, Carretera.URBANA.name(), 30.0);
		s = i.createSanctionFor(i.getOwner().getDni());
		
		assertTrue(s.getPoints() == 4);
		assertTrue(s.getAmount() == 400);
		
		i = new Inquiry("0104", 71.0, Carretera.URBANA.name(), 30.0);
		s = i.createSanctionFor(i.getOwner().getDni());
		
		assertTrue(s.getPoints() == 6);
		assertTrue(s.getAmount() == 500);
		
		i = new Inquiry("0105", 81.0, Carretera.URBANA.name(), 30.0);
		s = i.createSanctionFor(i.getOwner().getDni());
		
		assertTrue(s.getPoints() == 6);
		assertTrue(s.getAmount() == 600);
	}
	
	@Test
	public void test40() {
		Inquiry i = new Inquiry("0101", 41.0, Carretera.URBANA.name(), 40.0);
		Sanction s = i.createSanctionFor(i.getOwner().getDni());
		
		assertTrue(s.getPoints() == 0);
		assertTrue(s.getAmount() == 100);
		
		i = new Inquiry("0102", 61.0, Carretera.URBANA.name(), 40.0);
		s = i.createSanctionFor(i.getOwner().getDni());
		
		assertTrue(s.getPoints() == 2);
		assertTrue(s.getAmount() == 300);
		
		i = new Inquiry("0103", 71.0, Carretera.URBANA.name(), 40.0);
		s = i.createSanctionFor(i.getOwner().getDni());
		
		assertTrue(s.getPoints() == 4);
		assertTrue(s.getAmount() == 400);
		
		i = new Inquiry("0104", 81.0, Carretera.URBANA.name(), 40.0);
		s = i.createSanctionFor(i.getOwner().getDni());
		
		assertTrue(s.getPoints() == 6);
		assertTrue(s.getAmount() == 500);
		
		i = new Inquiry("0105", 91.0, Carretera.URBANA.name(), 40.0);
		s = i.createSanctionFor(i.getOwner().getDni());
		
		assertTrue(s.getPoints() == 6);
		assertTrue(s.getAmount() == 600);
	}

	@Test
	public void test50() {
		Inquiry i = new Inquiry("0101", 51.0, Carretera.URBANA.name(), 50.0);
		Sanction s = i.createSanctionFor(i.getOwner().getDni());
		
		assertTrue(s.getPoints() == 0);
		assertTrue(s.getAmount() == 100);
		
		i = new Inquiry("0102", 71.0, Carretera.URBANA.name(), 50.0);
		s = i.createSanctionFor(i.getOwner().getDni());
		
		assertTrue(s.getPoints() == 2);
		assertTrue(s.getAmount() == 300);
		
		i = new Inquiry("0103", 81.0, Carretera.URBANA.name(), 50.0);
		s = i.createSanctionFor(i.getOwner().getDni());
		
		assertTrue(s.getPoints() == 4);
		assertTrue(s.getAmount() == 400);
		
		i = new Inquiry("0104", 91.0, Carretera.URBANA.name(), 50.0);
		s = i.createSanctionFor(i.getOwner().getDni());
		
		assertTrue(s.getPoints() == 6);
		assertTrue(s.getAmount() == 500);
		
		i = new Inquiry("0105", 101.0, Carretera.URBANA.name(), 50.0);
		s = i.createSanctionFor(i.getOwner().getDni());
		
		assertTrue(s.getPoints() == 6);
		assertTrue(s.getAmount() == 600);
	}
	
	@Test
	public void test60() {
		Inquiry i = new Inquiry("0101", 61.0, Carretera.URBANA.name(), 60.0);
		Sanction s = i.createSanctionFor(i.getOwner().getDni());
		
		assertTrue(s.getPoints() == 0);
		assertTrue(s.getAmount() == 100);
		
		i = new Inquiry("0102", 91.0, Carretera.URBANA.name(), 60.0);
		s = i.createSanctionFor(i.getOwner().getDni());
		
		assertTrue(s.getPoints() == 2);
		assertTrue(s.getAmount() == 300);
		
		i = new Inquiry("0103", 111.0, Carretera.URBANA.name(), 60.0);
		s = i.createSanctionFor(i.getOwner().getDni());
		
		assertTrue(s.getPoints() == 4);
		assertTrue(s.getAmount() == 400);
		
		i = new Inquiry("0104", 121.0, Carretera.URBANA.name(), 60.0);
		s = i.createSanctionFor(i.getOwner().getDni());
		
		assertTrue(s.getPoints() == 6);
		assertTrue(s.getAmount() == 500);
		
		i = new Inquiry("0105", 131.0, Carretera.URBANA.name(), 60.0);
		s = i.createSanctionFor(i.getOwner().getDni());
		
		assertTrue(s.getPoints() == 6);
		assertTrue(s.getAmount() == 600);
	}
	
	@Test
	public void test70() {
		Inquiry i = new Inquiry("0101", 71.0, Carretera.URBANA.name(), 70.0);
		Sanction s = i.createSanctionFor(i.getOwner().getDni());
		
		assertTrue(s.getPoints() == 0);
		assertTrue(s.getAmount() == 100);
		
		i = new Inquiry("0102", 101.0, Carretera.URBANA.name(), 70.0);
		s = i.createSanctionFor(i.getOwner().getDni());
		
		assertTrue(s.getPoints() == 2);
		assertTrue(s.getAmount() == 300);
		
		i = new Inquiry("0103", 121.0, Carretera.URBANA.name(), 70.0);
		s = i.createSanctionFor(i.getOwner().getDni());
		
		assertTrue(s.getPoints() == 4);
		assertTrue(s.getAmount() == 400);
		
		i = new Inquiry("0104", 131.0, Carretera.URBANA.name(), 70.0);
		s = i.createSanctionFor(i.getOwner().getDni());
		
		assertTrue(s.getPoints() == 6);
		assertTrue(s.getAmount() == 500);
		
		i = new Inquiry("0105", 141.0, Carretera.URBANA.name(), 70.0);
		s = i.createSanctionFor(i.getOwner().getDni());
		
		assertTrue(s.getPoints() == 6);
		assertTrue(s.getAmount() == 600);
	}
	
	@Test
	public void test80() {
		Inquiry i = new Inquiry("0101", 81.0, Carretera.URBANA.name(), 80.0);
		Sanction s = i.createSanctionFor(i.getOwner().getDni());
		
		assertTrue(s.getPoints() == 0);
		assertTrue(s.getAmount() == 100);
		
		i = new Inquiry("0102", 111.0, Carretera.URBANA.name(), 80.0);
		s = i.createSanctionFor(i.getOwner().getDni());
		
		assertTrue(s.getPoints() == 2);
		assertTrue(s.getAmount() == 300);
		
		i = new Inquiry("0103", 131.0, Carretera.URBANA.name(), 80.0);
		s = i.createSanctionFor(i.getOwner().getDni());
		
		assertTrue(s.getPoints() == 4);
		assertTrue(s.getAmount() == 400);
		
		i = new Inquiry("0104", 141.0, Carretera.URBANA.name(), 80.0);
		s = i.createSanctionFor(i.getOwner().getDni());
		
		assertTrue(s.getPoints() == 6);
		assertTrue(s.getAmount() == 500);
		
		i = new Inquiry("0105", 151.0, Carretera.URBANA.name(), 80.0);
		s = i.createSanctionFor(i.getOwner().getDni());
		
		assertTrue(s.getPoints() == 6);
		assertTrue(s.getAmount() == 600);
	}
	
	@Test
	public void test90() {
		Inquiry i = new Inquiry("0101", 91.0, Carretera.URBANA.name(), 90.0);
		Sanction s = i.createSanctionFor(i.getOwner().getDni());
		
		assertTrue(s.getPoints() == 0);
		assertTrue(s.getAmount() == 100);
		
		i = new Inquiry("0102", 121.0, Carretera.URBANA.name(), 90.0);
		s = i.createSanctionFor(i.getOwner().getDni());
		
		assertTrue(s.getPoints() == 2);
		assertTrue(s.getAmount() == 300);
		
		i = new Inquiry("0103", 141.0, Carretera.URBANA.name(), 90.0);
		s = i.createSanctionFor(i.getOwner().getDni());
		
		assertTrue(s.getPoints() == 4);
		assertTrue(s.getAmount() == 400);
		
		i = new Inquiry("0104", 151.0, Carretera.URBANA.name(), 90.0);
		s = i.createSanctionFor(i.getOwner().getDni());
		
		assertTrue(s.getPoints() == 6);
		assertTrue(s.getAmount() == 500);
		
		i = new Inquiry("0105", 161.0, Carretera.URBANA.name(), 90.0);
		s = i.createSanctionFor(i.getOwner().getDni());
		
		assertTrue(s.getPoints() == 6);
		assertTrue(s.getAmount() == 600);
	}
	
	@Test
	public void test100() {
		Inquiry i = new Inquiry("0101", 101.0, Carretera.URBANA.name(), 100.0);
		Sanction s = i.createSanctionFor(i.getOwner().getDni());
		
		assertTrue(s.getPoints() == 0);
		assertTrue(s.getAmount() == 100);
		
		i = new Inquiry("0102", 131.0, Carretera.URBANA.name(), 100.0);
		s = i.createSanctionFor(i.getOwner().getDni());
		
		assertTrue(s.getPoints() == 2);
		assertTrue(s.getAmount() == 300);
		
		i = new Inquiry("0103", 151.0, Carretera.URBANA.name(), 100.0);
		s = i.createSanctionFor(i.getOwner().getDni());
		
		assertTrue(s.getPoints() == 4);
		assertTrue(s.getAmount() == 400);
		
		i = new Inquiry("0104", 161.0, Carretera.URBANA.name(), 100.0);
		s = i.createSanctionFor(i.getOwner().getDni());
		
		assertTrue(s.getPoints() == 6);
		assertTrue(s.getAmount() == 500);
		
		i = new Inquiry("0105", 171.0, Carretera.URBANA.name(), 100.0);
		s = i.createSanctionFor(i.getOwner().getDni());
		
		assertTrue(s.getPoints() == 6);
		assertTrue(s.getAmount() == 600);
	}
	
	@Test
	public void test110() {
		Inquiry i = new Inquiry("0101", 111.0, Carretera.URBANA.name(), 110.0);
		Sanction s = i.createSanctionFor(i.getOwner().getDni());
		
		assertTrue(s.getPoints() == 0);
		assertTrue(s.getAmount() == 100);
		
		i = new Inquiry("0102", 141.0, Carretera.URBANA.name(), 110.0);
		s = i.createSanctionFor(i.getOwner().getDni());
		
		assertTrue(s.getPoints() == 2);
		assertTrue(s.getAmount() == 300);
		
		i = new Inquiry("0103", 161.0, Carretera.URBANA.name(), 110.0);
		s = i.createSanctionFor(i.getOwner().getDni());
		
		assertTrue(s.getPoints() == 4);
		assertTrue(s.getAmount() == 400);
		
		i = new Inquiry("0104", 171.0, Carretera.URBANA.name(), 110.0);
		s = i.createSanctionFor(i.getOwner().getDni());
		
		assertTrue(s.getPoints() == 6);
		assertTrue(s.getAmount() == 500);
		
		i = new Inquiry("0105", 181.0, Carretera.URBANA.name(), 110.0);
		s = i.createSanctionFor(i.getOwner().getDni());
		
		assertTrue(s.getPoints() == 6);
		assertTrue(s.getAmount() == 600);
	}
	
	@Test
	public void test120() {
		Inquiry i = new Inquiry("0101", 121.0, Carretera.URBANA.name(), 120.0);
		Sanction s = i.createSanctionFor(i.getOwner().getDni());
		
		assertTrue(s.getPoints() == 0);
		assertTrue(s.getAmount() == 100);
		
		i = new Inquiry("0102", 151.0, Carretera.URBANA.name(), 120.0);
		s = i.createSanctionFor(i.getOwner().getDni());
		
		assertTrue(s.getPoints() == 2);
		assertTrue(s.getAmount() == 300);
		
		i = new Inquiry("0103", 171.0, Carretera.URBANA.name(), 120.0);
		s = i.createSanctionFor(i.getOwner().getDni());
		
		assertTrue(s.getPoints() == 4);
		assertTrue(s.getAmount() == 400);
		
		i = new Inquiry("0104", 181.0, Carretera.URBANA.name(), 120.0);
		s = i.createSanctionFor(i.getOwner().getDni());
		
		assertTrue(s.getPoints() == 6);
		assertTrue(s.getAmount() == 500);
		
		i = new Inquiry("0105", 191.0, Carretera.URBANA.name(), 120.0);
		s = i.createSanctionFor(i.getOwner().getDni());
		
		assertTrue(s.getPoints() == 6);
		assertTrue(s.getAmount() == 600);
	}
	
	@Test
	public void testCreacionSancion() {
		// Crea una sanción sin penalización de puntos y con multa de 100€
		// Al usuario con DNI 5000000

		Inquiry i = new Inquiry("0000", 31.0, Carretera.URBANA.name(), 30.0);
		Sanction s = i.createSanctionFor(i.getOwner().getDni());
		
		assertTrue(s.getPoints() == 0);		// Comprueba que los puntos son 0
		assertTrue(s.getAmount() == 100);	// Comprueba que la multa es de 100€
		assertEquals(s.getSanctionHolder().getDni(), "5000000");	// Comprueba que el DNI es de 5000000
		
		// Ahora comprueba que está pagada
		s.pay();
		assertTrue(s.isEstaPagada());
	}
	
	@Test
	public void testCreacionSancion2() {
		// Crea una sanción con penalización de 2 puntos y con multa de 300€
		// Al usuario con DNI 5000000
		DriverDao dao = new DriverDao();
		Driver d;
		int puntosOriginales;
		try {
			d = dao.findByDni("5000438");
			puntosOriginales = d.getPoints();
		} catch (NoResultException e) {
			puntosOriginales = 12;
		}

		Inquiry i = new Inquiry("1400", 51.0, Carretera.URBANA.name(), 30.0);
		Sanction s = i.createSanctionFor(i.getOwner().getDni());
		
		assertTrue(s.getPoints() == 2);		// Comprueba que los puntos son 2
		assertTrue(s.getAmount() == 300);	// Comprueba que la multa es de 300€
		assertEquals(s.getSanctionHolder().getDni(), "5000438");	// Comprueba que el DNI es de 5001400
		
		// Ahora comprueba que está pagada
		s.pay();
		assertTrue(s.isEstaPagada());
	}
}
