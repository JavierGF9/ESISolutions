package edu.uclm.esi.iso2.multas.funcionario.test;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.uclm.esi.iso2.multas.funcionario.*;

public class TestLogin {

	@Test
	public void comprobarUser(){
		Login login = new Login("esi", "esi");
		assertTrue(login.validarLogin() == true);
	}
}
