package edu.uclm.esi.iso2.multas;



import org.hibernate.Session;


import edu.uclm.esi.iso2.multas.dao.HibernateFactory;
import edu.uclm.esi.iso2.multas.domain.Driver;
import edu.uclm.esi.iso2.multas.domain.Vehicle;


/**
 * Hello world!
 
 */
public class App {
	
	public static void main(String[] args) {
		
		
		HibernateFactory.buildIfNeeded();
		Session sessFact = HibernateFactory.getSessionFactory().openSession();
		org.hibernate.Transaction tr = sessFact.beginTransaction();
		Driver driver = (Driver) sessFact.get(Driver.class, new Integer(10));
		System.out.println("pureba"+driver.getDni()+" "+driver.getName());

		sessFact.close();
		
		

		System.out.println("Hibernateeeeeeeeeeeeeee");
	

		
	
	}

}
