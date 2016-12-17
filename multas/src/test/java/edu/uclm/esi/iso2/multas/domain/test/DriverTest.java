package edu.uclm.esi.iso2.multas.domain.test;

import static org.junit.Assert.*;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.status.StatusLogger;
import org.hibernate.Session;
import org.junit.Test;

import edu.uclm.esi.iso2.multas.dao.HibernateFactory;

public class DriverTest {

	@Test
	public void puntosTest() {
		StatusLogger.getLogger().setLevel(Level.OFF);
		HibernateFactory.buildIfNeeded();
		Session sessFact = HibernateFactory.getSessionFactory().openSession();

		//Creacion de la clase
		//Driver d= new Driver(String dni, String name, String lastName, String fullAddress)
		
		sessFact.close();
		
		//comprobamos que si los puntos pasan de 12 o bajan de 0, éstos sean los valores máximos
	}

}
