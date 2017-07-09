package haci.dogan.ilbars.ders4.ornek3;

public class Araba {
	private float motor;
	private String marka;
	private String renk;

	protected float getMotor() {
		return motor;
	}

	protected void setMotor(float motor) {
		this.motor = motor;
	}

	protected String getMarka() {
		return marka;
	}

	protected void setMarka(String marka) {
		this.marka = marka;
	}

	protected String getRenk() {
		return renk;
	}

	protected void setRenk(String renk) {
		this.renk = renk;
	}
	protected void arabaGoster() {
		System.out.println(this.getMarka() + " " + this.getRenk() + "  motor: " + this.getMotor());
	}

}
