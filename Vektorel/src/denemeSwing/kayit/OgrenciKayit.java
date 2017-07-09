package denemeSwing.kayit;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class OgrenciKayit {

	private JFrame frame;
	private JTextField textAd;
	private JTextField textSoyad;
	private JTextField textTelefon;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OgrenciKayit window = new OgrenciKayit();
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
	public OgrenciKayit() {
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

		JLabel lblAd = new JLabel("Ad");
		lblAd.setBounds(39, 23, 46, 14);
		frame.getContentPane().add(lblAd);

		textAd = new JTextField();
		textAd.setBounds(109, 20, 133, 20);
		frame.getContentPane().add(textAd);
		textAd.setColumns(10);

		JLabel lblSoyad = new JLabel("Soyad");
		lblSoyad.setBounds(39, 57, 46, 14);
		frame.getContentPane().add(lblSoyad);

		textSoyad = new JTextField();
		textSoyad.setBounds(109, 51, 133, 20);
		frame.getContentPane().add(textSoyad);
		textSoyad.setColumns(10);

		JLabel lblTelefon = new JLabel("Telefon");
		lblTelefon.setBounds(39, 91, 46, 14);
		frame.getContentPane().add(lblTelefon);

		textTelefon = new JTextField();
		textTelefon.setBounds(109, 82, 133, 20);
		frame.getContentPane().add(textTelefon);
		textTelefon.setColumns(10);

		JLabel lblDers = new JLabel("Ders");
		lblDers.setBounds(39, 126, 46, 14);
		frame.getContentPane().add(lblDers);

		JComboBox cmbDers = new JComboBox();
		cmbDers.setModel(new DefaultComboBoxModel(new String[] { "Java", "C#", "Sql", "C++" }));
		cmbDers.setBounds(109, 122, 92, 22);
		frame.getContentPane().add(cmbDers);

		JLabel lblSayi = new JLabel("Ki\u015Fi say\u0131s\u0131 = 0");
		lblSayi.setBounds(49, 236, 156, 14);
		frame.getContentPane().add(lblSayi);

		JButton btnKaydet = new JButton("Kaydet");
		btnKaydet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Kisi k = new Kisi();
				k.ad = textAd.getText();
				k.soyad = textSoyad.getText();
				k.telefon = textTelefon.getText();
				k.ders = cmbDers.getSelectedItem().toString();

				JOptionPane.showMessageDialog(frame, k.ad + " " + k.soyad + " " + k.telefon + " " + k.ders);
				lblSayi.setText("Kayýt sayýsý=" + OgrenciListe.ogrListe.size());
			
				OgrenciListe.ogrListe.add(k);
			
				
			}
		});
		btnKaydet.setBounds(151, 167, 91, 23);
		frame.getContentPane().add(btnKaydet);
		
		JButton btnKiiListesi = new JButton("Ki\u015Fi Listesi");
		btnKiiListesi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				for (Kisi element : OgrenciListe.ogrListe) {
					element.ad.toString();
					element.soyad.toString();
					element.telefon.toString();
					element.ders.toString();
					
					
				
			
				}
			}
		});
		btnKiiListesi.setBounds(31, 167, 91, 23);
		frame.getContentPane().add(btnKiiListesi);


	}
}
