package edu.uclm.esi.iso2.multas.domain.test;

import static org.junit.Assert.assertTrue;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.status.StatusLogger;
import org.hibernate.Session;
import org.junit.Test;

import edu.uclm.esi.iso2.multas.dao.HibernateFactory;
import edu.uclm.esi.iso2.multas.domain.Inquiry;
import edu.uclm.esi.iso2.multas.domain.Sanction;
import edu.uclm.esi.iso2.multas.radar.Carretera;

public class InquiryTest {

	@Test
	public void testAmount30() {
		StatusLogger.getLogger().setLevel(Level.OFF);
		HibernateFactory.buildIfNeeded();
		Session sessFact = HibernateFactory.getSessionFactory().openSession();

		Inquiry i = new Inquiry("0100", 100.0, Carretera.URBANA.name(), 30.0);
		Sanction s = i.createSanctionFor(i.getOwner().getDni());
		
		sessFact.close();
		
		assertTrue(s.getAmount() == 600);
	}

	@Test
	public void testPuntos50() {
		StatusLogger.getLogger().setLevel(Level.OFF);
		HibernateFactory.buildIfNeeded();
		Session sessFact = HibernateFactory.getSessionFactory().openSession();

		Inquiry i = new Inquiry("0100", 70.0, Carretera.URBANA.name(), 50.0);
		Sanction s = i.createSanctionFor(i.getOwner().getDni());
		
		sessFact.close();
		
		assertTrue(s.getPoints() == 0);
	}

	@Test
	public void testAmount50() {

		StatusLogger.getLogger().setLevel(Level.OFF);
		HibernateFactory.buildIfNeeded();
		Session sessFact = HibernateFactory.getSessionFactory().openSession();

		Inquiry i = new Inquiry("0100", 70.0, Carretera.URBANA.name(), 50.0);
		Sanction s = i.createSanctionFor(i.getOwner().getDni());
		
		sessFact.close();
		
		assertTrue(s.getAmount() == 100);
	}
}
