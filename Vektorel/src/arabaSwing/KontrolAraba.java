package arabaSwing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class KontrolAraba {

	private JFrame frame;
	private JTextField textGosterge;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KontrolAraba window = new KontrolAraba();
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
	public KontrolAraba() {
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
		
		textGosterge = new JTextField();
		textGosterge.setBounds(141, 25, 148, 38);
		frame.getContentPane().add(textGosterge);
		textGosterge.setColumns(10);
		
		JButton btnNewButton = new JButton("Gaz");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Araba a=new Araba("Þahin","Beyaz");
				
//				a.gaz=textGosterge.getText();
				
				
			}
		});
		btnNewButton.setBounds(63, 141, 123, 46);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Fren");
		btnNewButton_1.setBounds(254, 141, 115, 46);
		frame.getContentPane().add(btnNewButton_1);
	}

}
