package Kapsulleme;

public class mdlOgrenci {

	private String ad;
	private String soyad;
	private int yas;

	public String Ad() {
		return ad.trim();
	}

	public void Ad(String ad) {
		if (ad.length() < 20) {
			this.ad = ad;
		}
	}

	public int Yas() {
		return yas;
	}

	public void Yas(int yas) {
		if (yas >= 14 && yas <= 18) {
			this.yas = yas;
		}
	}

	public String Soyad() {
		if (soyad != null) {
			return soyad;
		} else {
			return "Soyad Bilgidi Girilmedi!";
		}
	}

	public void Soyad(String soyad) {
		this.soyad = soyad;
	}
}
