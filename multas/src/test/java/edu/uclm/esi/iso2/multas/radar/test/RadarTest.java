package edu.uclm.esi.iso2.multas.radar.test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.ArrayList;

import org.junit.Test;

import edu.uclm.esi.iso2.multas.domain.Inquiry;
import edu.uclm.esi.iso2.multas.radar.Carretera;
import edu.uclm.esi.iso2.multas.radar.Radar;

public class RadarTest {

	@Test
	public void TestAutovia() {
		Radar r = new Radar(Carretera.AUTOVIA);
		ArrayList<Inquiry> infracciones = new ArrayList<Inquiry>();
		infracciones = r.generarInfracciones();

		// recorremos todo la lista
		if (infracciones.size() > 0) {
			for (Inquiry i: infracciones) {
				assertTrue(i.getSpeed() > i.getMaxSpeed());
			}
		} else {
			System.out.println("No se han creado infracciones");
		}
	}

	@Test
	public void TestNacional() {
		Radar r = new Radar(Carretera.NACIONAL);
		ArrayList<Inquiry> infracciones = new ArrayList<Inquiry>();
		infracciones = r.generarInfracciones();

		// recorremos todo la lista
		if (infracciones.size() > 0) {
			for (Inquiry i: infracciones) {
				assertTrue(i.getSpeed() > i.getMaxSpeed());
			}
		} else {
			System.out.println("No se han creado infracciones");
		}
	}

	@Test
	public void TestUrbano() {
		Radar r = new Radar(Carretera.URBANA);
		ArrayList<Inquiry> infracciones = new ArrayList<Inquiry>();
		infracciones = r.generarInfracciones();

		// recorremos todo la lista
		if (infracciones.size() > 0) {
			for (Inquiry i: infracciones) {
				assertTrue(i.getSpeed() > i.getMaxSpeed());
			}
		} else {
			System.out.println("No se han creado infracciones");
		}
	}
}
