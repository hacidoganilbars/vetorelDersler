package DegiskenlerEx;

import java.util.Scanner;

public class IslemEx {

	public static void main(String[] args) {
		// System.out.println(Islem.sinifBilgisi);
		// String Ad = "Metin Oktay";
		// String Soyad = " POLAT";
		// System.out.println(Ad + Soyad);
		// System.out.print(Ad);
		// System.out.print(Soyad);

		System.out.print("L�tfen Double bir say� giriniz:");
		Scanner Klavye = new Scanner(System.in);
		// double girilenDeger = Klavye.nextDouble();
		// System.out.println("Girdi�iniz Deger : " + girilenDeger);
		System.out.println("Girdi�iniz Deger : " + Klavye.nextDouble());

		int a = 10;
		int b = 7;
		if (a == b) {
			System.out.print(a);
		} else {
			System.out.print(b);
		}
	}
}
