package frmCibertec;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class GuiGenerarReportes extends JDialog implements ActionListener{

	private final JPanel contentPanel = new JPanel();
	private JLabel lblNewLabel;
	private JButton btnCerrar;
	private JComboBox cmbReporte;
	private JScrollPane scrollPane;
	private JTextArea txtAreaResultado;
	
	public static double cantVentas0;
	public static double cantVentas1;
	public static double cantVentas2;
	public static double cantVentas3;
	public static double cantVentas4;
	
	public static double cantUnidVendidas0;
	public static double cantUnidVendidas1;
	public static double cantUnidVendidas2;
	public static double cantUnidVendidas3;
	public static double cantUnidVendidas4;
	
	
	DecimalFormat formato1 = new DecimalFormat("0.00");
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			GuiGenerarReportes dialog = new GuiGenerarReportes();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	
	
	public GuiGenerarReportes() {
		setTitle("Generar reportes");
		setBounds(100, 100, 800, 500);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			lblNewLabel = new JLabel("Tipo de reporte:");
			lblNewLabel.setBounds(10, 10, 95, 25);
			contentPanel.add(lblNewLabel);
		}
		{
			btnCerrar = new JButton("Cerrar");
			btnCerrar.addActionListener(this);
			btnCerrar.setBounds(673, 10, 101, 25);
			contentPanel.add(btnCerrar);
		}
		{
			cmbReporte = new JComboBox();
			cmbReporte.addItemListener(new ItemListener() {
				public void itemStateChanged(ItemEvent e) {
//					importA0= Double.parseDouble();
					int op=cmbReporte.getSelectedIndex();
					double preciopromedio = (ProyectoFinal.precio0 + ProyectoFinal.precio1 + ProyectoFinal.precio2 + ProyectoFinal.precio3 + ProyectoFinal.precio4)/5;
					double preciomayor = 0, preciomenor = 0;
					//Verificacion de precios
					if(ProyectoFinal.precio0 > ProyectoFinal.precio1 && ProyectoFinal.precio0 > ProyectoFinal.precio2 && ProyectoFinal.precio0 > ProyectoFinal.precio3 && ProyectoFinal.precio0 > ProyectoFinal.precio4) {
						preciomayor = ProyectoFinal.precio0;
					}else if(ProyectoFinal.precio1 > ProyectoFinal.precio0 && ProyectoFinal.precio1 > ProyectoFinal.precio2 && ProyectoFinal.precio1 > ProyectoFinal.precio3 && ProyectoFinal.precio1 > ProyectoFinal.precio4){
						preciomayor = ProyectoFinal.precio1;
					}else if(ProyectoFinal.precio2 > ProyectoFinal.precio0 && ProyectoFinal.precio2 > ProyectoFinal.precio1 && ProyectoFinal.precio2 > ProyectoFinal.precio3 && ProyectoFinal.precio2 > ProyectoFinal.precio4){
						preciomayor = ProyectoFinal.precio2;
					}else if(ProyectoFinal.precio3 > ProyectoFinal.precio0 && ProyectoFinal.precio3 > ProyectoFinal.precio1 && ProyectoFinal.precio3 > ProyectoFinal.precio2 && ProyectoFinal.precio3 > ProyectoFinal.precio4){
						preciomayor = ProyectoFinal.precio2;
					}else if(ProyectoFinal.precio4 > ProyectoFinal.precio0 && ProyectoFinal.precio4 > ProyectoFinal.precio1 && ProyectoFinal.precio4 > ProyectoFinal.precio2 && ProyectoFinal.precio4 > ProyectoFinal.precio3){
						preciomayor = ProyectoFinal.precio2;
					}
					
					if(ProyectoFinal.precio0 < ProyectoFinal.precio1 && ProyectoFinal.precio0 < ProyectoFinal.precio2 && ProyectoFinal.precio0 < ProyectoFinal.precio3 && ProyectoFinal.precio0 < ProyectoFinal.precio4) {
						preciomenor = ProyectoFinal.precio0;
					}else if(ProyectoFinal.precio1 < ProyectoFinal.precio0 && ProyectoFinal.precio1 < ProyectoFinal.precio2 && ProyectoFinal.precio1 < ProyectoFinal.precio3 && ProyectoFinal.precio1 < ProyectoFinal.precio4){
						preciomenor = ProyectoFinal.precio1;
					}else if(ProyectoFinal.precio2 < ProyectoFinal.precio0 && ProyectoFinal.precio2 < ProyectoFinal.precio1 && ProyectoFinal.precio2 < ProyectoFinal.precio3 && ProyectoFinal.precio2 < ProyectoFinal.precio4){
						preciomenor = ProyectoFinal.precio2;
					}else if(ProyectoFinal.precio3 < ProyectoFinal.precio0 && ProyectoFinal.precio3 < ProyectoFinal.precio1 && ProyectoFinal.precio3 < ProyectoFinal.precio2 && ProyectoFinal.precio3 < ProyectoFinal.precio4){
						preciomenor = ProyectoFinal.precio2;
					}else if(ProyectoFinal.precio4 < ProyectoFinal.precio0 && ProyectoFinal.precio4 < ProyectoFinal.precio1 && ProyectoFinal.precio4 < ProyectoFinal.precio2 && ProyectoFinal.precio4 < ProyectoFinal.precio3){
						preciomenor = ProyectoFinal.precio2;
					}
					
//					double preciomayor = ProyectoFinal.precio1;
//					double preciomenor = ProyectoFinal.precio4;
					if(op==0) {
						txtAreaResultado.setText("VENTAS POR MODELO" + "\n" + "\n");
						txtAreaResultado.append("Modelo : " + ProyectoFinal.modelo0 + "\n");
						txtAreaResultado.append("Cantidad de ventas : " + ProyectoFinal.contadorVenta0 + "\n");
						txtAreaResultado.append("Cantidad de unidades vendidas : " + ProyectoFinal.cantUniVendidas0 + "\n");
						txtAreaResultado.append("Importe total vendido : " + "S/." + formato1.format(ProyectoFinal.importeAcumulado0) + "\n");
						txtAreaResultado.append("Aporte a la cuota diaria : " + formato1.format(ProyectoFinal.porcentajeCuota0) + "\n" + "\n" );
						
						txtAreaResultado.append("Modelo : " + ProyectoFinal.modelo1 + "\n");
						txtAreaResultado.append("Cantidad de ventas : " + ProyectoFinal.contadorVenta1 + "\n");
						txtAreaResultado.append("Cantidad de unidades vendidas : " + ProyectoFinal.cantUniVendidas1 + "\n");
						txtAreaResultado.append("Importe total vendido : " + "S/." + formato1.format(ProyectoFinal.importeAcumulado1) + "\n");
						txtAreaResultado.append("Aporte a la cuota diaria : " + formato1.format(ProyectoFinal.porcentajeCuota1) + "\n" + "\n" );
						
						txtAreaResultado.append("Modelo : " + ProyectoFinal.modelo2 + "\n");
						txtAreaResultado.append("Cantidad de ventas : " + ProyectoFinal.contadorVenta2 + "\n");
						txtAreaResultado.append("Cantidad de unidades vendidas : " + ProyectoFinal.cantUniVendidas2 + "\n");
						txtAreaResultado.append("Importe total vendido : " + "S/." + formato1.format(ProyectoFinal.importeAcumulado2) + "\n");
						txtAreaResultado.append("Aporte a la cuota diaria : " + formato1.format(ProyectoFinal.porcentajeCuota2) + "\n" + "\n" );
						
						txtAreaResultado.append("Modelo : " + ProyectoFinal.modelo3 + "\n");
						txtAreaResultado.append("Cantidad de ventas : " + ProyectoFinal.contadorVenta3 + "\n");
						txtAreaResultado.append("Cantidad de unidades vendidas : " + ProyectoFinal.cantUniVendidas3 + "\n");
						txtAreaResultado.append("Importe total vendido : " + "S/." + formato1.format(ProyectoFinal.importeAcumulado3) + "\n");
						txtAreaResultado.append("Aporte a la cuota diaria : " + formato1.format(ProyectoFinal.porcentajeCuota3)+ "\n" + "\n" );
						 
						txtAreaResultado.append("Modelo : " + ProyectoFinal.modelo4 + "\n");
						txtAreaResultado.append("Cantidad de ventas : " + ProyectoFinal.contadorVenta4 + "\n");
						txtAreaResultado.append("Cantidad de unidades vendidas : " + ProyectoFinal.cantUniVendidas4 + "\n");
						txtAreaResultado.append("Importe total vendido : " + "S/." + formato1.format(ProyectoFinal.importeAcumulado4) + "\n");
						txtAreaResultado.append("Aporte a la cuota diaria : " + formato1.format(ProyectoFinal.porcentajeCuota4) + "\n" + "\n" );
						
					}else if(op==1) {
						txtAreaResultado.setText("RAZÓN DE PRECIOS EN RELACION AL PRECIO MAYOR"+ "\n" + "\n" );
						txtAreaResultado.append("Modelo : " + ProyectoFinal.modelo0 + "\n");
						txtAreaResultado.append("Precio : " + ProyectoFinal.precio0 + "\n");
						txtAreaResultado.append("Razón  : " + "\n" + "\n");
						
						txtAreaResultado.append("Modelo : " + ProyectoFinal.modelo1 + "\n");
						txtAreaResultado.append("Precio : " + ProyectoFinal.precio1 + "\n");
						txtAreaResultado.append("Razón  : " + "\n" + "\n");
						
						txtAreaResultado.append("Modelo : " + ProyectoFinal.modelo2 + "\n");
						txtAreaResultado.append("Precio : " + ProyectoFinal.precio2 + "\n");
						txtAreaResultado.append("Razón  : " + "\n" + "\n");
						
						txtAreaResultado.append("Modelo : " + ProyectoFinal.modelo3 + "\n");
						txtAreaResultado.append("Precio : " + ProyectoFinal.precio3 + "\n");
						txtAreaResultado.append("Razón  : " + "\n" + "\n");
						
						txtAreaResultado.append("Modelo : " + ProyectoFinal.modelo4 + "\n");
						txtAreaResultado.append("Precio : " + ProyectoFinal.precio4 + "\n");
						txtAreaResultado.append("Razón  : " + "\n" + "\n");
					}else if(op==2) {
						txtAreaResultado.setText("ESTADÍSTICA SOBRE LA CANTIDAD ÓPTIMA" + "\n" + "\n");
						txtAreaResultado.append("Cantidad de modelos que superaron la cantidad óptima    : " + "\n");
						txtAreaResultado.append("Cantidad de modelos que no superaron la cantidad óptima : " + "\n");
						txtAreaResultado.append("Cantidad de modelos que igualaron la cantidad óptima    : " + "\n");
					}else if(op==3) {
						txtAreaResultado.setText("ESTADÍSTICA SOBRE EL PRECIO" + "\n" + "\n");
						txtAreaResultado.append("Precio promedio   : " + "S/." + preciopromedio + "\n");
						txtAreaResultado.append("Precio mayor      : " + "S/." + preciomayor + "\n");
						txtAreaResultado.append("Precio menor      : " + "S/." + preciomenor + "\n");
					}
				}
			});
			cmbReporte.setModel(new DefaultComboBoxModel(new String[] { "Ventar por modelo", "Razon de precios en relacion al precio mayor", "Estadistica sobre la cantidad optima ", "Estadistica sobre el precio " }));
			cmbReporte.setFont(new Font("Tahoma", Font.PLAIN, 14));
			cmbReporte.setBounds(115, 11, 531, 25);
			contentPanel.add(cmbReporte);
		}
		{
			scrollPane = new JScrollPane();
			scrollPane.setBounds(10, 50, 764, 400);
			contentPanel.add(scrollPane);
			{
				txtAreaResultado = new JTextArea();
				txtAreaResultado.setFont(new Font("Tahoma", Font.PLAIN, 14));
				scrollPane.setViewportView(txtAreaResultado);
				
				int op=cmbReporte.getSelectedIndex();
				if(op==0) {
					txtAreaResultado.setText("VENTAS POR MODELO" + "\n" + "\n");
					txtAreaResultado.append("Modelo : " + ProyectoFinal.modelo0 + "\n");
					txtAreaResultado.append("Cantidad de ventas : " + "\n");
					txtAreaResultado.append("Cantidad de unidades vendidas : " + "\n");
					txtAreaResultado.append("Importe total vendido : " + "\n");
					txtAreaResultado.append("Aporte a la cuota diaria : " + "\n" + "\n" );
					
					txtAreaResultado.append("Modelo : " + ProyectoFinal.modelo1 + "\n");
					txtAreaResultado.append("Cantidad de ventas : " + "\n");
					txtAreaResultado.append("Cantidad de unidades vendidas : " + "\n");
					txtAreaResultado.append("Importe total vendido : " + "\n");
					txtAreaResultado.append("Aporte a la cuota diaria : " + "\n" + "\n" );
					
					txtAreaResultado.append("Modelo : " + ProyectoFinal.modelo2 + "\n");
					txtAreaResultado.append("Cantidad de ventas : " + "\n");
					txtAreaResultado.append("Cantidad de unidades vendidas : " + "\n");
					txtAreaResultado.append("Importe total vendido : " + "\n");
					txtAreaResultado.append("Aporte a la cuota diaria : " + "\n" + "\n" );
					
					txtAreaResultado.append("Modelo : " + ProyectoFinal.modelo3 + "\n");
					txtAreaResultado.append("Cantidad de ventas : " + "\n");
					txtAreaResultado.append("Cantidad de unidades vendidas : " + "\n");
					txtAreaResultado.append("Importe total vendido : " + "\n");
					txtAreaResultado.append("Aporte a la cuota diaria : " + "\n" + "\n" );
					 
					txtAreaResultado.append("Modelo : " + ProyectoFinal.modelo4 + "\n");
					txtAreaResultado.append("Cantidad de ventas : " + "\n");
					txtAreaResultado.append("Cantidad de unidades vendidas : " + "\n");
					txtAreaResultado.append("Importe total vendido : " + "\n");
					txtAreaResultado.append("Aporte a la cuota diaria : " + "\n" + "\n" );
				}
			}
		}
	}
	
	//Cerrar ventana JDialog
	public void actionPerformed(ActionEvent e) {
		dispose();
	}
	
	//Operacion precio promedio
	public void actionPerformedda(ActionEvent e) {
		int op=cmbReporte.getSelectedIndex();
	}			
}
