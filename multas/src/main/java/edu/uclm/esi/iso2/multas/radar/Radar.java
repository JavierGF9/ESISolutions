package edu.uclm.esi.iso2.multas.radar;

import java.util.ArrayList;

import edu.uclm.esi.iso2.multas.domain.Inquiry;

public class Radar {
	
	private boolean encendido;
	private Carretera tipoCarretera;
	
	public Radar(Carretera tipoCarretera) {
		encendido = true;
		this.tipoCarretera = tipoCarretera;
	}
	
	public void apagarRadar() {
		encendido = false;
	}
	
	public void encenderRadar() {
		encendido = true;
	}
	
	public ArrayList<Inquiry> generarInfracciones() {
		ArrayList<Inquiry> listaInfracciones = new ArrayList<Inquiry>();
		
		// Si está apagado no hace nada
		if (!encendido) return listaInfracciones;
		
		int numGenerados = 1 + (int) (Math.random() * 50);
		
		for (int i = 0; i < numGenerados; i++) {
			String id = new String();
			id += String.valueOf((int) (Math.random() * 2));
			id += String.valueOf((int) (Math.random() * 9));
			id += String.valueOf((int) (Math.random() * 9));
			id += String.valueOf((int) (Math.random() * 9));
			
			int velocidad;
			if (tipoCarretera == Carretera.URBANA) {
				velocidad = 15 + (int) (Math.random() * 55);
			} else if (tipoCarretera == Carretera.NACIONAL) {
				velocidad = 60 + (int) (Math.random() * 70);
			} else {
				velocidad = 80 + (int) (Math.random() * 80);
			}
			
			if (esInfraccion(velocidad)) {
				listaInfracciones.add(new Inquiry(id, velocidad, tipoCarretera.name(), getMaxVelocidad()));
			}
		}
		
		return listaInfracciones;
	}
	
	private boolean esInfraccion(int velocidad) {
		if (tipoCarretera == Carretera.URBANA) {
			if (velocidad > 50) return true;
		} else if (tipoCarretera == Carretera.NACIONAL) {
			if (velocidad > 100) return true;
		} else {
			if (velocidad > 120) return true;
		}
		return false;
	}
	
	private int getMaxVelocidad() {
		if (tipoCarretera == Carretera.URBANA) {
			return 50;
		} else if (tipoCarretera == Carretera.NACIONAL) {
			return 100;
		} else {
			return 120;
		}
	}
}
