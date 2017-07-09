package haci.dogan.ilbars.ders6.ornek1;

class Bellek extends FlipFlop{
	private int kapasite = 128;

	protected int getKapasite() {
		return kapasite;
	}

	protected void setKapasite(int kapasite) {
		this.kapasite = kapasite;
	}
	protected void kacAdet(int adet) {
		super.kacAdet(adet);
		double sonuc=adet/this.kapasite;
		System.out.println(Math.ceil(sonuc)+" bellek");

	}


}
