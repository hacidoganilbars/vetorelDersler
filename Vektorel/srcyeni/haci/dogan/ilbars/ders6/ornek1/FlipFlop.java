package haci.dogan.ilbars.ders6.ornek1;

class FlipFlop {

	private int kapasite = 1;

	protected int getKapasite() {
		return kapasite;
	}

	protected void setKapasite(int kapasite) {
		this.kapasite = kapasite;
	}

	protected void kacAdet(int adet) {

		double sonuc = (double) adet / this.kapasite;
		System.out.println(Math.ceil(sonuc) + " Flipflop");

	}

}
