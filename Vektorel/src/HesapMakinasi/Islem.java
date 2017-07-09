package HesapMakinasi;

import HesapMakinasi.mdlHM.Tip;

public class Islem {

	public static void main(String[] args) {

		mdlHM hm = new mdlHM(3.0, 5.0);

		double Sonuc = hm.Hesaplama(Tip.ModAlma);
		System.out.println(Sonuc);

		double da = 15;
		double db = 25;
		Sonuc = hm.Hesaplama(da, db, Tip.Carpma);
		System.out.println(Sonuc);

		int a = 10;
		int b = 20;
		Sonuc = hm.Hesaplama(a, b, Tip.Toplama);
		System.out.println(Sonuc);

	}
}