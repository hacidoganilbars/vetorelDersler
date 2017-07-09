package SwingTemel;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FormEkrani extends JFrame {

	private static final long serialVersionUID = 7925776328725098658L;

	private void Kurucu(int w, int h, String formBilgisi) {
		this.setTitle(formBilgisi);
		this.setBounds(100, 100, w, h);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		JButton btn = new JButton("Deneme");
		this.getContentPane().add(btn, null);
	}

	public FormEkrani() {
		Kurucu(350, 350, "Class ile form oluþturma");
	}

	public FormEkrani(int w, int h) {
		Kurucu(w, h, "Class ile form oluþturma");
	}

	public FormEkrani(String formBasligi) {
		Kurucu(250, 250, formBasligi);
	}

}
