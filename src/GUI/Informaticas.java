package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

public class Informaticas extends JFrame implements ActionListener{

	private JPanel contentPane;
	JButton btnConvertir;
	JComboBox cboxUInformaticas;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Informaticas frame = new Informaticas();
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
	public Informaticas() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(Informaticas.class.getResource("/Resource/MB.png")));
		setTitle("Unidades Informaticas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 150);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		cboxUInformaticas = new JComboBox();
		cboxUInformaticas.setModel(new DefaultComboBoxModel(new String[] {"Bits (b) a Bytes (B)", "Bytes (B) a Kilobytes (KB)", "Kilobytes (KB) a Megabytes (MB)", "Megabytes (MB) a Gigabytes (GB)", "Gigabytes (GB) a Terabytes (TB)", "Megabits (Mb) a Megabytes (MB)", "Megabytes (MB) a Megabits (Mb)"}));
		cboxUInformaticas.setBounds(95, 11, 200, 25);
		contentPane.add(cboxUInformaticas);
		
		btnConvertir = new JButton("Convertir");
		btnConvertir.addActionListener(this);
		btnConvertir.setBounds(155, 66, 90, 25);
		contentPane.add(btnConvertir);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(btnConvertir == e.getSource()) {
			double operacion = 0;
			int opcion =  cboxUInformaticas.getSelectedIndex();
			String input = "";
			switch (opcion) {
			case 0: {
				input= validarNumero(input);

				operacion=Double.parseDouble( input) / 8 ;
				JOptionPane.showMessageDialog(null,("Conversion:"+operacion+" Bytes(B)"));
				continuarPrograma();
				break;
			}case 1: {
				
				input= validarNumero(input);

				operacion=Double.parseDouble( input) / 1024 ;
				JOptionPane.showMessageDialog(null,("Conversion:"+operacion+" Kilobytes(KB)"));
				continuarPrograma();
				break;
			}case 2: {
				input= validarNumero(input);

				operacion=Double.parseDouble( input) / 1024 ;
				JOptionPane.showMessageDialog(null,("Conversion:"+operacion+" Megabytes(MB)"));
				continuarPrograma();
				break;
			}case 3: {
				input= validarNumero(input);

				operacion=Double.parseDouble( input) / 1024 ;
				JOptionPane.showMessageDialog(null,("Conversion:"+operacion+" Gigabytes(GB)"));
				continuarPrograma();
				break;
			}case 4: {
				input= validarNumero(input);

				operacion=Double.parseDouble( input) / 1024 ;
				JOptionPane.showMessageDialog(null,("Conversion:"+operacion+" Terabytes(TB)"));
				continuarPrograma();
				break;
			}case 5: {
				input= validarNumero(input);

				operacion=Double.parseDouble( input) / 8 ;
				JOptionPane.showMessageDialog(null,("Conversion:"+operacion+" Megabytes(MB)"));
				continuarPrograma();
				break;
			}case 6: {
				input= validarNumero(input);

				operacion=Double.parseDouble( input) * 8 ;
				JOptionPane.showMessageDialog(null,("Conversion:"+operacion+" Megabits(Mb)"));
				continuarPrograma();
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + input );
			}
		
		}
		
	}
	
	public String validarNumero(String input) {
		while(true) {
		    try {
		        input = JOptionPane.showInputDialog(null, "Ingrese el valor a convertir:");
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
