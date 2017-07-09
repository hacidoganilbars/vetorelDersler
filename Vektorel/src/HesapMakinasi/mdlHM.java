package HesapMakinasi;

//mdlHesapMakinasi
public class mdlHM {

	public enum Tip {
		Toplama, Bolme, Cikarma, Carpma, ModAlma
	}

	private int intSayi1;
	private int intSayi2;
	private double dSayi1;
	private double dSayi2;

	public mdlHM(int s1, int s2) {
		this.intSayi1 = s1;
		this.intSayi2 = s2;
	}

	public mdlHM(double s1, double s2) {
		this.dSayi1 = s1;
		this.dSayi2 = s2;
	}

	private double Hesapla(double s1, double s2, Tip islemTipi) {
		if (islemTipi == Tip.Toplama) {
			return s1 + s2;
		} else if (islemTipi == Tip.Cikarma) {
			return s1 - s2;
		} else if (islemTipi == Tip.Carpma) {
			return s1 * s2;
		} else if (islemTipi == Tip.ModAlma) {
			return s1 % s2;
		} else {
			return s1 / s2;
		}
	}

	public double Hesaplama(Tip islemTipi) {
		return Hesapla(dSayi1, dSayi2, islemTipi);
	}

	public double Hesaplama(double s1, double s2, Tip islemTipi) {
		return Hesapla(s1, s2, islemTipi);
	}

	public int Hesaplama(int s1, int s2, Tip islemTipi) {
		return (int) Hesapla(s1, s2, islemTipi);
	}

	public int IntHesaplama(Tip islemTipi) {
		return (int) Hesapla(intSayi1, intSayi2, islemTipi);
	}
}
