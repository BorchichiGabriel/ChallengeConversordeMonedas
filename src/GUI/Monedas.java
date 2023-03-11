package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import ConversordeMonedas.tipoDeMonedas;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class Monedas extends JFrame implements ActionListener{

	private JPanel contentPane;
	JButton btnSiguiente;
	JComboBox cboxMonedas;
	static List<tipoDeMonedas> listaMonedas = new ArrayList <>(); 
	static tipoDeMonedas money1 = new tipoDeMonedas("Dolar", 0.0050);
	static tipoDeMonedas money2 = new tipoDeMonedas("Euro", 0.0047);
	static tipoDeMonedas money3 = new tipoDeMonedas("Libras", 0.0042);
	static tipoDeMonedas money4 = new tipoDeMonedas("Yen", 0.68);
	static tipoDeMonedas money5 = new tipoDeMonedas("Won coreano", 6.59);
	
	
	
	

	
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Monedas frame = new Monedas();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Monedas() {
		listaMonedas.add(money1);
		listaMonedas.add(money2);
		listaMonedas.add(money3);
		listaMonedas.add(money4);
		listaMonedas.add(money5);
		setIconImage(Toolkit.getDefaultToolkit().getImage(Monedas.class.getResource("/Resource/coins.png")));
		setResizable(false);
		setFont(new Font("Dialog", Font.BOLD, 12));
		setTitle("Monedas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 240);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSeleccion = new JLabel("Seleccione una opción de conversión");
		lblSeleccion.setBounds(10, 11, 364, 14);
		lblSeleccion.setVerticalAlignment(SwingConstants.TOP);
		lblSeleccion.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblSeleccion);
		
		cboxMonedas = new JComboBox();
		cboxMonedas.setModel(new DefaultComboBoxModel(new String[] {"De ARS a Dólar", "De ARS a Euro", "De ARS a Libras", "De ARS a Yen", "De ARS a Won coreano", "De Dólar a ARS", "De Euro a ARS", "De Libras a ARS", "De Yen a ARS", "De Won Coreano a ARS", "Otro..."}));
		cboxMonedas.setBounds(107, 36, 163, 22);
		contentPane.add(cboxMonedas);
		
		btnSiguiente = new JButton("Siguiente");
		btnSiguiente.addActionListener(this);
		btnSiguiente.setBounds(143, 95, 89, 23);
		contentPane.add(btnSiguiente);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(btnSiguiente == e.getSource()) {
			double valor = 0;
			int moneda = cboxMonedas.getSelectedIndex();
			String input = "";
			switch (moneda) {
			case 0: {
				
				input=validarNumero(input);
				
				valor = Double.parseDouble(input); 
				JOptionPane.showMessageDialog(null,("Conversion a USD:"+String.format("%.2f", listaMonedas.get(0).convertir(valor)) ));
				continuarPrograma();
				break;
			}case 1: {
				
				input=validarNumero(input);
				
				valor = Double.parseDouble(input); 
				JOptionPane.showMessageDialog(null,("Conversion a EUR:"+String.format("%.2f", listaMonedas.get(1).convertir(valor)) ));
				continuarPrograma();
				break;
			}case 2: {
				input=validarNumero(input);
				
				valor = Double.parseDouble(input); 
				JOptionPane.showMessageDialog(null,("Conversion a GBP:"+String.format("%.2f", listaMonedas.get(2).convertir(valor)) ));
				continuarPrograma();
				break;
			}case 3: {
				
				input=validarNumero(input);
				
				valor = Double.parseDouble(input); 
				JOptionPane.showMessageDialog(null,("Conversion a JPY:"+String.format("%.2f", listaMonedas.get(3).convertir(valor)) ));
				continuarPrograma();
				break;
			}case 4: {
				
				input=validarNumero(input);
				
				valor = Double.parseDouble(input); 
				JOptionPane.showMessageDialog(null,("Conversion a KRW:"+String.format("%.2f", listaMonedas.get(4).convertir(valor)) ));
				continuarPrograma();
				break;
			}case 5:{
				input=validarNumero(input);
				
				valor = Double.parseDouble(input); 
				valor = valor / listaMonedas.get(0).getValor(); 
				JOptionPane.showMessageDialog(null,("Conversion a ARS:"+String.format("%.5f", valor)));
				continuarPrograma();
				break;
			}case 6: {
				input=validarNumero(input);
				
				valor = Double.parseDouble(input);
				valor = valor / listaMonedas.get(1).getValor(); 
				JOptionPane.showMessageDialog(null,("Conversion a ARS:"+String.format("%.5f", valor)));
				continuarPrograma();
				break;
				
			}case 7: {
				input=validarNumero(input);
				
				valor = Double.parseDouble(input); 
				valor = valor / listaMonedas.get(2).getValor(); 
				JOptionPane.showMessageDialog(null,("Conversion a ARS:"+String.format("%.5f", valor)));
				continuarPrograma();
				
				break;
			}case 8: {
				input=validarNumero(input);
				
				valor = Double.parseDouble(input); 
				valor = valor / listaMonedas.get(3).getValor(); 
				JOptionPane.showMessageDialog(null,("Conversion a ARS:"+String.format("%.5f", valor)));
				continuarPrograma();
				
				break;
			}case 9: {
				input=validarNumero(input);
				
				valor = Double.parseDouble(input); 
				valor = valor / listaMonedas.get(4).getValor(); 
				JOptionPane.showMessageDialog(null,("Conversion a ARS:"+String.format("%.5f", valor)));
				continuarPrograma();
				
				
				break;
			}case 10: {
				//Otros Cambios personalizables
				input=validarNumero(input);

				valor = Double.parseDouble(input);
				
				while(true) {
				    try {
				        input = JOptionPane.showInputDialog(null, "Ingrese el tipo de cambio a convertir:");
				        Double.parseDouble(input);
				        break;
				    } catch(NumberFormatException a) {
				        JOptionPane.showMessageDialog(null, "Ingrese un número válido.");
				    }
				    
				}

				valor = valor * Double.parseDouble(input);
				JOptionPane.showMessageDialog(null,("Resultado de la conversion: $"+valor));
				continuarPrograma();
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: "  );
			}
		}
		
	}
	public String validarNumero(String input) {
		while(true) {
		    try {
		        input = JOptionPane.showInputDialog(null, "Ingrese el monto a convertir:");
		        Double.parseDouble(input);
		        break;
		    } catch(NumberFormatException a) {
		        JOptionPane.showMessageDialog(null, "Ingrese un número válido.");
		    }
		    
		}
		return input;
	}
	public void continuarPrograma(){
		int opc =  JOptionPane.showConfirmDialog(null, "Desea continuar?");
		if(opc!=0) {
			JOptionPane.showMessageDialog(null, "Programa Finalizado");
			System.exit(0);
		}
	}
}
