package KontrolIfadeleri;

import java.util.Scanner;

public class EnBuyukSayi {

	public static void main(String[] args) {
		String girilenDegerler;
		int enBuyukSayi = 0, enKucukSayi = 0;
		Scanner Klavye = new Scanner(System.in);
		System.out.println("Virg�l ile ayr�lm�� �ekilde say�lar�n� giriniz :");
		girilenDegerler = Klavye.next();
		if (girilenDegerler.contains(",")) {
			String[] degerlerDizi = girilenDegerler.split(",");
			for (int i = 0; i < degerlerDizi.length; i++) {
				if (i == 0) {
					enBuyukSayi = Integer.parseInt(degerlerDizi[i]);
					enKucukSayi = Integer.parseInt(degerlerDizi[i]);
				}
				int tempSayi = Integer.parseInt(degerlerDizi[i]);
				if (tempSayi > enBuyukSayi) {
					enBuyukSayi = tempSayi;
				} else if (tempSayi < enKucukSayi) {
					enKucukSayi = tempSayi;
				}
			}
		} else {
			System.out.println("Say�lar� Virg�lle Ayr�lm�� �ekilde Girmek Zorundas�n�z !");
		}
		System.out.println("En B�y�k Say�m�z : " + enBuyukSayi);
		System.out.println("En K���k Say�m�z : " + enKucukSayi);
	}
}
