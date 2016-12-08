package edu.uclm.esi.iso2.multas.funcionario.presentation;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SancionarInterface {

	public JFrame frmSancionarConductor;
	private JTextField txtFieldConductor;
	private JTextField txtFieldVehiculo;
	private JTextField txtFieldVelocidad;
	private JTextField txtFieldImporte;
	private JTextField txtFieldPuntos;
	private static String nombreSancionado;
	private static String vehiculo;
	private static double velocidad;
	private static String importe;
	private static String puntos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SancionarInterface window = new SancionarInterface(nombreSancionado,vehiculo,velocidad,importe,puntos);
					window.frmSancionarConductor.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SancionarInterface(String nombreSancionado,String vehiculo,double velocidad,String importe, String puntos) {
		this.nombreSancionado=nombreSancionado;
		this.vehiculo=vehiculo;
		this.velocidad=velocidad;
		this.importe=importe;
		this.puntos=puntos;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSancionarConductor = new JFrame();
		frmSancionarConductor.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmSancionarConductor.setResizable(false);
		frmSancionarConductor.setTitle("Sancionar Conductor");
		frmSancionarConductor.setBounds(100, 100, 450, 300);
		frmSancionarConductor.getContentPane().setLayout(null);
		
		JLabel lblConductor = new JLabel("Conductor");
		lblConductor.setBounds(28, 44, 83, 15);
		frmSancionarConductor.getContentPane().add(lblConductor);
		
		txtFieldConductor = new JTextField();
		txtFieldConductor.setEditable(false);
		txtFieldConductor.setBounds(115, 42, 221, 19);
		frmSancionarConductor.getContentPane().add(txtFieldConductor);
		txtFieldConductor.setColumns(10);
		txtFieldConductor.setText(nombreSancionado);
		JLabel lblVehculo = new JLabel("Vehículo");
		lblVehculo.setBounds(28, 79, 70, 15);
		frmSancionarConductor.getContentPane().add(lblVehculo);
		
		txtFieldVehiculo = new JTextField();
		txtFieldVehiculo.setEditable(false);
		txtFieldVehiculo.setBounds(115, 73, 221, 19);
		frmSancionarConductor.getContentPane().add(txtFieldVehiculo);
		txtFieldVehiculo.setColumns(10);
		txtFieldVehiculo.setText(vehiculo);
		
		JLabel lblVelocidad = new JLabel("Velocidad");
		lblVelocidad.setBounds(28, 111, 70, 15);
		frmSancionarConductor.getContentPane().add(lblVelocidad);
		
		txtFieldVelocidad = new JTextField();
		txtFieldVelocidad.setEditable(false);
		txtFieldVelocidad.setBounds(115, 104, 221, 19);
		frmSancionarConductor.getContentPane().add(txtFieldVelocidad);
		txtFieldVelocidad.setColumns(10);
		String velocidadfinal=velocidad+" ";
		txtFieldVelocidad.setText(velocidadfinal);
		JLabel lblImporte = new JLabel("Importe");
		lblImporte.setBounds(28, 139, 70, 15);
		frmSancionarConductor.getContentPane().add(lblImporte);
		
		txtFieldImporte = new JTextField();
		txtFieldImporte.setEditable(false);
		txtFieldImporte.setBounds(115, 135, 221, 19);
		frmSancionarConductor.getContentPane().add(txtFieldImporte);
		txtFieldImporte.setColumns(10);
		txtFieldImporte.setText(importe);
		
		JLabel lblPuntosARetirar = new JLabel("Puntos");
		lblPuntosARetirar.setBounds(28, 166, 70, 15);
		frmSancionarConductor.getContentPane().add(lblPuntosARetirar);
		
		txtFieldPuntos = new JTextField();
		txtFieldPuntos.setEditable(false);
		txtFieldPuntos.setBounds(115, 166, 221, 19);
		frmSancionarConductor.getContentPane().add(txtFieldPuntos);
		txtFieldPuntos.setColumns(10);
		txtFieldPuntos.setText(puntos);
		
		JButton btnSancionar = new JButton("Sancionar");
		btnSancionar.setBounds(61, 215, 117, 25);
		frmSancionarConductor.getContentPane().add(btnSancionar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmSancionarConductor.dispose();
			}
		});
		btnCancelar.setBounds(220, 215, 117, 25);
		frmSancionarConductor.getContentPane().add(btnCancelar);
	}

}
