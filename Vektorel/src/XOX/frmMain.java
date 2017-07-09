package XOX;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.BoxLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;

public class frmMain {

	private JFrame frame;
	private JPanel panelMain;
	private String siradaki = "X";
	private int xSayac = 0;
	private int oSayac = 0;
	private JPanel panel;
	private JPanel panel_1;
	private JPanel panel_2;
	private JPanel panel_3;
	private JPanel panel_4;
	private JPanel panel_5;
	private JPanel panel_6;
	private JPanel panel_7;
	private JPanel panel_8;
	private JPanel panel_9;
	private JPanel panel_10;
	private JPanel panel_11;
	private JPanel panel_12;
	private JPanel panel_13;
	private JPanel panel_14;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btn4;
	private JButton btn5;
	private JButton btn6;
	private JButton btn7;
	private JButton btn8;
	private JButton btn9;
	private JButton btnYenile;
	private JButton btnCikis;
	private JLabel lblOyuncu1;
	private JLabel lblOyuncu1Puan;
	private JLabel lblOyuncu2Puan;
	private JLabel lblOyuncu2;

	public frmMain() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));

		panelMain = new JPanel();
		panelMain.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		frame.getContentPane().add(panelMain, BorderLayout.CENTER);
		panelMain.setLayout(new GridLayout(3, 5, 2, 2));

		panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panelMain.add(panel);
		panel.setLayout(new BorderLayout(0, 0));

		btn1 = new JButton("");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				butonIsaretle(btn1);
			}
		});
		btn1.setFont(new Font("Poor Richard", Font.BOLD, 70));

		panel.add(btn1, BorderLayout.CENTER);

		panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panelMain.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));

		btn2 = new JButton("");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				butonIsaretle(btn2);
			}
		});
		btn2.setFont(new Font("Poor Richard", Font.BOLD, 70));
		panel_1.add(btn2, BorderLayout.CENTER);

		panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panelMain.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));

		btn3 = new JButton("");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				butonIsaretle(btn3);
			}
		});
		btn3.setFont(new Font("Poor Richard", Font.BOLD, 70));
		panel_2.add(btn3, BorderLayout.CENTER);

		panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panelMain.add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));

		lblOyuncu1 = new JLabel("Oyuncu 1=>");
		lblOyuncu1.setHorizontalAlignment(SwingConstants.CENTER);
		lblOyuncu1.setFont(new Font("Poor Richard", Font.BOLD, 40));
		panel_3.add(lblOyuncu1, BorderLayout.CENTER);

		panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panelMain.add(panel_4);
		panel_4.setLayout(new BorderLayout(0, 0));

		lblOyuncu1Puan = new JLabel("0");
		lblOyuncu1Puan.setHorizontalAlignment(SwingConstants.CENTER);
		lblOyuncu1Puan.setFont(new Font("Poor Richard", Font.BOLD, 50));
		panel_4.add(lblOyuncu1Puan, BorderLayout.CENTER);

		panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panelMain.add(panel_5);
		panel_5.setLayout(new BorderLayout(0, 0));

		btn4 = new JButton("");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				butonIsaretle(btn4);
			}
		});
		btn4.setFont(new Font("Poor Richard", Font.BOLD, 70));
		panel_5.add(btn4, BorderLayout.CENTER);

		panel_6 = new JPanel();
		panel_6.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panelMain.add(panel_6);
		panel_6.setLayout(new BorderLayout(0, 0));

		btn5 = new JButton("");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				butonIsaretle(btn5);
			}
		});
		btn5.setFont(new Font("Poor Richard", Font.BOLD, 70));
		panel_6.add(btn5, BorderLayout.CENTER);

		panel_7 = new JPanel();
		panel_7.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panelMain.add(panel_7);
		panel_7.setLayout(new BorderLayout(0, 0));

		btn6 = new JButton("");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				butonIsaretle(btn6);
			}
		});
		btn6.setFont(new Font("Poor Richard", Font.BOLD, 70));
		panel_7.add(btn6, BorderLayout.CENTER);

		panel_8 = new JPanel();
		panel_8.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panelMain.add(panel_8);
		panel_8.setLayout(new BorderLayout(0, 0));

		lblOyuncu2 = new JLabel("Oyuncu 2=>");
		lblOyuncu2.setHorizontalAlignment(SwingConstants.CENTER);
		lblOyuncu2.setFont(new Font("Poor Richard", Font.BOLD, 40));
		panel_8.add(lblOyuncu2, BorderLayout.CENTER);

		panel_9 = new JPanel();
		panel_9.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panelMain.add(panel_9);
		panel_9.setLayout(new BorderLayout(0, 0));

		lblOyuncu2Puan = new JLabel("0");
		lblOyuncu2Puan.setHorizontalAlignment(SwingConstants.CENTER);
		lblOyuncu2Puan.setFont(new Font("Poor Richard", Font.BOLD, 50));
		panel_9.add(lblOyuncu2Puan, BorderLayout.CENTER);

		panel_10 = new JPanel();
		panel_10.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panelMain.add(panel_10);
		panel_10.setLayout(new BorderLayout(0, 0));

		btn7 = new JButton("");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				butonIsaretle(btn7);
			}
		});
		btn7.setFont(new Font("Poor Richard", Font.BOLD, 70));
		panel_10.add(btn7, BorderLayout.CENTER);

		panel_11 = new JPanel();
		panel_11.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panelMain.add(panel_11);
		panel_11.setLayout(new BorderLayout(0, 0));

		btn8 = new JButton("");
		btn8.setFont(new Font("Poor Richard", Font.BOLD, 70));
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				butonIsaretle(btn8);
			}
		});
		panel_11.add(btn8, BorderLayout.CENTER);

		panel_12 = new JPanel();
		panel_12.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panelMain.add(panel_12);
		panel_12.setLayout(new BorderLayout(0, 0));

		btn9 = new JButton("");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				butonIsaretle(btn9);

			}
		});
		btn9.setFont(new Font("Poor Richard", Font.BOLD, 70));
		panel_12.add(btn9, BorderLayout.CENTER);

		panel_13 = new JPanel();
		panel_13.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panelMain.add(panel_13);
		panel_13.setLayout(new BorderLayout(0, 0));

		btnYenile = new JButton("Yenile");
		btnYenile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn1.setText(null);
				btn2.setText(null);
				btn3.setText(null);
				btn4.setText(null);
				btn5.setText(null);
				btn6.setText(null);
				btn7.setText(null);
				btn8.setText(null);
				btn9.setText(null);

			}
		});
		btnYenile.setForeground(new Color(0, 102, 0));
		btnYenile.setFont(new Font("Poor Richard", Font.BOLD, 70));

		panel_13.add(btnYenile, BorderLayout.CENTER);

		panel_14 = new JPanel();
		panel_14.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panelMain.add(panel_14);
		panel_14.setLayout(new BorderLayout(0, 0));

		btnCikis = new JButton("Çýkýs");
		btnCikis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame("Exit");
				if (JOptionPane.showConfirmDialog(frame, "Oyunu kapatmak istediðinize emin misiniz?", "Oyun Çýkýþý",
						JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
					System.exit(0);
				}
			}
		});
		btnCikis.setForeground(new Color(128, 0, 0));
		btnCikis.setFont(new Font("Poor Richard", Font.BOLD, 70));
		panel_14.add(btnCikis, BorderLayout.CENTER);
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmMain window = new frmMain();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	private void oyuncuSec() {
		if (siradaki.equalsIgnoreCase("X")) {
			this.siradaki = "O";

		} else {
			this.siradaki = "X";
		}
	}

	private void oyunSkoru() {
		lblOyuncu1Puan.setText(String.valueOf(xSayac));
		lblOyuncu2Puan.setText(String.valueOf(oSayac));

	}

	private void butonIsaretle(JButton btn) {
		if(btn.getText()==""||btn.getText()==null){
			btn.setText(siradaki);
			if (siradaki.equalsIgnoreCase("X")) {
				btn.setForeground(Color.RED);
			} else {
				btn.setForeground(Color.GREEN);
			}
		}

	
		oyuncuSec();
		kazananOyuncu();

	}

	private void kazananOyuncu() {
		if (btn1.getText() == ("X") && btn2.getText() == ("X") && btn3.getText() == ("X")) {
			JOptionPane.showMessageDialog(frame, "Oyuncu 1 Kazandý", "K A Z A N A N", JOptionPane.INFORMATION_MESSAGE);
			xSayac++;
		}
		if (btn4.getText() == ("X") && btn5.getText() == ("X") && btn6.getText() == ("X")) {
			JOptionPane.showMessageDialog(frame, "Oyuncu 1 Kazandý", "K A Z A N A N", JOptionPane.INFORMATION_MESSAGE);
			xSayac++;
		}
		if (btn7.getText() == ("X") && btn8.getText() == ("X") && btn9.getText() == ("X")) {
			JOptionPane.showMessageDialog(frame, "Oyuncu 1 Kazandý", "K A Z A N A N", JOptionPane.INFORMATION_MESSAGE);
			xSayac++;
		}
		if (btn1.getText() == ("X") && btn5.getText() == ("X") && btn9.getText() == ("X")) {
			JOptionPane.showMessageDialog(frame, "Oyuncu 1 Kazandý", "K A Z A N A N", JOptionPane.INFORMATION_MESSAGE);
			xSayac++;
		}
		if (btn3.getText() == ("X") && btn5.getText() == ("X") && btn7.getText() == ("X")) {
			JOptionPane.showMessageDialog(frame, "Oyuncu 1 Kazandý", "K A Z A N A N", JOptionPane.INFORMATION_MESSAGE);
			xSayac++;
		}
		if (btn1.getText() == ("X") && btn4.getText() == ("X") && btn7.getText() == ("X")) {
			JOptionPane.showMessageDialog(frame, "Oyuncu 1 Kazandý", "K A Z A N A N", JOptionPane.INFORMATION_MESSAGE);
			xSayac++;
		}
		if (btn2.getText() == ("X") && btn5.getText() == ("X") && btn8.getText() == ("X")) {
			JOptionPane.showMessageDialog(frame, "Oyuncu 1 Kazandý", "K A Z A N A N", JOptionPane.INFORMATION_MESSAGE);
			xSayac++;
		}
		if (btn3.getText() == ("X") && btn6.getText() == ("X") && btn9.getText() == ("X")) {
			JOptionPane.showMessageDialog(frame, "Oyuncu 1 Kazandý", "K A Z A N A N", JOptionPane.INFORMATION_MESSAGE);
			xSayac++;
		}

		//////////////////////////////////////////////////////////

		if (btn1.getText() == ("O") && btn2.getText() == ("O") && btn3.getText() == ("O")) {
			JOptionPane.showMessageDialog(frame, "Oyuncu 2 Kazandý", "K A Z A N A N", JOptionPane.INFORMATION_MESSAGE);
			oSayac++;
		}
		if (btn4.getText() == ("O") && btn5.getText() == ("O") && btn6.getText() == ("O")) {
			JOptionPane.showMessageDialog(frame, "Oyuncu 2 Kazandý", "K A Z A N A N", JOptionPane.INFORMATION_MESSAGE);
			oSayac++;
		}
		if (btn7.getText() == ("O") && btn8.getText() == ("O") && btn9.getText() == ("O")) {
			JOptionPane.showMessageDialog(frame, "Oyuncu 2 Kazandý", "K A Z A N A N", JOptionPane.INFORMATION_MESSAGE);
			oSayac++;
		}
		if (btn1.getText() == ("O") && btn5.getText() == ("O") && btn9.getText() == ("O")) {
			JOptionPane.showMessageDialog(frame, "Oyuncu 2 Kazandý", "K A Z A N A N", JOptionPane.INFORMATION_MESSAGE);
			oSayac++;
		}
		if (btn3.getText() == ("O") && btn5.getText() == ("O") && btn7.getText() == ("O")) {
			JOptionPane.showMessageDialog(frame, "Oyuncu 2 Kazandý", "K A Z A N A N", JOptionPane.INFORMATION_MESSAGE);
			oSayac++;
		}
		if (btn1.getText() == ("O") && btn4.getText() == ("O") && btn7.getText() == ("O")) {
			JOptionPane.showMessageDialog(frame, "Oyuncu 2 Kazandý", "K A Z A N A N", JOptionPane.INFORMATION_MESSAGE);
			oSayac++;
		}
		if (btn2.getText() == ("O") && btn5.getText() == ("O") && btn8.getText() == ("O")) {
			JOptionPane.showMessageDialog(frame, "Oyuncu 2 Kazandý", "K A Z A N A N", JOptionPane.INFORMATION_MESSAGE);
			oSayac++;
		}
		if (btn3.getText() == ("O") && btn6.getText() == ("O") && btn9.getText() == ("O")) {
			JOptionPane.showMessageDialog(frame, "Oyuncu 2 Kazandý", "K A Z A N A N", JOptionPane.INFORMATION_MESSAGE);
			oSayac++;
		}
		oyunSkoru();
		if (oSayac > xSayac) {
			if (lblOyuncu2Puan.getForeground() != Color.GREEN) {
				lblOyuncu2Puan.setForeground(Color.GREEN);
				lblOyuncu1Puan.setForeground(Color.RED);
			}
		} else if (lblOyuncu1Puan.getForeground() != Color.GREEN) {
			lblOyuncu1Puan.setForeground(Color.GREEN);
			lblOyuncu2Puan.setForeground(Color.RED);
		} else {
			if (lblOyuncu1Puan.getForeground() == Color.GREEN || lblOyuncu2Puan.getForeground() == Color.RED) {
				lblOyuncu1Puan.setForeground(Color.BLACK);
				lblOyuncu2Puan.setForeground(Color.BLACK);

			}
		}

	}

}
