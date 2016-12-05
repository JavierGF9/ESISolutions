package edu.uclm.esi.iso2.multas.funcionario.test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

import edu.uclm.esi.iso2.multas.funcionario.Login;

public class LoginTest {

	@Test
	public void validarTest() {
		try{
			Login log = new Login("esi");
			assertTrue(log.validarLogin("esi"));
		} catch (Exception e) {
			fail(e.toString());
		}
	}
}
