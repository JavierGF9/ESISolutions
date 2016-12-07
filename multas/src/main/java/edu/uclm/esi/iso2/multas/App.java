package edu.uclm.esi.iso2.multas;

import org.hibernate.Session;

import edu.uclm.esi.iso2.multas.dao.HibernateFactory;
import edu.uclm.esi.iso2.multas.domain.Driver;


/**
 * Hello world!
 
 */
public class App {
	private static Session session;
	
	public static void main(String[] args) {
		
		session=HibernateFactory.getSessionFactory().openSession();
		
		Driver contact = (Driver) session.get(Driver.class, new Integer(3));
		System.out.println(contact.getName());
		
		
		
	}
}
