package edu.uclm.esi.iso2.multas;



import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.status.StatusLogger;
import org.hibernate.Session;

import edu.uclm.esi.iso2.multas.dao.HibernateFactory;
import edu.uclm.esi.iso2.multas.domain.Driver;


/**
 * Hello world!
 */
public class App {
	//Para evitar que salgo el error en el log
	static {
	    StatusLogger.getLogger().setLevel(Level.OFF);
	}

	public static void main(String[] args) {
		
		

		HibernateFactory.buildIfNeeded();
		Session sessFact = HibernateFactory.getSessionFactory().openSession();
		org.hibernate.Transaction tr = sessFact.beginTransaction();
		Driver driver = (Driver) sessFact.get(Driver.class, new Integer(200));
		System.out.println("pureba "+driver.getDni()+" ");

		sessFact.close();
	}

}
