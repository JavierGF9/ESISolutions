package edu.uclm.esi.iso2.multas.domain.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Iterator;

import org.junit.Test;

import edu.uclm.esi.iso2.multas.dao.OwnerDao;
import edu.uclm.esi.iso2.multas.dao.VehicleDao;
import edu.uclm.esi.iso2.multas.domain.Inquiry;
import edu.uclm.esi.iso2.multas.domain.Owner;
import edu.uclm.esi.iso2.multas.domain.Vehicle;

public class VehicleTest {

	@Test
	public void testVehiculoBBDD() {
		VehicleDao dao = new VehicleDao();
		Vehicle v = dao.findByLicense("0143");
		
		assertEquals(v.getOwner().getDni(), "5000045");
		
		System.out.printf("Vehículo con matrícula %s\n", v.getLicense());
		System.out.printf("Perteneciente a: %s, %s\n", v.getOwner().getLastName(), v.getOwner().getName());
		System.out.printf("DNI: %s\n", v.getOwner().getDni());
		System.out.printf("Dirección: %s\n", v.getOwner().getFullAddress());
		
//		Iterator<Vehicle> it = v.getOwner().getVehicles().iterator();
//		System.out.println("Propietario de vehículos:");
//		while (it.hasNext()) {
//			System.out.printf("\t%s\n", it.next().getLicense());
//		}
//		
//		Iterator<Inquiry> it2 = v.getOwner().getInquiries().iterator();
//		System.out.println("ID de los expedientes:");
//		while (it2.hasNext()) {
//			System.out.printf("\t%s\n", it2.next().getId());
//		}
	}
	
	@Test
	public void cambiarPropietario() {
		VehicleDao dao = new VehicleDao();
		Vehicle v = dao.findByLicense("0143");
		Vehicle v1 = dao.findByLicense("0145");
		
		v.setOwner(v1.getOwner());
		
		String dni = v1.getOwner().getDni();
		
		dao.update(v);
		
		Vehicle v2 = dao.findByLicense("0143");
		assertEquals(v2.getOwner().getDni(), dni);
	}
	
	@Test
	public void testVehiculoEquals() {
		VehicleDao dao = new VehicleDao();
		Vehicle v1 = dao.findByLicense("0143");
		Vehicle v2 = dao.findByLicense("0143");
		
		assertTrue(v1.equals(v2));
		
		v2 = dao.findByLicense("0144");
		assertFalse(v1.equals(v2));
		
		int i = 2;
		assertFalse(v1.equals(i));
	}
}