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

public class Temperatura extends JFrame implements ActionListener {

	private JPanel contentPane;
	JButton btnConvertir;
	JComboBox cboxTemperaturas;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Temperatura frame = new Temperatura();
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
	public Temperatura() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(Temperatura.class.getResource("/Resource/Thermometer_icon.png")));
		setTitle("Temperatura");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 150);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		cboxTemperaturas = new JComboBox();
		cboxTemperaturas.setModel(new DefaultComboBoxModel(new String[] {"De Cº a Fº", "De Fº a Cº"}));
		cboxTemperaturas.setBounds(145, 11, 110, 22);
		contentPane.add(cboxTemperaturas);
		
		btnConvertir = new JButton("Convertir");
		btnConvertir.addActionListener(this);
		btnConvertir.setBounds(155, 66, 90, 25);
		contentPane.add(btnConvertir);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int temperaturas;
		temperaturas = cboxTemperaturas.getSelectedIndex();
		String input = "";
		int operacion;
		switch (temperaturas) {
		case 0: {
			input= validarNumero(input);

			operacion= (int)(Integer.parseInt(input) *1.8 + 32);
			JOptionPane.showMessageDialog(null,("Conversion a Fº:"+operacion));
			continuarPrograma();
			break;
			}case 1: {
				input= validarNumero(input);

				operacion= (int)((Integer.parseInt(input)  - 32)/1.8);
				JOptionPane.showMessageDialog(null,("Conversion a Cº:"+operacion));
				continuarPrograma();
				break;
				}
		default:
			throw new IllegalArgumentException("Unexpected value: " + input);
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
