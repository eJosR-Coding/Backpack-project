package frmCibertec;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class GuiConsultarMaleta extends JDialog implements ActionListener{

	private final JPanel contentPanel = new JPanel();
	private JTextField txtFondo;
	private JLabel lblModelo;
	private JLabel lblPrecios;
	private JLabel lblAncho;
	private JLabel lblAlto;
	private JLabel lblFondo;
	private JButton btnCerrar;
	private JComboBox cmbModelos;
	private JTextField txtPrecio;
	private JTextField txtAncho;
	private JTextField txtAlto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			GuiConsultarMaleta dialog = new GuiConsultarMaleta();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public GuiConsultarMaleta() {
		setTitle("Consultar maleta");
		setBounds(100, 100, 539, 289);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		txtFondo = new JTextField();
		txtFondo.setEditable(false);
		txtFondo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtFondo.setColumns(10);
		txtFondo.setBounds(94, 220, 277, 19);
		contentPanel.add(txtFondo);
		
		lblFondo = new JLabel("Fondo (cm)");
		lblFondo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblFondo.setBounds(10, 221, 74, 13);
		contentPanel.add(lblFondo);
		
		lblAlto = new JLabel("Alto (cm)");
		lblAlto.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAlto.setBounds(10, 179, 82, 13);
		contentPanel.add(lblAlto);
		
		txtAlto = new JTextField();
		txtAlto.setEditable(false);
		txtAlto.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtAlto.setColumns(10);
		txtAlto.setBounds(94, 178, 277, 19);
		contentPanel.add(txtAlto);
		
		txtAncho = new JTextField();
		txtAncho.setEditable(false);
		txtAncho.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtAncho.setColumns(10);
		txtAncho.setBounds(94, 134, 277, 19);
		contentPanel.add(txtAncho);
		
		
		lblAncho = new JLabel("Ancho (cm)");
		lblAncho.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAncho.setBounds(10, 129, 82, 25);
		contentPanel.add(lblAncho);
		
		txtPrecio = new JTextField();
		txtPrecio.setEditable(false);
		txtPrecio.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtPrecio.setColumns(10);
		txtPrecio.setBounds(94, 85, 277, 19);
		contentPanel.add(txtPrecio);
		
		lblPrecios = new JLabel("Precio (S/)");
		lblPrecios.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPrecios.setBounds(10, 80, 82, 25);
		contentPanel.add(lblPrecios);
		
		lblModelo = new JLabel("Modelo");
		lblModelo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblModelo.setBounds(10, 34, 61, 25);
		contentPanel.add(lblModelo);
		
		//Cambiar el JComboBox con sus respectivos precios, ancho, alto y fondo.
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
		cmbModelos.setModel(new DefaultComboBoxModel(new String[] {"Aviator", "Century", "Benneton", "Lucas", "Samsonite"}));
		cmbModelos.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cmbModelos.setBounds(94, 38, 277, 21);
		contentPanel.add(cmbModelos);
		
		//obtención de datos
		txtPrecio.setText(""+ProyectoFinal.precio0);
		txtAncho.setText(""+ProyectoFinal.ancho0);
		txtAlto.setText(""+ProyectoFinal.alto0);
		txtFondo.setText(""+ProyectoFinal.fondo0);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(398, 47, 113, 25);
		contentPanel.add(btnCerrar);
	}

	//Cerrar ventana JDialog
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnCerrar) {
			dispose();
		}
	}

	
}
