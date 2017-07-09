package Diziler;

import java.util.Scanner;

public class Ogrenci {

	public static void main(String[] args) {
		System.out.print("Ka� tane ��renci kay�t etmek istiyorsunuz?:");
		int kayitSayisi = new Scanner(System.in).nextInt();
		String Ogrenciler[] = new String[kayitSayisi];
		for (int i = 0; i < Ogrenciler.length; i++) {
			System.out.print((i + 1) + ". ��renci �smini Giriniz:");
			Ogrenciler[i] = new Scanner(System.in).next();
		}
		System.out.println("Giri� i�lemleri ba�ar�yla tamamland�.");
		System.out.println("Hangi ��renciye ait isim bilgisini g�rmek istiyorsan�z s�ra numaras�n� giridiniz.");
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
			System.out.println("��renci listemizde olan kay�t numaralar�n�n d���nda bir numara gidridiniz.");
		}

	}
}
