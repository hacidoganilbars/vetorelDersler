package Hesaplama;

import Hesaplama.HesapMakinasi.HTip;

public class Islem {

	public static void main(String[] args) {
		int Sonuc = HesapMakinasi.Hesapla(10, 25, HTip.Toplama);
		System.out.println(Sonuc);
	}
}
