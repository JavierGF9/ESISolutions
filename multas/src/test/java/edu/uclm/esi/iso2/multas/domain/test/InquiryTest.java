package edu.uclm.esi.iso2.multas.domain.test;

import static org.junit.Assert.*;

import javax.persistence.NoResultException;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.status.StatusLogger;
import org.hibernate.Session;
import org.junit.Test;

import edu.uclm.esi.iso2.multas.domain.Driver;

import edu.uclm.esi.iso2.multas.dao.DriverDao;
import edu.uclm.esi.iso2.multas.dao.HibernateFactory;
import edu.uclm.esi.iso2.multas.domain.Inquiry;
import edu.uclm.esi.iso2.multas.domain.Sanction;
import edu.uclm.esi.iso2.multas.radar.Carretera;

public class InquiryTest {

	public void testAmount30() {
		StatusLogger.getLogger().setLevel(Level.OFF);
		HibernateFactory.buildIfNeeded();
		Session sessFact = HibernateFactory.getSessionFactory().openSession();

		Inquiry i = new Inquiry("0100", 100.0, Carretera.URBANA.name(), 30.0);
		Sanction s = i.createSanctionFor(i.getOwner().getDni());
		
		sessFact.close();
		
		assertTrue(s.getAmount() == 600);
	}

	public void testPuntos50() {
		StatusLogger.getLogger().setLevel(Level.OFF);
		HibernateFactory.buildIfNeeded();
		Session sessFact = HibernateFactory.getSessionFactory().openSession();

		Inquiry i = new Inquiry("0100", 70.0, Carretera.URBANA.name(), 50.0);
		Sanction s = i.createSanctionFor(i.getOwner().getDni());
		
		sessFact.close();
		
		assertTrue(s.getPoints() == 0);
	}

	public void testAmount50() {

		StatusLogger.getLogger().setLevel(Level.OFF);
		HibernateFactory.buildIfNeeded();
		Session sessFact = HibernateFactory.getSessionFactory().openSession();

		Inquiry i = new Inquiry("0100", 70.0, Carretera.URBANA.name(), 50.0);
		Sanction s = i.createSanctionFor(i.getOwner().getDni());
		
		sessFact.close();
		
		assertTrue(s.getAmount() == 100);
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
