package Diziler;

import java.util.Scanner;

public class Ogrenci {

	public static void main(String[] args) {
		System.out.print("Kaç tane öðrenci kayýt etmek istiyorsunuz?:");
		int kayitSayisi = new Scanner(System.in).nextInt();
		String Ogrenciler[] = new String[kayitSayisi];
		for (int i = 0; i < Ogrenciler.length; i++) {
			System.out.print((i + 1) + ". Öðrenci Ýsmini Giriniz:");
			Ogrenciler[i] = new Scanner(System.in).next();
		}
		System.out.println("Giriþ iþlemleri baþarýyla tamamlandý.");
		System.out.println("Hangi öðrenciye ait isim bilgisini görmek istiyorsanýz sýra numarasýný giridiniz.");
		int siraNumarasi = new Scanner(System.in).nextInt();
		if (siraNumarasi <= Ogrenciler.length && siraNumarasi >= 0) {
			if (siraNumarasi == 0) {
				for (int i = 0; i < Ogrenciler.length; i++) {
					System.out.println(Ogrenciler[i]);
				}
			} else {
				System.out.println(Ogrenciler[siraNumarasi - 1]);
			}
		} else {
			System.out.println("Öðrenci listemizde olan kayýt numaralarýnýn dýþýnda bir numara gidridiniz.");
		}

	}
}
