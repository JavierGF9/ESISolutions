package edu.uclm.esi.iso2.multas.domain.test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

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
	public void testPuntos30() {
		StatusLogger.getLogger().setLevel(Level.OFF);
		HibernateFactory.buildIfNeeded();
		Session sessFact = HibernateFactory.getSessionFactory().openSession();

		Inquiry i = new Inquiry("0100", 70.0, Carretera.URBANA.name(), 30.0);
		Sanction s = i.createSanctionFor(i.getOwner().getDni());
		
		sessFact.close();
		
		assertTrue(s.getAmount() == 600);
		fail("La cantidad no es la que debería ser");
	}

	@Test
	public void testPuntos50() {
		StatusLogger.getLogger().setLevel(Level.OFF);
		HibernateFactory.buildIfNeeded();
		Session sessFact = HibernateFactory.getSessionFactory().openSession();

		Inquiry i = new Inquiry("0100", 70.0, Carretera.URBANA.name(), 50.0);
		Sanction s = i.createSanctionFor(i.getOwner().getDni());
		
		sessFact.close();
	}

	@Test
	public void testPuntos60() {

		StatusLogger.getLogger().setLevel(Level.OFF);
		HibernateFactory.buildIfNeeded();
		Session sessFact = HibernateFactory.getSessionFactory().openSession();

		// Creacion de la clase
		// Inquiry i= new Inquiry(String license, double speed, String location,
		// double maxSpeed)

		sessFact.close();

		// Comprobar que entre en el if de velocidad maxima 60

	}

	@Test
	public void testPuntos70() {

		StatusLogger.getLogger().setLevel(Level.OFF);
		HibernateFactory.buildIfNeeded();
		Session sessFact = HibernateFactory.getSessionFactory().openSession();

		// Creacion de la clase
		// Inquiry i= new Inquiry(String license, double speed, String location,
		// double maxSpeed)

		sessFact.close();

		// Comprobar que entre en el if de velocidad maxima 70

	}

	@Test
	public void testPuntos80() {

		StatusLogger.getLogger().setLevel(Level.OFF);
		HibernateFactory.buildIfNeeded();
		Session sessFact = HibernateFactory.getSessionFactory().openSession();

		// Creacion de la clase
		// Inquiry i= new Inquiry(String license, double speed, String location,
		// double maxSpeed)

		sessFact.close();

		// Comprobar que entre en el if de velocidad maxima 80

	}

	@Test
	public void testPuntos90() {

		StatusLogger.getLogger().setLevel(Level.OFF);
		HibernateFactory.buildIfNeeded();
		Session sessFact = HibernateFactory.getSessionFactory().openSession();

		// Creacion de la clase
		// Inquiry i= new Inquiry(String license, double speed, String location,
		// double maxSpeed)

		sessFact.close();

		// Comprobar que entre en el if de velocidad maxima 90

	}
	
	@Test
	public void testPuntos100() {

		StatusLogger.getLogger().setLevel(Level.OFF);
		HibernateFactory.buildIfNeeded();
		Session sessFact = HibernateFactory.getSessionFactory().openSession();

		// Creacion de la clase
		// Inquiry i= new Inquiry(String license, double speed, String location,
		// double maxSpeed)

		sessFact.close();

		// Comprobar que entre en el if de velocidad maxima 100

	}

	@Test
	public void testPuntos110() {

		StatusLogger.getLogger().setLevel(Level.OFF);
		HibernateFactory.buildIfNeeded();
		Session sessFact = HibernateFactory.getSessionFactory().openSession();

		// Creacion de la clase
		// Inquiry i= new Inquiry(String license, double speed, String location,
		// double maxSpeed)

		sessFact.close();

		// Comprobar que entre en el if de velocidad maxima 110

	}

	@Test
	public void testPuntos120() {

		StatusLogger.getLogger().setLevel(Level.OFF);
		HibernateFactory.buildIfNeeded();
		Session sessFact = HibernateFactory.getSessionFactory().openSession();

		// Creacion de la clase
		// Inquiry i= new Inquiry(String license, double speed, String location,
		// double maxSpeed)

		sessFact.close();

		// Comprobar que entre en el if de velocidad maxima 120

	}

	@Test
	public void testCantidad30() {

		StatusLogger.getLogger().setLevel(Level.OFF);
		HibernateFactory.buildIfNeeded();
		Session sessFact = HibernateFactory.getSessionFactory().openSession();

		// Creacion de la clase
		// Inquiry i= new Inquiry(String license, double speed, String location,
		// double maxSpeed)

		sessFact.close();

		// comprobamos todos los rangos en la velocidad
		// comprobamos cada rango con la cantidad que le corresponde
		// AQUI DEBERIA FALLAR AL SOBREPASAR LOS 80!

	}

	@Test
	public void testCantidad40() {

		StatusLogger.getLogger().setLevel(Level.OFF);
		HibernateFactory.buildIfNeeded();
		Session sessFact = HibernateFactory.getSessionFactory().openSession();

		// Creacion de la clase
		// Inquiry i= new Inquiry(String license, double speed, String location,
		// double maxSpeed)

		sessFact.close();

		// comprobamos todos los rangos en la velocidad
		// comprobamos cada rango con la cantidad que le corresponde

	}

	@Test
	public void testCantidad50() {

		StatusLogger.getLogger().setLevel(Level.OFF);
		HibernateFactory.buildIfNeeded();
		Session sessFact = HibernateFactory.getSessionFactory().openSession();

		// Creacion de la clase
		// Inquiry i= new Inquiry(String license, double speed, String location,
		// double maxSpeed)

		sessFact.close();

		// comprobamos todos los rangos en la velocidad
		// comprobamos cada rango con la cantidad que le corresponde

	}

	@Test
	public void testCantidad60() {

		StatusLogger.getLogger().setLevel(Level.OFF);
		HibernateFactory.buildIfNeeded();
		Session sessFact = HibernateFactory.getSessionFactory().openSession();

		// Creacion de la clase
		// Inquiry i= new Inquiry(String license, double speed, String location,
		// double maxSpeed)

		sessFact.close();

		// comprobamos todos los rangos en la velocidad
		// comprobamos cada rango con la cantidad que le corresponde

	}

	@Test
	public void testCantidad70() {

		StatusLogger.getLogger().setLevel(Level.OFF);
		HibernateFactory.buildIfNeeded();
		Session sessFact = HibernateFactory.getSessionFactory().openSession();

		// Creacion de la clase
		// Inquiry i= new Inquiry(String license, double speed, String location,
		// double maxSpeed)

		sessFact.close();

		// comprobamos todos los rangos en la velocidad
		// comprobamos cada rango con la cantidad que le corresponde

	}

	@Test
	public void testCantidad80() {

		StatusLogger.getLogger().setLevel(Level.OFF);
		HibernateFactory.buildIfNeeded();
		Session sessFact = HibernateFactory.getSessionFactory().openSession();

		// Creacion de la clase
		// Inquiry i= new Inquiry(String license, double speed, String location,
		// double maxSpeed)

		sessFact.close();

		// comprobamos todos los rangos en la velocidad
		// comprobamos cada rango con la cantidad que le corresponde

	}

	@Test
	public void testCantidad90() {

		StatusLogger.getLogger().setLevel(Level.OFF);
		HibernateFactory.buildIfNeeded();
		Session sessFact = HibernateFactory.getSessionFactory().openSession();

		// Creacion de la clase
		// Inquiry i= new Inquiry(String license, double speed, String location,
		// double maxSpeed)

		sessFact.close();

		// comprobamos todos los rangos en la velocidad
		// comprobamos cada rango con la cantidad que le corresponde

	}

	@Test
	public void testCantidad100() {

		StatusLogger.getLogger().setLevel(Level.OFF);
		HibernateFactory.buildIfNeeded();
		Session sessFact = HibernateFactory.getSessionFactory().openSession();

		// Creacion de la clase
		// Inquiry i= new Inquiry(String license, double speed, String location,
		// double maxSpeed)

		sessFact.close();

		// comprobamos todos los rangos en la velocidad
		// comprobamos cada rango con la cantidad que le corresponde

	}

	@Test
	public void testCantidad110() {

		StatusLogger.getLogger().setLevel(Level.OFF);
		HibernateFactory.buildIfNeeded();
		Session sessFact = HibernateFactory.getSessionFactory().openSession();

		// Creacion de la clase
		// Inquiry i= new Inquiry(String license, double speed, String location,
		// double maxSpeed)

		sessFact.close();

		// comprobamos todos los rangos en la velocidad
		// comprobamos cada rango con la cantidad que le corresponde

	}

	@Test
	public void testCantidad120() {

		StatusLogger.getLogger().setLevel(Level.OFF);
		HibernateFactory.buildIfNeeded();
		Session sessFact = HibernateFactory.getSessionFactory().openSession();

		// Creacion de la clase
		// Inquiry i= new Inquiry(String license, double speed, String location,
		// double maxSpeed)

		sessFact.close();

		// comprobamos todos los rangos en la velocidad
		// comprobamos cada rango con la cantidad que le corresponde

	}
}
