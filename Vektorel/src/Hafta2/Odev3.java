package Hafta2;

import java.util.Scanner;

public class Odev3 {
	public static void main(String[] args) {
		System.out.println("Int Olarak Saat Bilgisini Giriniz :");
		int Saat = new Scanner(System.in).nextInt();
		// 7 - 12 Sabah
		// 12 - 17 ��le
		// 17 - 20 Ak�am
		// 20 - 23 Gece
		if ((Saat >= 0) && (Saat < 7))
			System.out.println("Ku�luk");
		else if ((Saat >= 7) && (Saat < 12))
			System.out.println("Sabah");
		else if ((Saat >= 12) && (Saat < 17))
			System.out.println("��le");
		else if ((Saat >= 17) && (Saat < 20))
			System.out.println("Ak�am");
		else if ((Saat >= 20) && (Saat < 24))
			System.out.println("Gece");
		else
			System.out.println("Uzay Saati Ge�erli De�ildir.");

	}
}
