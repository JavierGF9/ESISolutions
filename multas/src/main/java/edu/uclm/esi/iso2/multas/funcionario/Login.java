package edu.uclm.esi.iso2.multas.funcionario;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Login {
	@Id
	@Column(length=255, nullable=false)
	private String user;
	@Column(length=255, nullable=false)
	private String pass;
	
	public Login() {
	}
	
	public Login(String user) {
		this();
		this.user = user;
	}
	
	public String getPass() {
		return pass;
	}
	
	public boolean validarLogin(String pass) {
		if (pass.equals(pass))
			return true;
		
		return false;
	}
}
