package Hafta2;

import java.util.Scanner;

public class Odev2a {
	public static void main(String[] args) {
		System.out.println("1.Domates\t2.Patlıcan\t3.Salatalık\t4.Patetes\t5.Fasulye");
		System.out.print("Lütfen Bir Sebze Seçiniz: ");
		int secim = new Scanner(System.in).nextInt();
		if (!((secim > 0) && (secim < 6)))
			return;
		System.out.println("Kilogram Giriniz : ");
		double kg = new Scanner(System.in).nextDouble();
		if (secim == 1) {
			System.out.println("Domates'in Toplam Tutarı : " + (kg * 3.25));
		} else if (secim == 2) {
			System.out.println("Patlıcanın Toplam Tutarı : " + (kg * 2.25));
		} else if (secim == 3) {
			System.out.println("Salatalığın Toplam Tutarı : " + (kg * 0.25));
		} else if (secim == 4) {
			System.out.println("Patetesin Toplam Tutarı : " + (kg * 0.75));
		} else if (secim == 5) {
			System.out.println("Fasülyenin Toplam Tutarı : " + (kg * 6.25));
		} else {
			System.out.println("Böyle bir sebze kodu yoktur.");
		}
	}
}
