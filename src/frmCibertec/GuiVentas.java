package frmCibertec;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class GuiVentas extends JDialog implements ActionListener {
	private JLabel lblModelo;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JComboBox cmbModelos;
	private JTextField txtPrecio;
	private JTextField txtCantidad;
	private JButton btnVender;
	private JButton btnCerrar;
	private JScrollPane scrollPane;
	private JTextArea txtr;
	
	public static double ImportePagar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			GuiVentas dialog = new GuiVentas();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public GuiVentas() {
		setTitle("Vender");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);

		lblModelo = new JLabel("Modelo:");
		lblModelo.setBounds(10, 11, 46, 14);
		getContentPane().add(lblModelo);

		lblNewLabel = new JLabel("Precio (/S):");
		lblNewLabel.setBounds(10, 36, 64, 14);
		getContentPane().add(lblNewLabel);

		lblNewLabel_1 = new JLabel("Cantidad:");
		lblNewLabel_1.setBounds(10, 61, 64, 14);
		getContentPane().add(lblNewLabel_1);

		cmbModelos = new JComboBox();
		cmbModelos.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int op = cmbModelos.getSelectedIndex();
				if (op == 0) {
					txtPrecio.setText("" + ProyectoFinal.precio0);
				} else if (op == 1) {
					txtPrecio.setText("" + ProyectoFinal.precio1);
				} else if (op == 2) {
					txtPrecio.setText("" + ProyectoFinal.precio2);
				} else if (op == 3) {
					txtPrecio.setText("" + ProyectoFinal.precio3);
				} else if (op == 4) {
					txtPrecio.setText("" + ProyectoFinal.precio4);
				}
			}
		});
		cmbModelos.setModel(
				new DefaultComboBoxModel(new String[] { "Aviator", "Century ", "Benneton", "Lucas", "Samsonite" }));
		cmbModelos.setBounds(86, 7, 169, 22);
		getContentPane().add(cmbModelos);

		txtPrecio = new JTextField();
		txtPrecio.setEditable(false);
		txtPrecio.setBounds(84, 33, 171, 20);
		getContentPane().add(txtPrecio);
		txtPrecio.setColumns(10);

		txtCantidad = new JTextField();
		txtCantidad.setBounds(84, 58, 171, 20);
		getContentPane().add(txtCantidad);
		txtCantidad.setColumns(10);

		btnVender = new JButton("Vender");
		btnVender.addActionListener(this);
		btnVender.setBounds(335, 7, 89, 23);
		getContentPane().add(btnVender);

		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(335, 32, 89, 23);
		getContentPane().add(btnCerrar);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 87, 414, 163);
		getContentPane().add(scrollPane);

		txtr = new JTextArea();
		txtr.setEditable(false);
		scrollPane.setViewportView(txtr);

		int op = cmbModelos.getSelectedIndex();
		if (op == 0) {
			txtPrecio.setText("" + ProyectoFinal.precio0);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnVender) {
			actionPerformedbtnVender(e);
		} else if (e.getSource() == btnCerrar) {
			actionPerformedbtnCerrar(e);
		}

	}
	
	
	public void actionPerformedbtnVender(ActionEvent e) {
		// Variables
		int ObsequioCantidad, cantidadAdquirida = Integer.parseInt(txtCantidad.getText());
		int op = cmbModelos.getSelectedIndex();
		double ImporteCompra = 0, ImporteDescuento = 0, Descuento, Precio = 0;
		String Obsequio, Modelo;
		//Mostrar modelo
		int ModelS = cmbModelos.getSelectedIndex();
		String modelomostrado = null;
			if (ModelS == 0) {
				modelomostrado = ProyectoFinal.modelo0;
			}else if(ModelS == 1){
				modelomostrado = ProyectoFinal.modelo1;
			}else if(ModelS == 2){
				modelomostrado = ProyectoFinal.modelo2;
			}else if(ModelS == 3){
				modelomostrado = ProyectoFinal.modelo3;
			}else if(ModelS == 4){
				modelomostrado = ProyectoFinal.modelo4;
			}
		// error
		if (cantidadAdquirida < 0) {
			JOptionPane.showMessageDialog(null, "Debe ingresar una cántidad para generar la boleta");
		}
		
		// Operacion obsequios 
		if (cantidadAdquirida <= 5) {
			Obsequio = ProyectoFinal.obsequio1;
		} else if (cantidadAdquirida >= 6 && cantidadAdquirida <= 10) {
			Obsequio = ProyectoFinal.obsequio2;
		} else {
			Obsequio = ProyectoFinal.obsequio3;
		}
		
		//Operacion obsequio Cantidad
		if (cantidadAdquirida <= 5) {
			ObsequioCantidad = ProyectoFinal.obsequioCantidad1;
		} else if (cantidadAdquirida >= 6 && cantidadAdquirida <= 10) {
			ObsequioCantidad = ProyectoFinal.obsequioCantidad2;
		} else {
			ObsequioCantidad = ProyectoFinal.obsequioCantidad3;
		}
		ObsequioCantidad = ObsequioCantidad * cantidadAdquirida;

		
		if (op == 0) {
			txtPrecio.setText("" + ProyectoFinal.precio0);
		} else if (op == 1) {
			txtPrecio.setText("" + ProyectoFinal.precio1);
		} else if (op == 2) {
			txtPrecio.setText("" + ProyectoFinal.precio2);
		} else if (op == 3) {
			txtPrecio.setText("" + ProyectoFinal.precio3);
		} else if (op == 4) {
			txtPrecio.setText("" + ProyectoFinal.precio4);
		}
		
		//Operacion Precios
		if (op == 0) {
			Precio = ProyectoFinal.precio0;
		} else if (op == 1) {
			Precio = ProyectoFinal.precio1;
		} else if (op == 2) {
			Precio = ProyectoFinal.precio2;
		} else if (op == 3) {
			Precio = ProyectoFinal.precio3;
		} else if (op == 4) {
			Precio = ProyectoFinal.precio4;
		}
		
		///OPERACION
		int item=cmbModelos.getSelectedIndex();
		//Calcular los contadores de cantidad de ventas, porcentajes de cuota diaria y modelo
		switch(item) {
		case 0:
			ProyectoFinal.contadorVenta0 ++;
			ProyectoFinal.importeAcumulado0 +=ImportePagar;
			ProyectoFinal.porcentajeCuota0=(ProyectoFinal.importeAcumulado/ProyectoFinal.CuotaDiaria)*100;
			ProyectoFinal.cantUniVendidas0+=cantidadAdquirida;
			break;
		case 1:
			ProyectoFinal.contadorVenta1 ++;
			ProyectoFinal.importeAcumulado1 +=ImportePagar;
			ProyectoFinal.porcentajeCuota1=(ProyectoFinal.importeAcumulado/ProyectoFinal.CuotaDiaria)*100;
			ProyectoFinal.cantUniVendidas1+=cantidadAdquirida;
			break;
		case 2:
			ProyectoFinal.contadorVenta2 ++;
			ProyectoFinal.importeAcumulado2 +=ImportePagar;
			ProyectoFinal.porcentajeCuota2=(ProyectoFinal.importeAcumulado/ProyectoFinal.CuotaDiaria)*100;
			ProyectoFinal.cantUniVendidas2+=cantidadAdquirida;
			break;
		case 3:
			ProyectoFinal.contadorVenta3 ++;
			ProyectoFinal.importeAcumulado3 +=ImportePagar;
			ProyectoFinal.porcentajeCuota3=(ProyectoFinal.importeAcumulado/ProyectoFinal.CuotaDiaria)*100;
			ProyectoFinal.cantUniVendidas3+=cantidadAdquirida;
			break;
			
		default:
			ProyectoFinal.contadorVenta4 ++;
			ProyectoFinal.importeAcumulado4 +=ImportePagar;
			ProyectoFinal.porcentajeCuota4=(ProyectoFinal.importeAcumulado/ProyectoFinal.CuotaDiaria)*100;
			ProyectoFinal.cantUniVendidas4+=cantidadAdquirida;
			break;
		}
		
		
		//Operaciones
		ImporteCompra = Precio * cantidadAdquirida;
		
				if (cantidadAdquirida <= 5) {
					Descuento = ProyectoFinal.porcentaje1/100;
				} else if (cantidadAdquirida >= 6 && cantidadAdquirida < 10) {
					Descuento = ProyectoFinal.porcentaje2/100;
				} else if (cantidadAdquirida >= 11 && cantidadAdquirida <= 15) {
					Descuento = ProyectoFinal.porcentaje3/100;
				} else {
					Descuento = ProyectoFinal.porcentaje4/100;
				}
				
		ImporteDescuento = Descuento * ImporteCompra;
		ImportePagar = ImporteCompra - ImporteDescuento;
		
		//Mostrar resultados
		txtr.setText("BOLETA DE VENTA" + "\n" + "\n");
		txtr.append("Modelo: " + modelomostrado + "\n");
		txtr.append("Precio: " + "S/. " + Precio + "\n");
		txtr.append("Cantidad adquirida: " + cantidadAdquirida + "\n");
		txtr.append("Importe compra: " + "S/. " + Math.round(ImporteCompra * 1000) / 1000.0 + "\n");
		txtr.append("Importe descuento: " + "S/. " + Math.round(ImporteDescuento * 100) / 100.0 + "\n");
		txtr.append("Importe pagar: " + "S/. " + Math.round(ImportePagar * 100) / 100.0 + "\n");
		txtr.append("Tipo de obsequio: " + Obsequio + "\n");
		txtr.append("Unidades obsequiadas: " + ObsequioCantidad);
		
		//Calcular acumuladores
		ProyectoFinal.contadorVentaTotal ++;
		ProyectoFinal.importeAcumuladoTotal+=ImportePagar;
		ProyectoFinal.porcentajeCuotaTotal+=(ImportePagar/ProyectoFinal.CuotaDiaria)*100;
		
		//Mensaje cada 5 ventas
		if (ProyectoFinal.contadorVentaTotal % 5 == 0) {
			JOptionPane.showInternalMessageDialog(null,
					"Venta Nro. " + ProyectoFinal.contadorVentaTotal + "\n" + "Importe total general acumulado: S/."
							+ Math.round(ProyectoFinal.importeAcumuladoTotal * 100.0) /100.0 + "%",
					"Avance de ventas", 1, null);
		}

		
	//Cerrar la ventana JDialog
	}
	public void actionPerformedbtnCerrar(ActionEvent e) {
		dispose();
	}
}
