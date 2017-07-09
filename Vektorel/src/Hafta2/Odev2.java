package Hafta2;

import java.util.Scanner;

public class Odev2 {

	public static void main(String[] args) {
		System.out.println("1.Domates\t2.Patlýcan\t3.Salatalýk\t4.Patetes\t5.Fasulye");
		System.out.print("Lütfen Bir Sebze Seçiniz: ");
		int secim = new Scanner(System.in).nextInt();
		System.out.println("Kilogram Giriniz : ");
		double kg = new Scanner(System.in).nextDouble();
		Scanner K = new Scanner(System.in);
		K.next();
		K.close();
		switch (secim) {
		case 1:
			System.out.println("Domates'in Toplam Tutarý : " + (kg * 3.25));
			break;
		case 2:
			System.out.println("Patlýcanýn Toplam Tutarý : " + (kg * 2.25));
			break;
		case 3:
			System.out.println("Salatalýðýn Toplam Tutarý : " + (kg * 0.25));
			break;
		case 4:
			System.out.println("Patetesin Toplam Tutarý : " + (kg * 0.75));
			break;
		case 5:
			System.out.println("Fasülyenin Toplam Tutarý : " + (kg * 6.25));
			break;
		default:
			System.out.println("Böyle bir sebze kodu yoktur.");
			break;
		}

	}

}
