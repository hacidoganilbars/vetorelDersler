package KontrolIfadeleri;

import java.util.Scanner;

public class EnBuyukSayi {

	public static void main(String[] args) {
		String girilenDegerler;
		int enBuyukSayi = 0, enKucukSayi = 0;
		Scanner Klavye = new Scanner(System.in);
		System.out.println("Virgül ile ayrýlmýþ þekilde sayýlarýný giriniz :");
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
			System.out.println("Sayýlarý Virgülle Ayrýlmýþ Þekilde Girmek Zorundasýnýz !");
		}
		System.out.println("En Büyük Sayýmýz : " + enBuyukSayi);
		System.out.println("En Küçük Sayýmýz : " + enKucukSayi);
	}
}
