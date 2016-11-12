package edu.uclm.esi.iso2.multas.funcionario;


import edu.uclm.esi.iso2.multas.dao.LoginDao;


public class Login {
	protected LoginDao logindao;
	protected String usuario;
	protected String contrasena;
	
	public Login(String usuario, String contrasena){
		this.usuario=usuario;
		this.contrasena=contrasena;
	}
	
	public boolean validarLogin(){
		boolean existe=false;
			if((usuario==logindao.findByUser(usuario)) && (contrasena==logindao.findByPass(contrasena))){
				existe=true;
			}
		return existe;
	}
	
}
