package Hafta2;

import java.util.Random;
import java.util.Scanner;

public class Odev1 {
	public static void main(String[] args) {
		int sistemSayisi = new Random().nextInt(30);
		System.out.println("Tahmin Oyunu Ba�lam��t�r. " + sistemSayisi);
		for (int i = 1; i < 6; i++) {
			System.out.print(i + ". Tahmininizi Giriniz: ");
			int tahminEdilen = new Scanner(System.in).nextInt();
			if (tahminEdilen == sistemSayisi) {
				System.out.println("Tebrikler ! ! !");
				System.out.println("Oyuna Devak Etmek ��in : 1- Evet yada 2- Hay�r");
				int cevap = new Scanner(System.in).nextInt();
				if (cevap == 1) {
					i = 0;
					sistemSayisi = new Random().nextInt(30);
					System.out.println("Oyun Yeniden Ba�l�yor.");
				} else {
					System.out.println("Bizi Tercih Etti�iniz i�in Te�ekk�r Ederiz.");
					break;
				}
			}
			if (i == 5) {
				System.out.println("Oyun Bitmi�tir.");
			}
		}
	}
}
