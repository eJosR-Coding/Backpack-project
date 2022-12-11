package frmCibertec;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import util.DatosMaletas;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GuiConfDescuento extends JDialog implements ActionListener{

	private final JPanel contentPanel = new JPanel();
	private JTextField txtPorcentaje1;
	private JTextField txtPorcentaje2;
	private JTextField txtPorcentaje3;
	private JTextField txtPorcentaje4;
	private JLabel lblPorcentaje1;
	private JLabel lblPorcentaje2;
	private JLabel lblPorcentaje3;
	private JLabel lblPorcentaje4;
	private JLabel lbl1;
	private JLabel lbl2;
	private JLabel lbl3;
	private JLabel lbl4;
	private JButton btnProcesar;
	private JButton btnCancelar;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		
		try {
			GuiConfDescuento dialog = new GuiConfDescuento();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public GuiConfDescuento() {
		setTitle("Configurar porcentajes de descuentos");
		setBounds(100, 100, 450, 200);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		lblPorcentaje1 = new JLabel("1 a 5 unidades");
		lblPorcentaje1.setBounds(10, 20, 117, 14);
		contentPanel.add(lblPorcentaje1);
		
		lblPorcentaje2 = new JLabel("6 a 10 unidades");
		lblPorcentaje2.setBounds(10, 50, 117, 14);
		contentPanel.add(lblPorcentaje2);
		
		lblPorcentaje3 = new JLabel("11 a 15 unidades");
		lblPorcentaje3.setBounds(10, 80, 117, 14);
		contentPanel.add(lblPorcentaje3);
		
		lblPorcentaje4 = new JLabel("M\u00E1s de 15 unidades");
		lblPorcentaje4.setBounds(10, 110, 117, 14);
		contentPanel.add(lblPorcentaje4);
		
		txtPorcentaje1 = new JTextField();
		txtPorcentaje1.setBounds(135, 20, 86, 20);
		contentPanel.add(txtPorcentaje1);
		txtPorcentaje1.setColumns(10);
		
		txtPorcentaje2 = new JTextField();
		txtPorcentaje2.setBounds(135, 50, 86, 20);
		contentPanel.add(txtPorcentaje2);
		txtPorcentaje2.setColumns(10);
		
		txtPorcentaje3 = new JTextField();
		txtPorcentaje3.setBounds(135, 80, 86, 20);
		contentPanel.add(txtPorcentaje3);
		txtPorcentaje3.setColumns(10);
		
		txtPorcentaje4 = new JTextField();
		txtPorcentaje4.setBounds(135, 110, 86, 20);
		contentPanel.add(txtPorcentaje4);
		txtPorcentaje4.setColumns(10);
		
		lbl1 = new JLabel("%");
		lbl1.setBounds(225, 20, 46, 14);
		contentPanel.add(lbl1);
		
		lbl2 = new JLabel("%");
		lbl2.setBounds(225, 50, 46, 14);
		contentPanel.add(lbl2);
		
		lbl3 = new JLabel("%");
		lbl3.setBounds(225, 80, 46, 14);
		contentPanel.add(lbl3);
		
		lbl4 = new JLabel("%");
		lbl4.setBounds(225, 110, 46, 14);
		contentPanel.add(lbl4);
		
		btnProcesar = new JButton("Aceptar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(335, 20, 89, 23);
		contentPanel.add(btnProcesar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(this);
		btnCancelar.setBounds(335, 50, 89, 23);
		contentPanel.add(btnCancelar);
		
		//Obtencion de datos
		txtPorcentaje1.setText(""+ProyectoFinal.porcentaje1);
		txtPorcentaje2.setText(""+ProyectoFinal.porcentaje2);
		txtPorcentaje3.setText(""+ProyectoFinal.porcentaje3);
		txtPorcentaje4.setText(""+ProyectoFinal.porcentaje4);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnProcesar) {
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
		
		ProyectoFinal.porcentaje1 = Double.parseDouble(txtPorcentaje1.getText());
		ProyectoFinal.porcentaje2 = Double.parseDouble(txtPorcentaje2.getText());
		ProyectoFinal.porcentaje3 = Double.parseDouble(txtPorcentaje3.getText());
		ProyectoFinal.porcentaje4 = Double.parseDouble(txtPorcentaje4.getText());
		
		JOptionPane.showInternalMessageDialog(null, "Datos guardados exitosamente", "Aviso", 1, null);
		dispose();
	}
}

