package edu.uclm.esi.iso2.multas.funcionario.presentation;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JTextPane;
import javax.swing.JList;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MenuFuncionarioInterface {

	private JFrame frameMenu;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JButton btnEncenderRadar;
	private JButton btnApagarRadar;
	private JButton btnCambioPropietario;
	private JButton btnSancionar;
	private JButton btnPagoSan;
	private JList listInfractores;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuFuncionarioInterface window = new MenuFuncionarioInterface();
					window.frameMenu.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MenuFuncionarioInterface() {
		initialize();
		
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frameMenu = new JFrame();
		frameMenu.setTitle("Menú Principal DGT");
		frameMenu.setBounds(100, 100, 585, 440);
		frameMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameMenu.getContentPane().setLayout(null);
		
		btnEncenderRadar = new JButton("Encender Radar");
		btnEncenderRadar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btnApagarRadar.setEnabled(true);
				listInfractores.setEnabled(true);
				btnCambioPropietario.setEnabled(true);
				btnPagoSan.setEnabled(true);
				btnSancionar.setEnabled(true);
				btnEncenderRadar.setEnabled(false);
			}
		});
		btnEncenderRadar.setEnabled(false);
		btnEncenderRadar.setBounds(27, 23, 188, 89);
		frameMenu.getContentPane().add(btnEncenderRadar);
		
		JRadioButton rdbtnUrbano = new JRadioButton("Urbano");
		rdbtnUrbano.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnEncenderRadar.setEnabled(true);
			}
		});
		buttonGroup.add(rdbtnUrbano);
		rdbtnUrbano.setBounds(238, 23, 149, 23);
		frameMenu.getContentPane().add(rdbtnUrbano);
		
		JRadioButton rdbtnCarretera = new JRadioButton("Carretera Nacional");
		rdbtnCarretera.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnEncenderRadar.setEnabled(true);
			}
		});
		buttonGroup.add(rdbtnCarretera);
		rdbtnCarretera.setBounds(238, 56, 168, 23);
		frameMenu.getContentPane().add(rdbtnCarretera);
		
		JRadioButton rdbtnAutovia = new JRadioButton("Autovía");
		rdbtnAutovia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnEncenderRadar.setEnabled(true);
			}
		});
		buttonGroup.add(rdbtnAutovia);
		rdbtnAutovia.setBounds(238, 89, 149, 23);
		frameMenu.getContentPane().add(rdbtnAutovia);
				
		
		
		btnApagarRadar = new JButton("Apagar Radar");
		btnApagarRadar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				listInfractores.setEnabled(false);
				btnCambioPropietario.setEnabled(false);
				btnPagoSan.setEnabled(false);
				btnSancionar.setEnabled(false);
				btnEncenderRadar.setEnabled(true);
				btnApagarRadar.setEnabled(false);
			}
		});
		btnApagarRadar.setEnabled(false);
		btnApagarRadar.setBounds(414, 22, 157, 90);
		frameMenu.getContentPane().add(btnApagarRadar);
		
		listInfractores = new JList();
		listInfractores.setBounds(27, 191, 188, 194);
		frameMenu.getContentPane().add(listInfractores);
		
		JLabel lblNewLabel = new JLabel("Infractores Detectados");
		lblNewLabel.setBounds(27, 164, 188, 15);
		frameMenu.getContentPane().add(lblNewLabel);
		
		btnCambioPropietario = new JButton("Cambiar\nPropietario\n");
		btnCambioPropietario.setEnabled(false);
		btnCambioPropietario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CambiarPropietarioInterface.main(null);
			}
		});
		btnCambioPropietario.setBounds(238, 193, 155, 90);
		frameMenu.getContentPane().add(btnCambioPropietario);
		
		btnSancionar = new JButton("Sancionar \nConductor");
		btnSancionar.setEnabled(false);
		btnSancionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SancionarInterface.main(null);
			}
		});
		btnSancionar.setBounds(414, 193, 155, 90);
		frameMenu.getContentPane().add(btnSancionar);
		
		btnPagoSan = new JButton("Pago Sanción");
		btnPagoSan.setEnabled(false);
		btnPagoSan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnPagoSan.setBounds(238, 295, 155, 90);
		frameMenu.getContentPane().add(btnPagoSan);
		
		JLabel lblCaracteristicasMenu = new JLabel("Control de Mando Funcionario DGT");
		lblCaracteristicasMenu.setBounds(286, 164, 263, 15);
		frameMenu.getContentPane().add(lblCaracteristicasMenu);
	}
}
