package frmCibertec;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GuiListadoMaletas extends JDialog implements ActionListener{

	private final JPanel contentPanel = new JPanel();
	private JButton btnCerrar;
	private JButton btnListar;
	private JTextArea txtr;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			GuiListadoMaletas dialog = new GuiListadoMaletas();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public GuiListadoMaletas() {
		setTitle("Listado de Maletas");
		setBounds(100, 100, 591, 418);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 557, 311);
		contentPanel.add(scrollPane);
		
		txtr = new JTextArea();
		txtr.setEditable(false);
		txtr.setText("LISTADO DE MALETAS"+ "\n"+ "\n"+ "\n");
		scrollPane.setViewportView(txtr);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(150, 331, 85, 28);
		contentPanel.add(btnCerrar);
		
		btnListar = new JButton("Listar");
		btnListar.addActionListener(this);
		btnListar.setBounds(263, 331, 85, 28);
		contentPanel.add(btnListar);
	}
	
	public void actionPerformed(ActionEvent e) {
	if(e.getSource()==btnListar) {
		actionPerformedbtnListar(e);
	}else if(e.getSource()==btnCerrar) {
		actionPerformedbtnCerrar(e);
	}
	
}
	//Mostrar resultados de el Modelo, Precio, Profundidad, Ancho y Alto.
	public void actionPerformedbtnListar(ActionEvent e) {
		txtr.append("Modelo:"+" "+ProyectoFinal.modelo0+ "\n");
		txtr.append("Precio:"+" "+"S/. "+ProyectoFinal.precio0+ "\n");
		txtr.append("Profundidad:"+" "+ProyectoFinal.fondo0+" cm"+ "\n");
		txtr.append("Ancho:"+" "+ProyectoFinal.ancho0+" cm"+ "\n");
		txtr.append("Alto:"+" "+ProyectoFinal.alto0+" cm"+ "\n"+ "\n");

		txtr.append("Modelo:"+" "+ProyectoFinal.modelo1+ "\n");
		txtr.append("Precio:"+" "+"S/. "+ProyectoFinal.precio1+ "\n");
		txtr.append("Profundidad:"+" "+ProyectoFinal.fondo1+" cm"+ "\n");
		txtr.append("Ancho:"+" "+ProyectoFinal.ancho1+" cm"+ "\n");
		txtr.append("Alto:"+" "+ProyectoFinal.alto1+" cm"+ "\n"+ "\n");

		txtr.append("Modelo:"+" "+ProyectoFinal.modelo2+ "\n");
		txtr.append("Precio:"+" "+"S/. "+ProyectoFinal.precio2+ "\n");
		txtr.append("Profundidad:"+" "+ProyectoFinal.fondo2+" cm"+ "\n");
		txtr.append("Ancho:"+" "+ProyectoFinal.ancho2+" cm"+ "\n");
		txtr.append("Alto:"+" "+ProyectoFinal.alto2+" cm"+ "\n"+ "\n");

		txtr.append("Modelo:"+" "+ProyectoFinal.modelo3+ "\n");
		txtr.append("Precio:"+" "+"S/. "+ProyectoFinal.precio3+ "\n");
		txtr.append("Profundidad:"+" "+ProyectoFinal.fondo3+" cm"+ "\n");
		txtr.append("Ancho:"+" "+ProyectoFinal.ancho3+" cm"+ "\n");
		txtr.append("Alto:"+" "+ProyectoFinal.alto3+" cm"+ "\n"+ "\n");
		
		txtr.append("Modelo:"+" "+ProyectoFinal.modelo4+ "\n");
		txtr.append("Precio:"+" "+"S/. "+ProyectoFinal.precio4+ "\n");
		txtr.append("Profundidad:"+" "+ProyectoFinal.fondo4+" cm"+ "\n");
		txtr.append("Ancho:"+" "+ProyectoFinal.ancho4+" cm"+ "\n");
		txtr.append("Alto:"+" "+ProyectoFinal.alto4+" cm"+ "\n"+ "\n");
	}
	
	//Cerrar ventana JDialog
	public void actionPerformedbtnCerrar(ActionEvent e) {
		 dispose();
	}
}
