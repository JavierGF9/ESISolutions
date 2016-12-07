package edu.uclm.esi.iso2.multas;

import org.hibernate.Session;

import edu.uclm.esi.iso2.multas.persistencia.HibernateUtils;

/**
 * Hello world!
 
 */
public class App {
	private static Session session;
	
	public static void main(String[] args) {
		
		session=HibernateUtils.getSessionFactory().openSession();
		
		
		
	}
}
