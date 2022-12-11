package frmCibertec;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ProyectoFinal extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnArchivo;
	private JMenuItem mntmSalir;
	private JMenu mnMantenimiento;
	private JMenu mnVentas;
	private JMenu mnConfiguracion;
	private JMenu mnAyuda;
	private JMenuItem mntmConsultarMaleta;
	private JMenuItem mntmModificarMaleta;
	private JMenuItem mntmListaMaletas;
	private JMenuItem mntmVender;
	private JMenuItem mntmGenerarReportes;
	private JMenuItem mntmConfigurarDescuentos;
	private JMenuItem mntmConfigurarObsequios;
	private JMenuItem mntmConfigurarCantidadOp;
	private JMenuItem mntmConfigurarCuotaDiaria;
	private JMenuItem mntmAcercaDe;
	// Datos mínimos de la primera maleta
	public static String modelo0 = "Aviator";
	public static double precio0 = 124.9;
	public static double ancho0 = 63.5;
	public static double alto0 = 30.9;
	public static double fondo0 = 29.2;
	// Datos mínimos del segundo maleta
	public static String modelo1 = "Century";
	public static double precio1 = 174.9;
	public static double ancho1 = 75.0;
	public static double alto1 = 28.5;
	public static double fondo1 = 30.0;
	// Datos mínimos del tercer maleta
	public static String modelo2 = "Benneton";
	public static double precio2 = 159.9;
	public static double ancho2 = 65.2;
	public static double alto2 = 31.2;
	public static double fondo2 = 29.4;
	// Datos mínimos del cuarto maleta
	public static String modelo3 = "Lucas";
	public static double precio3 = 99.9;
	public static double ancho3 = 45.0;
	public static double alto3 = 70.0;
	public static double fondo3 = 25.0;
	// Datos mínimos del quinto maleta
	public static String modelo4 = "Samsonite";
	public static double precio4 = 84.9;
	public static double ancho4 = 50.2;
	public static double alto4 = 60.4;
	public static double fondo4 = 25.0;
	// Porcentajes de descuento
	public static double porcentaje1 = 7.5;
	public static double porcentaje2 = 10.0;
	public static double porcentaje3 = 12.5;
	public static double porcentaje4 = 15.0;
	// Obsequios
	public static String tipoObsequio = "Lapicero";
	public static int obsequioCantidad1 = 2;
	public static int obsequioCantidad2 = 3;
	public static int obsequioCantidad3 = 4;
	public static String obsequio1 = "USB";
	public static String obsequio2 = "Cuaderno";
	public static String obsequio3 = "Lapicero";
	
	
	//Nuevas variables
	//Porcentajes de descuento 
	public static double Porcentaje1= (porcentaje1/100);
	public static double Porcentaje2= (porcentaje2/100);
	public static double Porcentaje3= (porcentaje3/100);
	public static double Porcentaje4= (porcentaje4/100);
	//Cantidad optima
	public static int CantidadOptima=10;
	//Cuota Diarias
	public static double CuotaDiaria= 30000.0;
	//porcentaje de cuota diaria por modelo 
	public static double porcentajeCuota0;
	public static double porcentajeCuota1;
	public static double porcentajeCuota2; 
	public static double porcentajeCuota3;
	public static double porcentajeCuota4;
	public static double porcentajeCuotaTotal;
	//contador de cantidad acumulada de ventas por modelo  
	public static int contadorVenta0;
	public static int contadorVenta1;
	public static int contadorVenta2; 
	public static int contadorVenta3; 
	public static int contadorVenta4; 
	public static int contadorVentaTotal;
	//cantidad acumulada de unidades vendidas por modelo  
	public static int cantUniVendidas0;
	public static int cantUniVendidas1; 
	public static int cantUniVendidas2;
	public static int cantUniVendidas3; 
	public static int cantUniVendidas4;
	//Actumulación total
	public static double importeAcumulado0;
	public static double importeAcumulado1;
	public static double importeAcumulado2;
	public static double importeAcumulado3; 
	public static double importeAcumulado4;
	public static double importeAcumulado;
	public static double importeAcumuladoTotal;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProyectoFinal frame = new ProyectoFinal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ProyectoFinal() {
		setTitle("Tienda 1.0");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 714, 436);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnArchivo = new JMenu("Archivo");
		menuBar.add(mnArchivo);
		
		mntmSalir = new JMenuItem("Salir");
		mntmSalir.addActionListener(this);
		mnArchivo.add(mntmSalir);
		
		mnMantenimiento = new JMenu("Mantenimiento");
		menuBar.add(mnMantenimiento);
		
		mntmConsultarMaleta = new JMenuItem("Consultar maleta");
		mntmConsultarMaleta.addActionListener(this);
		mnMantenimiento.add(mntmConsultarMaleta);
		
		mntmModificarMaleta = new JMenuItem("Modificar maleta");
		mntmModificarMaleta.addActionListener(this);
		mnMantenimiento.add(mntmModificarMaleta);
		
		mntmListaMaletas = new JMenuItem("Lista maletas");
		mntmListaMaletas.addActionListener(this);
		mnMantenimiento.add(mntmListaMaletas);
		
		mnVentas = new JMenu("Ventas");
		menuBar.add(mnVentas);
		
		mntmVender = new JMenuItem("Vender");
		mntmVender.addActionListener(this);
		mnVentas.add(mntmVender);
		
		mntmGenerarReportes = new JMenuItem("Generar reportes");
		mntmGenerarReportes.addActionListener(this);
		mnVentas.add(mntmGenerarReportes);
		
		mnConfiguracion = new JMenu("Configuraci\u00F3n");
		menuBar.add(mnConfiguracion);
		
		mntmConfigurarDescuentos = new JMenuItem("Configurar descuentos");
		mntmConfigurarDescuentos.addActionListener(this);
		mnConfiguracion.add(mntmConfigurarDescuentos);
		
		mntmConfigurarObsequios = new JMenuItem("Configurar obsequios");
		mntmConfigurarObsequios.addActionListener(this);
		mnConfiguracion.add(mntmConfigurarObsequios);
		
		mntmConfigurarCantidadOp = new JMenuItem("Configurar cantidad \u00F3ptima ");
		mntmConfigurarCantidadOp.addActionListener(this);
		mnConfiguracion.add(mntmConfigurarCantidadOp);
		
		mntmConfigurarCuotaDiaria = new JMenuItem("Configurar cuota diaria");
		mntmConfigurarCuotaDiaria.addActionListener(this);
		mnConfiguracion.add(mntmConfigurarCuotaDiaria);
		
		mnAyuda = new JMenu("Ayuda");
		menuBar.add(mnAyuda);
		
		mntmAcercaDe = new JMenuItem("Acerca de la tienda");
		mntmAcercaDe.addActionListener(this);
		mnAyuda.add(mntmAcercaDe);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}
	//Vinculacion de Jframe con JDialog
	//Menu
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == mntmConsultarMaleta) {
			actionPerformedmntmConsultarMaleta(e);
		}else if(e.getSource()==mntmSalir) {
			actionPerformedmntmSalir(e);
		}else if(e.getSource()== mntmModificarMaleta) {
			actionPerformedmntmModificarMaleta(e);
		}else if(e.getSource()==mntmListaMaletas) {
			actionPerformedmntmListaMaletas(e);
		}else if(e.getSource()==mntmConfigurarDescuentos) {
			actionPerformedmntmConfigurarDescuentos(e);
		}else if(e.getSource()==mntmConfigurarCantidadOp) {
			actionPerformedmntmConfigurarCantidadOp(e);
		}else if(e.getSource()==mntmConfigurarObsequios) {
			actionPerformedmntmConfigurarObsequios(e);
		}else if(e.getSource()==mntmConfigurarCuotaDiaria) {
			actionPerformedmntmConfigurarCuotaDiaria(e);
		}else if(e.getSource()==mntmVender) {
			actionPerformedmntmVender(e);
		}else if(e.getSource()==mntmGenerarReportes) {
			actionPerformedmntmGenerarReportes(e);
		}else if(e.getSource()==mntmAcercaDe) {
			actionPerformedmntmAcercaDe(e);
		}
		
}
	
	//ARCHIVO
	//Salir
	public void actionPerformedmntmSalir(ActionEvent e) {
		System.exit(0);
	}
	//MANTENIMIENTO
	//Consultar maleta
	public void actionPerformedmntmConsultarMaleta(ActionEvent e) {
		GuiConsultarMaleta dialogo=new GuiConsultarMaleta();
		dialogo.setVisible(true);
	}
	//Modificar maleta
	public void actionPerformedmntmModificarMaleta(ActionEvent e) {
		GuiModificarMaleta dialogo=new GuiModificarMaleta();
		dialogo.setVisible(true);
	}
	//Lista maleta
	public void actionPerformedmntmListaMaletas(ActionEvent e) {
		GuiListadoMaletas dialogo=new GuiListadoMaletas();
		dialogo.setVisible(true);
	}
	
	
	//CONFIGURACION
	//Configurar Descuentos
	public void actionPerformedmntmConfigurarDescuentos(ActionEvent e) {
		GuiConfDescuento dialogo=new GuiConfDescuento();
		dialogo.setVisible(true);
	}
	//Configurar Cantidad Optima
	public void actionPerformedmntmConfigurarCantidadOp(ActionEvent e) {
		GuiConfgCantidadOptima dialogo=new GuiConfgCantidadOptima();
		dialogo.setVisible(true);
	}
	//Configurar obsequios
	public void actionPerformedmntmConfigurarObsequios(ActionEvent e) {
		GuiConfgObsequios dialogo=new GuiConfgObsequios();
		dialogo.setVisible(true);
	}
	//Configurar Cuota diaria
	public void actionPerformedmntmConfigurarCuotaDiaria(ActionEvent e) {
		GuiConfgCuotaDiaria dialogo=new GuiConfgCuotaDiaria();
		dialogo.setVisible(true);
	}
	
	
	//VENTAS
	//Vender
	public void actionPerformedmntmVender(ActionEvent e) {
		GuiVentas dialogo=new GuiVentas();
		dialogo.setVisible(true);
	}//GenenerarReportes
	public void actionPerformedmntmGenerarReportes(ActionEvent e) {
		GuiGenerarReportes dialogo=new GuiGenerarReportes();
		dialogo.setVisible(true);
	}
	
	
	//AYUDA
	//Acerca de la tienda
	public void actionPerformedmntmAcercaDe(ActionEvent e) {
		GuiAcercaDe dialogo=new GuiAcercaDe();
		dialogo.setVisible(true);
	}
	
}
