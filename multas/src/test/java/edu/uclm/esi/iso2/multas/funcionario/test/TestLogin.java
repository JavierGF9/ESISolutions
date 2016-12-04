package edu.uclm.esi.iso2.multas.funcionario.test;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import edu.uclm.esi.iso2.multas.funcionario.*;

public class TestLogin {

	
	public boolean comprobarUser(Login login){
		boolean comprobar=false;
		if(login.getUsuario()=="esi"){
			comprobar=true;
		}
		return comprobar;
	}
	
	
}
