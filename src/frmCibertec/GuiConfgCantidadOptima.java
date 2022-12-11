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

public class GuiConfgCantidadOptima extends JDialog implements ActionListener{

	private final JPanel contentPanel = new JPanel();
	private JTextField txtCantidadoptima;
	private JLabel lblCantidadoptima;
	private JButton btnAceptar;
	private JButton btnCancelar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			GuiConfgCantidadOptima dialog = new GuiConfgCantidadOptima();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public GuiConfgCantidadOptima() {
		setTitle("Configurar cantidad \u00F3ptima");
		setBounds(100, 100, 450, 120);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		lblCantidadoptima = new JLabel("Cantidad óptima de unidades vendidas");
		lblCantidadoptima.setBounds(10, 10, 219, 20);
		contentPanel.add(lblCantidadoptima);
		
		txtCantidadoptima = new JTextField();
		txtCantidadoptima.setBounds(250, 10, 48, 20);
		contentPanel.add(txtCantidadoptima);
		txtCantidadoptima.setColumns(10);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(this);
		btnAceptar.setBounds(335, 11, 89, 23);
		contentPanel.add(btnAceptar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(this);
		btnCancelar.setBounds(335, 40, 89, 23);
		contentPanel.add(btnCancelar);
		
		//Obtención de datos
		txtCantidadoptima.setText(""+ProyectoFinal.CantidadOptima);
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
	
	//Modificar los datos
	public void actionPerformedbtnAceptar(ActionEvent e) {
		ProyectoFinal.CantidadOptima = Integer.parseInt(txtCantidadoptima.getText());

		JOptionPane.showInternalMessageDialog(null, "Datos guardados exitosamente", "Aviso", 1, null);
		dispose();
	}
}



