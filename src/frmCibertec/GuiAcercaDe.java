package frmCibertec;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GuiAcercaDe extends JDialog implements ActionListener{
	private JLabel lblTienda;
	private JLabel lblLeonardo;
	private JLabel lblJulio;
	private JLabel lblNewLabel_1;
	private JButton btnCerrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			GuiAcercaDe dialog = new GuiAcercaDe();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public GuiAcercaDe() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 50, 414, 9);
		getContentPane().add(separator);
		
		lblTienda = new JLabel("Tienda 1.0");
		lblTienda.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblTienda.setBounds(165, 11, 100, 30);
		getContentPane().add(lblTienda);
		
		JLabel lblAutores = new JLabel("Autores");
		lblAutores.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblAutores.setBounds(188, 70, 60, 14);
		getContentPane().add(lblAutores);
		
		lblLeonardo = new JLabel("Leonardo Cortarreal ");
		lblLeonardo.setBounds(165, 98, 146, 14);
		getContentPane().add(lblLeonardo);
		
		lblJulio = new JLabel("Julio Perez");
		lblJulio.setBounds(188, 123, 109, 14);
		getContentPane().add(lblJulio);
		
		lblNewLabel_1 = new JLabel("Joseph Rodriguez");
		lblNewLabel_1.setBounds(165, 148, 120, 14);
		getContentPane().add(lblNewLabel_1);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(165, 213, 100, 23);
		getContentPane().add(btnCerrar);
	}
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==btnCerrar) {
				acionPerformedBtnCerrar(e);
			}
		}
		
		//Cerrar ventana JDialog
		public void acionPerformedBtnCerrar(ActionEvent e){
			dispose();
		}
}