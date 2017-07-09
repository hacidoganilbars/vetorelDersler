package KelimeBulmaca;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class KelimeBulma {

	public static void main(String[] args) {
		String fileLocation = "D:\\kelime-listesi-ilk.txt";
		String Kelime = "";
		List<String> Liste = new ArrayList();
		File dosya = new File(fileLocation);
		try {
			if (dosya.exists()) {
				FileReader rd = new FileReader(fileLocation);
				BufferedReader reader = new BufferedReader(rd);
				String satir = reader.readLine();
				while (satir != null) {
					Liste.add(satir);
					satir = reader.readLine();
				}
			}
			Random rnd = new Random();
			Kelime = Liste.get(rnd.nextInt(Liste.size()));
		} catch (Exception e) {
			System.out.println("Dosya Okumada Bir Sorun Oluþtu.");
		}
		int Sayac = 0;
		Scanner Klavye = new Scanner(System.in);
		int Sans = (Kelime.length() / 2);
		System.out.println(Kelime);
		char[] Char = Kelime.toCharArray();
		for (int i = 0; i < Char.length; i++) {
			Char[i] = '_';
		}
		for (int i = 0; i < Char.length; i++) {
			System.out.print(Char[i] + "/");
		}
		System.out.println();
		char[] Gecmis = new char[Kelime.length()];

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
				System.out.print("Yeni Harf Giriniz:");
				Sayac++;
				char girilen = Klavye.next().charAt(0);
				Gecmis[Sayac] = girilen;
				boolean durum = false;
				for (int i = 0; i < Kelime.length(); i++) {
					if (Kelime.charAt(i) == girilen) {
						Char[i] = girilen;
						durum = true;
					}
				}
				if (durum) {
					System.out.println("Girdiðiniz Harf Bulundu!");
				} else {
					System.out.println("Bu Harf bulunamadý");
				}
				for (int i = 0; i < Char.length; i++) {
					System.out.print(Char[i] + "/");
				}
				System.out.println();
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
}
