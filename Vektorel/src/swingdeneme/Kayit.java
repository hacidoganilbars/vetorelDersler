package swingdeneme;

import java.awt.EventQueue;

import javax.swing.JFrame;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Kayit {

	private JFrame frame;
	protected JTextField adSoyad;
	protected JTextField telefon;
	protected JTextField grup;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Kayit window = new Kayit();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Kayit() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		adSoyad = new JTextField();
		adSoyad.setBounds(155, 11, 164, 20);
		frame.getContentPane().add(adSoyad);
		adSoyad.setColumns(10);

		JLabel lblA = new JLabel("Ad Soyad");
		lblA.setBounds(79, 14, 46, 14);
		frame.getContentPane().add(lblA);

		JButton btnKayit = new JButton("kayit");
		btnKayit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(frame,
						adSoyad.getText() + "\n" + telefon.getText() + "\n" + grup.getText());

			}
		});
		btnKayit.setBounds(324, 207, 91, 23);
		frame.getContentPane().add(btnKayit);

		telefon = new JTextField();
		telefon.setBounds(155, 42, 140, 20);
		frame.getContentPane().add(telefon);
		telefon.setColumns(10);

		JLabel lblTelefon = new JLabel("Telefon");
		lblTelefon.setBounds(79, 45, 46, 14);
		frame.getContentPane().add(lblTelefon);

		JLabel lblGrup = new JLabel("Grup");
		lblGrup.setBounds(79, 76, 46, 14);
		frame.getContentPane().add(lblGrup);

		grup = new JTextField();

		grup.setBounds(155, 73, 140, 20);
		frame.getContentPane().add(grup);
		grup.setColumns(10);
	}
}
