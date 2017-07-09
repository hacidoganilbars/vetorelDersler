package Hafta2;

import java.util.Random;
import java.util.Scanner;

public class Odev1 {
	public static void main(String[] args) {
		int sistemSayisi = new Random().nextInt(30);
		System.out.println("Tahmin Oyunu Baþlamýþtýr. " + sistemSayisi);
		for (int i = 1; i < 6; i++) {
			System.out.print(i + ". Tahmininizi Giriniz: ");
			int tahminEdilen = new Scanner(System.in).nextInt();
			if (tahminEdilen == sistemSayisi) {
				System.out.println("Tebrikler ! ! !");
				System.out.println("Oyuna Devak Etmek Ýçin : 1- Evet yada 2- Hayýr");
				int cevap = new Scanner(System.in).nextInt();
				if (cevap == 1) {
					i = 0;
					sistemSayisi = new Random().nextInt(30);
					System.out.println("Oyun Yeniden Baþlýyor.");
				} else {
					System.out.println("Bizi Tercih Ettiðiniz için Teþekkür Ederiz.");
					break;
				}
			}
			if (i == 5) {
				System.out.println("Oyun Bitmiþtir.");
			}
		}
	}
}
