package Constructor_Yapicilar;

public class mdlInsan {

	public enum Cins {
		Erkek, Kadin
	}

	static String Yazi;
	private int yas;
	private double boy;
	private String isim;
	public Cins cinsiyet;

	public mdlInsan() {
	}

	public mdlInsan(Cins cinsiyet) {
		this.cinsiyet = cinsiyet;
	}

	public mdlInsan(Cins cinsiyet, String isimBilgisi) {
		this.cinsiyet = cinsiyet;
		this.isim = isimBilgisi;
	}

	public mdlInsan(Cins cinsiyet, String isimBilgisi, double boy) {
		this.cinsiyet = cinsiyet;
		this.isim = isimBilgisi;
		this.boy = boy;
	}

	public mdlInsan(Cins cinsiyet, String isimBilgisi, double boy, int yas) {
		this.cinsiyet = cinsiyet;
		this.isim = isimBilgisi;
		this.boy = boy;
		this.yas = yas;
	}

	public mdlInsan(String isimBilgisi, double boy, Cins cinsiyet) {
		this.cinsiyet = cinsiyet;
		this.isim = isimBilgisi;
		this.boy = boy;
	}
}
