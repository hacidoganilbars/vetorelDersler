package Hesaplama;

public class HesapMakinasi {

	public enum HTip {
		Toplama, Cikarma
	}

	public static int Hesapla(int s1, int s2, HTip IslemTipi) {
		if (IslemTipi == HTip.Toplama) {
			return Toplama(s1, s2);
		} else {
			return Cikarma(s1, s2);
		}
	}

	private static int Toplama(int s1, int s2) {
		return (s1 + s2);
	}

	private static int Cikarma(int s1, int s2) {
		return (s1 - s2);
	}
}
