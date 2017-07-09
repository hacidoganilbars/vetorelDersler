package Donguler;

import java.util.Scanner;

public class ForDongusu {

	public static void main(String[] args) {
		/***********************************************/
		/*
		 * int Sonuc = 1; for (int i = 1; i <= 15; i++) { Sonuc = Sonuc * i;
		 * System.out.println(i); }
		 */
		/***********************************************/
		/*
		 * for (int i = 15; i >= 1; i--) { System.out.println(i); }
		 * 
		 * for (;;) { System.out.println("Metin Oktay"); }
		 */
		String Varolan = "159456";
		Scanner Klavye = new Scanner(System.in);
		System.out.print("Þifre Girin:");
		String Girilen = Klavye.next();
		for (;;) {
			if (Varolan.equals(Girilen)) {
				break;
			}else {
				System.out.println("Hatalý Þifre");
				System.out.print("Þifre Girin:");
				Girilen = Klavye.next();
			}
		}
		System.out.println("Doðru Þifre Girdiniz!");
		Klavye.close();
	}
}
