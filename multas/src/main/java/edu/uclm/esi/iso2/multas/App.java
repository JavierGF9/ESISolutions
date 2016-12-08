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
		
		 LoginInterface window=new LoginInterface();
		 window.framePrincipal.setVisible(true);
		 
	

	}

}
