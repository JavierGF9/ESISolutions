package edu.uclm.esi.iso2.multas.funcionario.presentation;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class LoginInterface {

	private JFrame framePrincipal;
	private JLabel lblTitulo;
	private JLabel lblUsuario;
	private JLabel lblContrasea;
	private JButton btnLogin;
	private JButton btnExit;
	private JTextField txtFieldUser;
	private JTextField txtFieldPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginInterface window = new LoginInterface();
					window.framePrincipal.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LoginInterface() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		framePrincipal = new JFrame();
		framePrincipal.setTitle("DGT by ESISolutions");
		framePrincipal.setBounds(100, 100, 450, 300);
		framePrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		framePrincipal.getContentPane().setLayout(null);
		
		lblTitulo = new JLabel("Bienvenido al programa de seguimiento DGT ");
		lblTitulo.setBounds(55, 12, 332, 15);
		framePrincipal.getContentPane().add(lblTitulo);
		
		lblUsuario = new JLabel("Usuario");
		lblUsuario.setBounds(55, 110, 70, 15);
		framePrincipal.getContentPane().add(lblUsuario);
		
		lblContrasea = new JLabel("Contraseña");
		lblContrasea.setBounds(55, 153, 103, 15);
		framePrincipal.getContentPane().add(lblContrasea);
		
		txtFieldUser = new JTextField();
		txtFieldUser.setBounds(193, 108, 114, 19);
		framePrincipal.getContentPane().add(txtFieldUser);
		txtFieldUser.setColumns(10);
		
		txtFieldPassword = new JTextField();
		txtFieldPassword.setBounds(193, 151, 114, 19);
		framePrincipal.getContentPane().add(txtFieldPassword);
		txtFieldPassword.setColumns(10);
		
		btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if((txtFieldUser.getText().equals("esi"))&&(txtFieldPassword.getText().equals("esi"))){
					//MenuFuncionarioInterface frameMenu=new MenuFuncionarioInterface();
					MenuFuncionarioInterface.main(null);
				}else{
					JOptionPane.showMessageDialog(null,"Error, Usuario/Contraseña Incorrecta :-(");
				}
			}
		});
		btnLogin.setBounds(55, 218, 117, 25);
		framePrincipal.getContentPane().add(btnLogin);
		
		btnExit = new JButton("Salir");
		btnExit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				framePrincipal.dispose();
			}
		});
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			}
		});
		btnExit.setBounds(242, 218, 117, 25);
		framePrincipal.getContentPane().add(btnExit);
	}
}
