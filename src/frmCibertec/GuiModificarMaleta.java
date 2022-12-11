package frmCibertec;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import util.DatosMaletas;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class GuiModificarMaleta extends JDialog implements ActionListener {

	private final JPanel contentPanel = new JPanel();
	public JTextField txtPrecio;
	private JTextField txtAncho;
	private JTextField txtAlto;
	private JTextField txtFondo;
	private JLabel lblModelo;
	private JLabel lblPrecios;
	private JComboBox cmbModelos;
	private JLabel lblAncho;
	private JLabel lblAlto;
	private JLabel lblFondo;
	private JButton btnCerrar;
	private JButton btnGrabar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			GuiModificarMaleta dialog = new GuiModificarMaleta();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public GuiModificarMaleta() {
		setTitle("Modificar Maleta");
		setBounds(100, 100, 527, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			lblModelo = new JLabel("Modelo");
			lblModelo.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblModelo.setBounds(10, 25, 61, 25);
			contentPanel.add(lblModelo);
		}
		{
			//Cambiar el JComboBox con sus respectivos Precios, Anchos, Alto y Fondo.
			cmbModelos = new JComboBox();
			cmbModelos.addItemListener(new ItemListener() {
				public void itemStateChanged(ItemEvent e) {
					int op=cmbModelos.getSelectedIndex();
					if(op==0) {
						txtPrecio.setText(""+ProyectoFinal.precio0);
						txtAncho.setText(""+ProyectoFinal.ancho0);
						txtAlto.setText(""+ProyectoFinal.alto0);
						txtFondo.setText(""+ProyectoFinal.fondo0);
					}else if(op==1) {
						txtPrecio.setText(""+ProyectoFinal.precio1);
						txtAncho.setText(""+ProyectoFinal.ancho1);
						txtAlto.setText(""+ProyectoFinal.alto1);
						txtFondo.setText(""+ProyectoFinal.fondo1);
					}else if(op==2) {
						txtPrecio.setText(""+ProyectoFinal.precio2);
						txtAncho.setText(""+ProyectoFinal.ancho2);
						txtAlto.setText(""+ProyectoFinal.alto2);
						txtFondo.setText(""+ProyectoFinal.fondo2);
					}else if(op==3) {
						txtPrecio.setText(""+ProyectoFinal.precio3);
						txtAncho.setText(""+ProyectoFinal.ancho3);
						txtAlto.setText(""+ProyectoFinal.alto3);
						txtFondo.setText(""+ProyectoFinal.fondo3);
					}else if(op==4){
						txtPrecio.setText(""+ProyectoFinal.precio4);
						txtAncho.setText(""+ProyectoFinal.ancho4);
						txtAlto.setText(""+ProyectoFinal.alto4);
						txtFondo.setText(""+ProyectoFinal.fondo4);
					}
				}
			});
			cmbModelos.setModel(
			new DefaultComboBoxModel(new String[] { "Aviator", "Century", "Benneton", "Lucas", "Samsonite" }));
			cmbModelos.setFont(new Font("Tahoma", Font.PLAIN, 14));
			cmbModelos.setBounds(94, 29, 277, 21);
			contentPanel.add(cmbModelos);
		}
		{
			lblPrecios = new JLabel("Precio (S/.)");
			lblPrecios.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblPrecios.setBounds(10, 71, 82, 25);
			contentPanel.add(lblPrecios);
		}
		{
			txtPrecio = new JTextField();
			txtPrecio.setFont(new Font("Tahoma", Font.PLAIN, 14));
			txtPrecio.setColumns(10);
			txtPrecio.setBounds(94, 76, 277, 19);
			contentPanel.add(txtPrecio);
		}
		{
			lblAncho = new JLabel("Ancho (cm)");
			lblAncho.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblAncho.setBounds(10, 120, 82, 25);
			contentPanel.add(lblAncho);
		}
		{
			txtAncho = new JTextField();
			txtAncho.setFont(new Font("Tahoma", Font.PLAIN, 14));
			txtAncho.setColumns(10);
			txtAncho.setBounds(94, 125, 277, 19);
			contentPanel.add(txtAncho);
		}
		{
			lblAlto = new JLabel("Alto (cm)");
			lblAlto.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblAlto.setBounds(10, 170, 82, 13);
			contentPanel.add(lblAlto);
		}
		{
			txtAlto = new JTextField();
			txtAlto.setFont(new Font("Tahoma", Font.PLAIN, 14));
			txtAlto.setColumns(10);
			txtAlto.setBounds(94, 169, 277, 19);
			contentPanel.add(txtAlto);
		}
		{
			lblFondo = new JLabel("Fondo (cm)");
			lblFondo.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblFondo.setBounds(10, 212, 74, 13);
			contentPanel.add(lblFondo);
		}
		{
			txtFondo = new JTextField();
			txtFondo.setFont(new Font("Tahoma", Font.PLAIN, 14));
			txtFondo.setColumns(10);
			txtFondo.setBounds(94, 211, 277, 19);
			contentPanel.add(txtFondo);
		}
		{
			btnCerrar = new JButton("Cerrar");
			btnCerrar.addActionListener(this);
			btnCerrar.setBounds(398, 38, 94, 25);
			contentPanel.add(btnCerrar);
		}
		
			btnGrabar = new JButton("Grabar");
			btnGrabar.addActionListener(this);
			btnGrabar.setBounds(398, 71, 94, 25);
			contentPanel.add(btnGrabar);
			
		//obtención de datos
		txtPrecio.setText(""+ProyectoFinal.precio0);
		txtAncho.setText(""+ProyectoFinal.ancho0);
		txtAlto.setText(""+ProyectoFinal.alto0);
		txtFondo.setText(""+ProyectoFinal.fondo0);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCerrar) {
			actionBtnCerrar(e);
		}else if(e.getSource()==btnGrabar) {
			actionPerformedbtnGrabar(e);
		}
	}
	
	//Guardar datos en .txt
	public void actionPerformedbtnGrabar(ActionEvent e) {
		if (e.getSource() == btnGrabar) {
			DatosMaletas obj=new DatosMaletas();
			String modelo = Integer.toString(cmbModelos.getSelectedIndex());
			String precio = txtPrecio.getText();
			String ancho = txtAncho.getText();
			String alto = txtAlto.getText();
			String fondo = txtFondo.getText();
			//-------------------
			
			obj.GuardarDatos(modelo, precio, ancho, alto, fondo);
		}
		
		//Cambiar al modelo y modificar el Precio, Ancho, Alto, Fondo
		int op=cmbModelos.getSelectedIndex(); 
		if(op==0) {
			ProyectoFinal.precio0=Double.parseDouble(txtPrecio.getText());
			ProyectoFinal.ancho0=Double.parseDouble(txtAncho.getText());
			ProyectoFinal.alto0=Double.parseDouble(txtAlto.getText());
			ProyectoFinal.fondo0=Double.parseDouble(txtFondo.getText());
			JOptionPane.showMessageDialog(null,"Se grabaron los datos correctamente");
		}else if(op==1) {
			ProyectoFinal.precio1=Double.parseDouble(txtPrecio.getText());
			ProyectoFinal.ancho1=Double.parseDouble(txtAncho.getText());
			ProyectoFinal.alto1=Double.parseDouble(txtAlto.getText());
			ProyectoFinal.fondo1=Double.parseDouble(txtFondo.getText());
			JOptionPane.showMessageDialog(null,"Se grabaron los datos correctamente");
		}else if(op==2) {
			ProyectoFinal.precio2=Double.parseDouble(txtPrecio.getText());
			ProyectoFinal.ancho2=Double.parseDouble(txtAncho.getText());
			ProyectoFinal.alto2=Double.parseDouble(txtAlto.getText());
			ProyectoFinal.fondo2=Double.parseDouble(txtFondo.getText());
			JOptionPane.showMessageDialog(null,"Se grabaron los datos correctamente");
		}else if(op==3){
			ProyectoFinal.precio3=Double.parseDouble(txtPrecio.getText());
			ProyectoFinal.ancho3=Double.parseDouble(txtAncho.getText());
			ProyectoFinal.alto3=Double.parseDouble(txtAlto.getText());
			ProyectoFinal.fondo3=Double.parseDouble(txtFondo.getText());
			JOptionPane.showMessageDialog(null,"Se grabaron los datos correctamente");
		}else if(op==4) {
			ProyectoFinal.precio4=Double.parseDouble(txtPrecio.getText());
			ProyectoFinal.ancho4=Double.parseDouble(txtAncho.getText());
			ProyectoFinal.alto4=Double.parseDouble(txtAlto.getText());
			ProyectoFinal.fondo4=Double.parseDouble(txtFondo.getText());
			JOptionPane.showMessageDialog(null,"Se grabaron los datos correctamente");
		} 
	}

	//Cerrar la ventana JDialog
	public void actionBtnCerrar(ActionEvent e) {
		dispose();
	}
}
