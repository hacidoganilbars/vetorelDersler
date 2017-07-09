package KontrolIfadeleri;

import java.util.Scanner;

public class HesapMakinesi {

	public static void main(String[] args) {
		int a, b;
		String c;
		Scanner Klavye = new Scanner(System.in);
		System.out.println("1: Toplama (+)\t2: Çýkarma (-)\t3: Bölme (/)\n4: Çarpma (*)\t5: Mod Alma (%)");
		System.out.print("Yapmak istediðiniz iþlemin Sembolünü veya Numarasýný giriniz: ");
		c = Klavye.next();
		System.out.print("1. Sayýyý Giriniz:");
		a = Klavye.nextInt();
		System.out.print("2. Sayýyý Giriniz:");
		b = Klavye.nextInt();
		if (c.equals("+") || c.equals("1")) {
			System.out.println("Toplama sonucu : " + (a + b));
		} else if (c.equals("-") || c.equals("2")) {
			System.out.println("Çýkarma sonucu : " + (a - b));
		} else if (c.equals("/") || c.equals("3")) {
			System.out.println("Bölme sonucu : " + (a / b));
		} else if (c.equals("*") || c.equals("4")) {
			System.out.println("Çarpma sonucu : " + (a * b));
		} else if (c.equals("%") || c.equals("5")) {
			System.out.println("Mod sonucu : " + (a % b));
		} else {
			System.out.println("Geçersiz Karakter Girdiniz!");
		}
		/**
		 * switch (c) { case "1": System.out.println("Toplama sonucu : " + (a +
		 * b)); break; case "2": System.out.println("Çýkarma sonucu : " + (a -
		 * b)); break; case "3": System.out.println("Bölme sonucu : " + (a /
		 * b)); break; case "4": System.out.println("Çarpma sonucu : " + (a *
		 * b)); break; case "5": System.out.println("Mod sonucu : " + (a % b));
		 * break; default: System.out.println("Geçersiz Karakter Girdiniz!");
		 * break; }
		 */
		Klavye.close();

	}
}
