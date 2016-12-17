package edu.uclm.esi.iso2.multas.domain.test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.status.StatusLogger;
import org.hibernate.Session;
import org.junit.Test;

import edu.uclm.esi.iso2.multas.dao.HibernateFactory;
import edu.uclm.esi.iso2.multas.domain.Inquiry;
import edu.uclm.esi.iso2.multas.radar.Carretera;
import edu.uclm.esi.iso2.multas.radar.Radar;

public class InquiryTest {

	@Test
	public void testPuntos30() {

		StatusLogger.getLogger().setLevel(Level.OFF);
		HibernateFactory.buildIfNeeded();
		Session sessFact = HibernateFactory.getSessionFactory().openSession();

		// Creacion de la clase//
		// Inquiry i= new Inquiry(String license, double speed, String location,
		// double maxSpeed)

		sessFact.close();

		// Comprobar que entre en el if de velocidad maxima 30

	}

	public void testPuntos40() {

		StatusLogger.getLogger().setLevel(Level.OFF);
		HibernateFactory.buildIfNeeded();
		Session sessFact = HibernateFactory.getSessionFactory().openSession();

		// Creacion de la clase
		// Inquiry i= new Inquiry(String license, double speed, String location,
		// double maxSpeed)

		sessFact.close();

		// Comprobar que entre en el if de velocidad maxima 40

	}

	public void testPuntos50() {

		// ***En este debía fallar***//
		StatusLogger.getLogger().setLevel(Level.OFF);
		HibernateFactory.buildIfNeeded();
		Session sessFact = HibernateFactory.getSessionFactory().openSession();

		// Creacion de la clase
		// Inquiry i= new Inquiry(String license, double speed, String location,
		// double maxSpeed)

		sessFact.close();

		// Comprobar que entre en el if de velocidad maxima 50

	}

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
	
public void testCantidad30() {
		
		StatusLogger.getLogger().setLevel(Level.OFF);
		HibernateFactory.buildIfNeeded();
		Session sessFact = HibernateFactory.getSessionFactory().openSession();

		//Creacion de la clase
		//Inquiry i= new Inquiry(String license, double speed, String location, double maxSpeed)
		
		sessFact.close();
		
		//comprobamos todos los rangos en la velocidad
		//comprobamos cada rango con la cantidad que le corresponde
		//AQUI DEBERIA FALLAR AL SOBREPASAR LOS 80!
		
		
	}

public void testCantidad40() {
	
	StatusLogger.getLogger().setLevel(Level.OFF);
	HibernateFactory.buildIfNeeded();
	Session sessFact = HibernateFactory.getSessionFactory().openSession();

	//Creacion de la clase
	//Inquiry i= new Inquiry(String license, double speed, String location, double maxSpeed)
	
	sessFact.close();
	
	//comprobamos todos los rangos en la velocidad
	//comprobamos cada rango con la cantidad que le corresponde
		
	
}

public void testCantidad50() {
	
	StatusLogger.getLogger().setLevel(Level.OFF);
	HibernateFactory.buildIfNeeded();
	Session sessFact = HibernateFactory.getSessionFactory().openSession();

	//Creacion de la clase
	//Inquiry i= new Inquiry(String license, double speed, String location, double maxSpeed)
	
	sessFact.close();
	
	//comprobamos todos los rangos en la velocidad
	//comprobamos cada rango con la cantidad que le corresponde
	
	
	
}

public void testCantidad60() {
	
	StatusLogger.getLogger().setLevel(Level.OFF);
	HibernateFactory.buildIfNeeded();
	Session sessFact = HibernateFactory.getSessionFactory().openSession();

	//Creacion de la clase
	//Inquiry i= new Inquiry(String license, double speed, String location, double maxSpeed)
	
	sessFact.close();
	
	//comprobamos todos los rangos en la velocidad
	//comprobamos cada rango con la cantidad que le corresponde
	
	
	
}

public void testCantidad70() {
	
	StatusLogger.getLogger().setLevel(Level.OFF);
	HibernateFactory.buildIfNeeded();
	Session sessFact = HibernateFactory.getSessionFactory().openSession();

	//Creacion de la clase
	//Inquiry i= new Inquiry(String license, double speed, String location, double maxSpeed)
	
	sessFact.close();
	
	//comprobamos todos los rangos en la velocidad
	//comprobamos cada rango con la cantidad que le corresponde
	
	
	
}

public void testCantidad80() {
	
	StatusLogger.getLogger().setLevel(Level.OFF);
	HibernateFactory.buildIfNeeded();
	Session sessFact = HibernateFactory.getSessionFactory().openSession();

	//Creacion de la clase
	//Inquiry i= new Inquiry(String license, double speed, String location, double maxSpeed)
	
	sessFact.close();
	
	//comprobamos todos los rangos en la velocidad
	//comprobamos cada rango con la cantidad que le corresponde
	
	
	
}

public void testCantidad90() {
	
	StatusLogger.getLogger().setLevel(Level.OFF);
	HibernateFactory.buildIfNeeded();
	Session sessFact = HibernateFactory.getSessionFactory().openSession();

	//Creacion de la clase
	//Inquiry i= new Inquiry(String license, double speed, String location, double maxSpeed)
	
	sessFact.close();
	
	//comprobamos todos los rangos en la velocidad
	//comprobamos cada rango con la cantidad que le corresponde
	
	
	
}

public void testCantidad100() {
	
	StatusLogger.getLogger().setLevel(Level.OFF);
	HibernateFactory.buildIfNeeded();
	Session sessFact = HibernateFactory.getSessionFactory().openSession();

	//Creacion de la clase
	//Inquiry i= new Inquiry(String license, double speed, String location, double maxSpeed)
	
	sessFact.close();
	
	//comprobamos todos los rangos en la velocidad
	//comprobamos cada rango con la cantidad que le corresponde
	
	
	
}

public void testCantidad110() {
	
	StatusLogger.getLogger().setLevel(Level.OFF);
	HibernateFactory.buildIfNeeded();
	Session sessFact = HibernateFactory.getSessionFactory().openSession();

	//Creacion de la clase
	//Inquiry i= new Inquiry(String license, double speed, String location, double maxSpeed)
	
	sessFact.close();
	
	//comprobamos todos los rangos en la velocidad
	//comprobamos cada rango con la cantidad que le corresponde
	
	
	
}

public void testCantidad120() {
	
	StatusLogger.getLogger().setLevel(Level.OFF);
	HibernateFactory.buildIfNeeded();
	Session sessFact = HibernateFactory.getSessionFactory().openSession();

	//Creacion de la clase
	//Inquiry i= new Inquiry(String license, double speed, String location, double maxSpeed)
	
	sessFact.close();
	
	//comprobamos todos los rangos en la velocidad
	//comprobamos cada rango con la cantidad que le corresponde
	
	
	
}
}
