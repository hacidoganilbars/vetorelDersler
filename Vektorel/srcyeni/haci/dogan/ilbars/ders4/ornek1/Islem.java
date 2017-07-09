package haci.dogan.ilbars.ders4.ornek1;

import java.util.Scanner;

class Islem {

	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		int sayim;
		int toplam = 0;
		System.out.print("Kaç sayý girilecek: ");
		int sayi = klavye.nextInt();
		for (int i = 1; i <= sayi; i++) {
			System.out.print(i + ". Sayiyi giriniz: ");
			sayim = klavye.nextInt();
			toplam += sayim;

		}
		klavye.close();
		System.out.println();
		System.out.println(toplam);
		double ortalama = toplam / sayi;

		ortalamaBul(ortalama);

	}

	static void ortalamaBul(double ortalama) {
		if (ortalama % 2 == 0) {
			ciftOrtalama(ortalama);
		} else {
			tekOrtalama(ortalama);
		}

	}

	static void ciftOrtalama(double ortalama) {
		System.out.println(Math.pow(ortalama, 2));
	}

	static void tekOrtalama(double ortalama) {

		System.out.println(Math.pow(ortalama, 3));

	}
}
