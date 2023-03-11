package GUI;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Menu extends JFrame implements ActionListener{

	private JPanel contentPane;
	JButton btnSiguiente;
	JComboBox cboxMenu;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
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
	public Menu() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Menu.class.getResource("/Resource/arrows.png")));
		setTitle("Menú");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setBounds(100, 100, 400, 150);
		setLocationRelativeTo(null);
		//setIconImage(new ImageIcon(getClass().getResource("src/arrows.png")).getImage());
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		cboxMenu = new JComboBox();
		cboxMenu.setModel(new DefaultComboBoxModel(new String[] {"Conversor de Monedas", "Conversor de Temperatura", "Conversor de Uds Informaticas"}));
		cboxMenu.setBounds(95, 11, 200, 22);
		contentPane.add(cboxMenu);
		
		btnSiguiente = new JButton("Siguiente");
		btnSiguiente.addActionListener(this);
		btnSiguiente.setBounds(154, 58, 90, 25);
		contentPane.add(btnSiguiente);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String conversor = (String) cboxMenu.getSelectedItem();
		switch (conversor) {
		case "Conversor de Monedas": {
			Monedas ventana = new Monedas();
			ventana.setVisible(true);
			this.setVisible(false);
			
			break;
		}case "Conversor de Temperatura": {
			Temperatura ventana = new Temperatura();
			ventana.setVisible(true);
			this.setVisible(false);
			break;
		}case "Conversor de Uds Informaticas": {
			Informaticas ventana = new Informaticas();
			ventana.setVisible(true);
			this.setVisible(false);
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: ");
		}
		
	}
	
}
