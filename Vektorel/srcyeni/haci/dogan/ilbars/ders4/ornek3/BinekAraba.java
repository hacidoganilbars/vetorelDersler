package haci.dogan.ilbars.ders4.ornek3;

public class BinekAraba extends Araba {
	private boolean tup;

	protected boolean isTup() {
		return tup;
	}

	protected void setTup(boolean tup) {
		this.tup = tup;
	}
    @Override
	protected void arabaGoster() {
		System.out.println(
				this.getMarka() + " " + this.getRenk() + "  motor: " + this.getMotor() + "  Tüp: " + this.isTup());
	}

}
