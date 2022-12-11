package frmCibertec;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GuiConfgObsequios extends JDialog implements ActionListener{

	private final JPanel contentPanel = new JPanel();
	private JLabel lblTipoobsequio;
	private JLabel lblObsequio1;
	private JLabel lblObsequio2;
	private JLabel lblObsequio3;
	private JTextField txtTipoobsequio;
	private JTextField txtObsequio1;
	private JTextField txtObsequio2;
	private JTextField txtObsequio3;
	private JButton btnAceptar;
	private JButton btnCancelar;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			GuiConfgObsequios dialog = new GuiConfgObsequios();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public GuiConfgObsequios() {
		setTitle("Configurar Obsequios");
		setBounds(100, 100, 450, 200);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		lblTipoobsequio = new JLabel("Tipo de obsequio");
		lblTipoobsequio.setBounds(10, 20, 117, 14);
		contentPanel.add(lblTipoobsequio);
		
		lblObsequio1 = new JLabel("1 a 5 unidades");
		lblObsequio1.setBounds(10, 50, 117, 14);
		contentPanel.add(lblObsequio1);
		
		lblObsequio2 = new JLabel("6 a 10 unidades");
		lblObsequio2.setBounds(10, 80, 117, 14);
		contentPanel.add(lblObsequio2);
		
		lblObsequio3 = new JLabel("11 a m\u00E1s unidades");
		lblObsequio3.setBounds(10, 110, 117, 14);
		contentPanel.add(lblObsequio3);
		
		txtTipoobsequio = new JTextField();
		txtTipoobsequio.setBounds(135, 18, 86, 20);
		contentPanel.add(txtTipoobsequio);
		txtTipoobsequio.setColumns(10);
		
		//read txt leer x archivo fila "la ultima fila guardada" y exceptuar los "|"
		btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(335, 20, 89, 23);
		btnAceptar.addActionListener(this);
		contentPanel.add(btnAceptar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(this);
		btnCancelar.setBounds(335, 50, 89, 23);
		contentPanel.add(btnCancelar);
		
		txtObsequio1 = new JTextField();
		txtObsequio1.setBounds(135, 50, 86, 20);
		txtObsequio1.setText("");
		contentPanel.add(txtObsequio1);
		txtObsequio1.setColumns(10);
		
		txtObsequio2 = new JTextField();
		txtObsequio2.setBounds(135, 80, 86, 20);
		contentPanel.add(txtObsequio2);
		txtObsequio2.setColumns(10);
		
		txtObsequio3 = new JTextField();
		txtObsequio3.setBounds(135, 110, 86, 20);
		contentPanel.add(txtObsequio3);
		txtObsequio3.setColumns(10);
		
		//Obtención de datos
		txtTipoobsequio.setText(""+ProyectoFinal.tipoObsequio);
		txtTipoobsequio.setText(""+ProyectoFinal.obsequio1);
		txtTipoobsequio.setText(""+ProyectoFinal.obsequio2);
		txtTipoobsequio.setText(""+ProyectoFinal.obsequio3);
		txtObsequio1.setText(""+ProyectoFinal.obsequioCantidad1);
		txtObsequio2.setText(""+ProyectoFinal.obsequioCantidad2);
		txtObsequio3.setText(""+ProyectoFinal.obsequioCantidad3);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnAceptar) {
			actionPerformedbtnAceptar(e);
		}else if(e.getSource() == btnCancelar) {
			actionPerformedbtnBorrar(e);
		}
	}
	
	//Cerrar ventana JDialog
	public void actionPerformedbtnBorrar(ActionEvent e) {
		dispose();
	}
	
	//Modificar datos
	public void actionPerformedbtnAceptar(ActionEvent e) {
		
		ProyectoFinal.tipoObsequio = txtTipoobsequio.getText();
		ProyectoFinal.obsequio1 = txtTipoobsequio.getText();
		ProyectoFinal.obsequio2 = txtTipoobsequio.getText();
		ProyectoFinal.obsequio3 = txtTipoobsequio.getText();
		ProyectoFinal.obsequioCantidad1 = Integer.parseInt(txtObsequio1.getText());
		ProyectoFinal.obsequioCantidad2 = Integer.parseInt(txtObsequio2.getText());
		ProyectoFinal.obsequioCantidad3 = Integer.parseInt(txtObsequio3.getText());
		
		JOptionPane.showInternalMessageDialog(null, "Datos guardados exitosamente", "Aviso", 1, null);
		dispose();
	}
	
}
