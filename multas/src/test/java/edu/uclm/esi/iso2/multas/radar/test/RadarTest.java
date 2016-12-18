package edu.uclm.esi.iso2.multas.radar.test;

import static org.junit.Assert.fail;

import java.util.ArrayList;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.status.StatusLogger;
import org.hibernate.Session;
import org.junit.Test;

import edu.uclm.esi.iso2.multas.dao.HibernateFactory;
import edu.uclm.esi.iso2.multas.domain.Inquiry;
import edu.uclm.esi.iso2.multas.radar.Carretera;
import edu.uclm.esi.iso2.multas.radar.Radar;

public class RadarTest {

	@Test
	public void TestAutovia() {
		StatusLogger.getLogger().setLevel(Level.OFF);
		HibernateFactory.buildIfNeeded();
		Session sessFact = HibernateFactory.getSessionFactory().openSession();

		Radar r = new Radar(Carretera.AUTOVIA);
		ArrayList<Inquiry> infracciones = new ArrayList<Inquiry>();
		infracciones = r.generarInfracciones();

		sessFact.close();

		// recorremos todo la lista
		if (infracciones.size() > 0) {
			for (Inquiry i: infracciones) {
				if (i.getSpeed() <= i.getMaxSpeed()) {
					fail("Se han creado infracciones falsas");
				}
			}
		} else {
			System.out.println("No se han creado infracciones");
		}
	}

	@Test
	public void TestNacional() {
		StatusLogger.getLogger().setLevel(Level.OFF);
		HibernateFactory.buildIfNeeded();
		Session sessFact = HibernateFactory.getSessionFactory().openSession();

		Radar r = new Radar(Carretera.NACIONAL);
		ArrayList<Inquiry> infracciones = new ArrayList<Inquiry>();
		infracciones = r.generarInfracciones();

		sessFact.close();

		// recorremos todo la lista
		if (infracciones.size() > 0) {
			for (Inquiry i: infracciones) {
				if (i.getSpeed() <= i.getMaxSpeed()) {
					fail("Se han creado infracciones falsas");
				}
			}
		} else {
			System.out.println("No se han creado infracciones");
		}
	}

	@Test
	public void TestUrbano() {
		StatusLogger.getLogger().setLevel(Level.OFF);
		HibernateFactory.buildIfNeeded();
		Session sessFact = HibernateFactory.getSessionFactory().openSession();

		Radar r = new Radar(Carretera.URBANA);
		ArrayList<Inquiry> infracciones = new ArrayList<Inquiry>();
		infracciones = r.generarInfracciones();

		sessFact.close();

		// recorremos todo la lista
		if (infracciones.size() > 0) {
			for (Inquiry i: infracciones) {
				if (i.getSpeed() <= i.getMaxSpeed()) {
					fail("Se han creado infracciones falsas");
				}
			}
		} else {
			System.out.println("No se han creado infracciones");
		}
	}
}
