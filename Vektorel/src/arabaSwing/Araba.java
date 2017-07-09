package arabaSwing;

import javax.swing.JTextField;

public class Araba {
	String model;
	String renk;
	double hiz = 0;
	double gaz;

	public Araba(String model, String renk) {
		this.model = model;
		this.renk = renk;

	}

	public double gazVer() {
		hiz += 10;

		this.hiz = hiz;

		if (hiz >= 0) {
			this.hiz = hiz + 20;
		} else if (hiz >= 200) {
			this.hiz = hiz;
		} else if (hiz == 0) {
			this.hiz = 0;
		}

		return this.hiz;

	}

	public double gazKes() {
		this.hiz = hiz;
		if (hiz >= 120) {
			this.hiz = hiz - 10;
		} else if (hiz >= 60) {
			this.hiz = hiz - 15;
		} else if (hiz == 0) {
			this.hiz = 0;
		}

		return this.hiz;

	}

}
