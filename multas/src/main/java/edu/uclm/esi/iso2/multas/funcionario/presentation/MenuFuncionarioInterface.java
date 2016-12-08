package edu.uclm.esi.iso2.multas.funcionario.presentation;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JList;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import edu.uclm.esi.iso2.multas.dao.DriverDao;
import edu.uclm.esi.iso2.multas.domain.Driver;
import edu.uclm.esi.iso2.multas.domain.Inquiry;
import edu.uclm.esi.iso2.multas.domain.Sanction;
import edu.uclm.esi.iso2.multas.radar.*;

import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.AbstractListModel;

public class MenuFuncionarioInterface {
	private Carretera carretera;
	private JFrame frameMenu;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JButton btnEncenderRadar;
	private JButton btnApagarRadar;
	private JButton btnCambioPropietario;
	private JButton btnSancionar;
	private JButton btnPagoSan;
	private JList listInfractores;
	private JRadioButton rdbtnUrbano;
	private JRadioButton rdbtnCarretera;
	private JRadioButton rdbtnAutovia;
	private ArrayList<Inquiry> infracciones = new ArrayList<Inquiry>();
	private DefaultListModel modelLista = new DefaultListModel();
	private Radar radar;

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
		frameMenu.setResizable(false);
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
				modelLista.removeAllElements();
				btnEncenderRadar.setEnabled(false);
				rdbtnUrbano.setEnabled(false);
				rdbtnCarretera.setEnabled(false);
				rdbtnAutovia.setEnabled(false);
				Radar radar = new Radar(carretera);
				radar.encenderRadar();
				infracciones = radar.generarInfracciones();
				for (int i = 0; i < infracciones.size(); i++) {
					modelLista.addElement("Matricula: " + infracciones.get(i).getLicense() + " Nombre: "
							+ infracciones.get(i).getOwner().getName() + " "
							+ infracciones.get(i).getOwner().getLastName());

				}

			}
		});
		btnEncenderRadar.setEnabled(false);
		btnEncenderRadar.setBounds(27, 23, 188, 89);
		frameMenu.getContentPane().add(btnEncenderRadar);

		rdbtnUrbano = new JRadioButton("Urbano");
		rdbtnUrbano.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnEncenderRadar.setEnabled(true);
				carretera = carretera.URBANA;
			}
		});
		buttonGroup.add(rdbtnUrbano);
		rdbtnUrbano.setBounds(238, 23, 149, 23);
		frameMenu.getContentPane().add(rdbtnUrbano);

		rdbtnCarretera = new JRadioButton("Carretera Nacional");
		rdbtnCarretera.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnEncenderRadar.setEnabled(true);
				carretera = carretera.NACIONAL;
			}
		});
		buttonGroup.add(rdbtnCarretera);
		rdbtnCarretera.setBounds(238, 56, 168, 23);
		frameMenu.getContentPane().add(rdbtnCarretera);

		rdbtnAutovia = new JRadioButton("Autovía");
		rdbtnAutovia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnEncenderRadar.setEnabled(true);
				carretera = carretera.AUTOVIA;
			}
		});
		buttonGroup.add(rdbtnAutovia);
		rdbtnAutovia.setBounds(238, 89, 149, 23);
		frameMenu.getContentPane().add(rdbtnAutovia);

		btnApagarRadar = new JButton("Apagar Radar");
		btnApagarRadar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btnCambioPropietario.setEnabled(false);
				btnPagoSan.setEnabled(false);
				btnSancionar.setEnabled(false);
				btnEncenderRadar.setEnabled(true);
				btnApagarRadar.setEnabled(false);
				rdbtnUrbano.setEnabled(true);
				rdbtnCarretera.setEnabled(true);
				rdbtnAutovia.setEnabled(true);

			}
		});
		btnApagarRadar.setEnabled(false);
		btnApagarRadar.setBounds(414, 22, 157, 90);
		frameMenu.getContentPane().add(btnApagarRadar);

		JLabel lblNewLabel = new JLabel("Infractores Detectados");
		lblNewLabel.setBounds(27, 164, 188, 15);
		frameMenu.getContentPane().add(lblNewLabel);

		btnCambioPropietario = new JButton("Cambiar\nPropietario\n");
		btnCambioPropietario.setEnabled(false);
		btnCambioPropietario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int index = listInfractores.getSelectedIndex();
				String cambioPropietario = infracciones.get(index).getOwner().getName() + " "
						+ infracciones.get(index).getOwner().getLastName();
				System.out.println(cambioPropietario);
				CambiarPropietarioInterface ventanaCambio = new CambiarPropietarioInterface(cambioPropietario);
				ventanaCambio.frmCambiarPropietario.setVisible(true);

			}
		});
		btnCambioPropietario.setBounds(238, 193, 155, 90);
		frameMenu.getContentPane().add(btnCambioPropietario);

		btnSancionar = new JButton("Sancionar \nConductor");
		btnSancionar.setEnabled(false);
		btnSancionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int index = listInfractores.getSelectedIndex();
				Sanction sancion = infracciones.get(index).createSanctionFor(infracciones.get(index).getOwner().getDni());
				String nombreSancionado = infracciones.get(index).getOwner().getName() + " "
						+ infracciones.get(index).getOwner().getLastName();
				String vehiculo = infracciones.get(index).getLicense();
				double velocidad = infracciones.get(index).getSpeed();
				double importe = sancion.getAmount();
				int puntos = sancion.getPoints();

				SancionarInterface ventanaCambio = new SancionarInterface(nombreSancionado, vehiculo, velocidad,
						String.valueOf(importe), String.valueOf(puntos));
				ventanaCambio.frmSancionarConductor.setVisible(true);
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

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(26, 206, 189, 173);
		frameMenu.getContentPane().add(scrollPane);

		listInfractores = new JList();

		listInfractores.setModel(modelLista);

		listInfractores.setEnabled(false);
		listInfractores.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				btnPagoSan.setEnabled(true);
				btnSancionar.setEnabled(true);
				btnCambioPropietario.setEnabled(true);
			}
		});

		scrollPane.setViewportView(listInfractores);
	}
}
