package KelimeBulmaca;

import java.util.Random;
import java.util.Scanner;

public class Islem {
	public static char[] Char;

	public static void main(String[] args) {
		int Sayac = 0;
		Scanner Klavye = new Scanner(System.in);

		MFile Dosya = new MFile();
		String Kelime = Dosya.RandomText();
		int Sans = (Kelime.length() / 2);
		System.out.println(Kelime);
		Char = Kelime.toCharArray();
		char[] Gecmis = new char[Kelime.length()];
		CharOlustur();
		KelimeYazdir();
		while (Sayac < Kelime.length()) {
			System.out.println("Tahmin : 1\tHarf : 2\tGeçmiþ : 3\tHarf Ver : 4");
			int Secim = Klavye.nextInt();
			if (Secim == 1) {
				System.out.print("Yeni Tahmin Girinizi:");
				String Tahmin = Klavye.next();
				if (Tahmin.equals(Kelime)) {
					System.out.println("Tebrikler Kazandýnýz!");
					break;
				}
			} else if (Secim == 2) {
				System.out.print("Yeni Harf Girinizi:");
				Sayac++;
				char girilen = Klavye.next().charAt(0);
				Gecmis[Sayac] = girilen;
				if (HarfTahmini(girilen, Kelime)) {
					System.out.println("Girdiðiniz Harf Bulundu!");
					KelimeYazdir();
				}
			} else if (Secim == 3) {
				for (int i = 0; i < Gecmis.length; i++) {
					if (Gecmis[i] != ' ') {
						System.out.print(Gecmis[i] + ", ");
					}
				}
				System.out.println();
			} else if (Secim == 4) {
				Sayac++;
				int Sayi = new Random().nextInt(Kelime.length());
				Char[Sayi - 1] = Kelime.charAt(Sayi - 1);
				System.out.println(String.format("Sizin için %s Harfini açtýk!", Kelime.charAt(Sayi - 1)));
			}
		}
	}

	static void KelimeYazdir() {
		for (int i = 0; i < Char.length; i++) {
			System.out.print(Char[i] + "/");
		}
		System.out.println();
	}

	static void CharOlustur() {
		for (int i = 0; i < Char.length; i++) {
			Char[i] = '_';
		}
	}

	static boolean HarfTahmini(char Harf, String Kelime) {
		boolean durum = false;
		for (int i = 0; i < Kelime.length(); i++) {
			if (Kelime.charAt(i) == Harf) {
				Char[i] = Harf;
				durum = true;
			}
		}
		return durum;
	}

}
