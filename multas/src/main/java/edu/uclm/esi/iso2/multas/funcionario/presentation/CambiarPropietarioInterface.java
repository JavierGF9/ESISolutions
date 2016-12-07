package edu.uclm.esi.iso2.multas.funcionario.presentation;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CambiarPropietarioInterface {

	private JFrame frmCambiarPropietario;
	private JTextField txtFieldNuevo;
	private JLabel lblActualPropietario;
	private JButton btnCancelar;
	private JButton btnConfirmar;
	private JTextField txtFieldActual;
	private JLabel lblNuevoPropietario;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CambiarPropietarioInterface window = new CambiarPropietarioInterface();
					window.frmCambiarPropietario.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CambiarPropietarioInterface() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCambiarPropietario = new JFrame();
		frmCambiarPropietario.setTitle("Cambiar Propietario");
		frmCambiarPropietario.setBounds(100, 100, 450, 300);
		frmCambiarPropietario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCambiarPropietario.getContentPane().setLayout(null);
		
		lblActualPropietario = new JLabel("Actual Propietario: ");
		lblActualPropietario.setBounds(32, 47, 142, 15);
		frmCambiarPropietario.getContentPane().add(lblActualPropietario);
		
		lblNuevoPropietario = new JLabel("Nuevo Propietario:");
		lblNuevoPropietario.setBounds(32, 86, 142, 15);
		frmCambiarPropietario.getContentPane().add(lblNuevoPropietario);
		
		txtFieldActual = new JTextField();
		txtFieldActual.setEditable(false);
		txtFieldActual.setBounds(192, 45, 223, 19);
		frmCambiarPropietario.getContentPane().add(txtFieldActual);
		txtFieldActual.setColumns(10);
		
		txtFieldNuevo = new JTextField();
		txtFieldNuevo.setBounds(192, 84, 223, 19);
		frmCambiarPropietario.getContentPane().add(txtFieldNuevo);
		txtFieldNuevo.setColumns(10);
		
		btnConfirmar = new JButton("Confirmar");
		btnConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnConfirmar.setBounds(45, 157, 146, 44);
		frmCambiarPropietario.getContentPane().add(btnConfirmar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmCambiarPropietario.dispose();
			}
		});
		btnCancelar.setBounds(230, 157, 146, 44);
		frmCambiarPropietario.getContentPane().add(btnCancelar);
	}

}
