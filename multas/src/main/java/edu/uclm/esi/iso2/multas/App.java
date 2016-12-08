package edu.uclm.esi.iso2.multas;



import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.status.StatusLogger;
import org.hibernate.Session;

import edu.uclm.esi.iso2.multas.dao.*;
import edu.uclm.esi.iso2.multas.domain.*;



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
		
		
		List<Driver> conductores = null;
		DriverDao driverdao = new DriverDao();
		conductores=driverdao.findAll(Driver.class);
		System.out.println("Primer conductor Dni "+conductores.get(1).getDni()+" Nombre "+conductores.get(1).getName());
		
		
	
		}
	
	
		

}
