package KontrolIfadeleri;

import java.util.Scanner;

public class HesapMakinesi {

	public static void main(String[] args) {
		int a, b;
		String c;
		Scanner Klavye = new Scanner(System.in);
		System.out.println("1: Toplama (+)\t2: ��karma (-)\t3: B�lme (/)\n4: �arpma (*)\t5: Mod Alma (%)");
		System.out.print("Yapmak istedi�iniz i�lemin Sembol�n� veya Numaras�n� giriniz: ");
		c = Klavye.next();
		System.out.print("1. Say�y� Giriniz:");
		a = Klavye.nextInt();
		System.out.print("2. Say�y� Giriniz:");
		b = Klavye.nextInt();
		if (c.equals("+") || c.equals("1")) {
			System.out.println("Toplama sonucu : " + (a + b));
		} else if (c.equals("-") || c.equals("2")) {
			System.out.println("��karma sonucu : " + (a - b));
		} else if (c.equals("/") || c.equals("3")) {
			System.out.println("B�lme sonucu : " + (a / b));
		} else if (c.equals("*") || c.equals("4")) {
			System.out.println("�arpma sonucu : " + (a * b));
		} else if (c.equals("%") || c.equals("5")) {
			System.out.println("Mod sonucu : " + (a % b));
		} else {
			System.out.println("Ge�ersiz Karakter Girdiniz!");
		}
		/**
		 * switch (c) { case "1": System.out.println("Toplama sonucu : " + (a +
		 * b)); break; case "2": System.out.println("��karma sonucu : " + (a -
		 * b)); break; case "3": System.out.println("B�lme sonucu : " + (a /
		 * b)); break; case "4": System.out.println("�arpma sonucu : " + (a *
		 * b)); break; case "5": System.out.println("Mod sonucu : " + (a % b));
		 * break; default: System.out.println("Ge�ersiz Karakter Girdiniz!");
		 * break; }
		 */
		Klavye.close();

	}
}
