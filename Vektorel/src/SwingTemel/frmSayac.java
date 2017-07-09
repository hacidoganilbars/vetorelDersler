package SwingTemel;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;


import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JSpinner;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class frmSayac {
	// fields deðiþken
	private JFrame frame;
	private JLabel lblMesaj;
	private JButton btnSayac;
	private JSpinner spinMiktar;
	private int sayac;
	

	// kuruuc metod
	public frmSayac() {
		initialize();
	}

	// form içeriði yükleme
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 275, 250);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		lblMesaj=new JLabel("Mesaj Alan\u0131");
		lblMesaj.setBounds(0, 0, 267,36);
		lblMesaj.setForeground(Color.red);
		lblMesaj.setFont(new Font("Comic Sans MS",Font.BOLD,25));
		
		lblMesaj.setHorizontalTextPosition(SwingConstants.CENTER);
		
		frame.getContentPane().add(lblMesaj);
		
		btnSayac= new JButton("sayac artt\u0131r");
		btnSayac.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				sayac+=(int) spinMiktar.getValue();
				lblMesaj.setText("sayaç\t:"+sayac);
			}
		});
		btnSayac.setBounds(135, 142, 91, 23);
		frame.getContentPane().add(btnSayac);
		
		spinMiktar= new JSpinner();
		spinMiktar.setBounds(145, 47, 62, 23);
		frame.getContentPane().add(spinMiktar);
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmSayac window = new frmSayac();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
