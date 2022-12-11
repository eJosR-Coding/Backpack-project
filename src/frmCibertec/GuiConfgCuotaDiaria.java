package frmCibertec;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GuiConfgCuotaDiaria extends JDialog implements ActionListener{

	private final JPanel contentPanel = new JPanel();
	private JLabel lblCuotadiaria;
	private JTextField txtCuotadiaria;
	private JButton btnAceptar;
	private JButton btnCancelar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			GuiConfgCuotaDiaria dialog = new GuiConfgCuotaDiaria();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public GuiConfgCuotaDiaria() {
		setTitle("Configurar cuota diaria");
		setBounds(100, 100, 450, 120);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);

		lblCuotadiaria = new JLabel("Cuota diaria esperada (S/.)");
		lblCuotadiaria.setBounds(10, 14, 150, 14);
		contentPanel.add(lblCuotadiaria);
		
		txtCuotadiaria = new JTextField();
		txtCuotadiaria.setBounds(180, 14, 101, 20);
		contentPanel.add(txtCuotadiaria);
		txtCuotadiaria.setColumns(10);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(this);
		btnAceptar.setBounds(335, 14, 89, 23);
		contentPanel.add(btnAceptar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(this);
		btnCancelar.setBounds(335, 40, 89, 23);
		contentPanel.add(btnCancelar);
		
		//Obtencion de datos
		txtCuotadiaria.setText(""+ProyectoFinal.CuotaDiaria);
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
		
		ProyectoFinal.CuotaDiaria = Double.parseDouble(txtCuotadiaria.getText());
		
		JOptionPane.showInternalMessageDialog(null, "Datos guardados exitosamente", "Aviso", 1, null);
		dispose();
	}
}
