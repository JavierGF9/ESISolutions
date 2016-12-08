package edu.uclm.esi.iso2.multas;

import edu.uclm.esi.iso2.multas.funcionario.presentation.*;
import edu.uclm.esi.iso2.multas.radar.Carretera;
import edu.uclm.esi.iso2.multas.radar.Radar;

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
	// Para evitar que salgo el error en el log
	static {
		StatusLogger.getLogger().setLevel(Level.OFF);
	}

	public static void main(String[] args) {

		HibernateFactory.buildIfNeeded();
		Session sessFact = HibernateFactory.getSessionFactory().openSession();

		
		 LoginInterface window=new LoginInterface();
		 window.framePrincipal.setVisible(true);
		 
		 /*
		DriverDao driverDao = new DriverDao();
		List<Driver> conductores = driverDao.findAll(Driver.class);

		VehicleDao vehiculoDao = new VehicleDao();
		List<Vehicle> vehiculos = vehiculoDao.findAll(Vehicle.class);

		OwnerDao propietarioDao = new OwnerDao();
		List<Owner> propietarios = propietarioDao.findAll(Owner.class);
		*/
		
		/*
		Radar radar =new Radar(Carretera.AUTOVIA);
		radar.encenderRadar();
		ArrayList<Inquiry> sanciones =radar.generarInfracciones();
		for(int i=0;i<sanciones.size();i++){
		System.out.println(sanciones.get(i).toString());
		}
		*/
		
		/*
		for (int i = 0; i < propietarios.size(); i++) {
					System.out.println("CONDUCTOR " + conductores.get(i).getName());
					System.out.println("propietario " + propietarios.get(i).getName());
				
			
		}

		System.out.println(vehiculos.get(1).getLicense());
		System.out.println(
				"Primer conductor Dni " + conductores.get(1).getDni() + " Nombre " + conductores.get(1).getName());
		 */
		//sessFact.close();

	}

}
