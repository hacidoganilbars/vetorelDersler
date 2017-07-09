package SwingTemel;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class Swing {
	private JFrame frame;

	public Swing() {
		initilaize();

	}

	private void initilaize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 250, 250);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String args[]) {
		EventQueue.invokeLater(new Runnable() {

			@Override
			public void run() {
				Swing windows = new Swing();
				windows.frame.setVisible(true);

			}

		});
	}

}
