package Hafta2;

import java.util.Scanner;

public class Odev3 {
	public static void main(String[] args) {
		System.out.println("Int Olarak Saat Bilgisini Giriniz :");
		int Saat = new Scanner(System.in).nextInt();
		// 7 - 12 Sabah
		// 12 - 17 Öğle
		// 17 - 20 Akşam
		// 20 - 23 Gece
		if ((Saat >= 0) && (Saat < 7))
			System.out.println("Kuşluk");
		else if ((Saat >= 7) && (Saat < 12))
			System.out.println("Sabah");
		else if ((Saat >= 12) && (Saat < 17))
			System.out.println("Öğle");
		else if ((Saat >= 17) && (Saat < 20))
			System.out.println("Akşam");
		else if ((Saat >= 20) && (Saat < 24))
			System.out.println("Gece");
		else
			System.out.println("Uzay Saati Geçerli Değildir.");

	}
}
