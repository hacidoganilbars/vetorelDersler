package com.vektorel.ders4.ornek1;

public class DizilerVeDonguler {

	public static void main(String[] args) {
		karesi(25);
		kokBul(25);

		// for (int i = 0; i <= 25; i++) {
		// int kare;
		// kare=i*i;
		// System.out.println("Kareler= "+kare);
		//
		// }

		//
		// int sayac = 25;
		// while (sayac > 0) {
		// double kok;
		// kok = Math.sqrt(sayac);
		// sayac--;
		// System.out.println("Kokler= " + kok);
		// }

	}

	static void karesi(int sayacFor) {
		for (int i = 0; i <= sayacFor; i++) {
			int kare;
			kare = i * i;
			System.out.println(kare);

		}

	}

	static void kokBul(int baslangicDegeri) {

		while (baslangicDegeri > 0) {
			double kok;
			kok = Math.sqrt(baslangicDegeri);
			baslangicDegeri--;
			System.out.println("Kokler= " + kok);
		}

	}

}
