package SwingTemel;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JScrollBar;
import javax.swing.JPasswordField;

public class frmSwing {

	private JFrame frame;
	private JTextField txtAdGir;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmSwing window = new frmSwing();
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
	public frmSwing() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ad\u0131");
		lblNewLabel.setBounds(27, 11, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		txtAdGir = new JTextField();
		txtAdGir.setText("ad\u0131 gir");
		txtAdGir.setBounds(65, 8, 86, 20);
		frame.getContentPane().add(txtAdGir);
		txtAdGir.setColumns(10);
		
		JButton btnMesaj = new JButton("mesaj");
		btnMesaj.setBounds(485, 257, 91, 23);
		frame.getContentPane().add(btnMesaj);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(48, 76, 113, 22);
		frame.getContentPane().add(comboBox);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(266, 77, 6, 20);
		frame.getContentPane().add(passwordField);
	}
}
