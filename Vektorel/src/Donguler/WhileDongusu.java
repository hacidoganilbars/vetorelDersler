package Donguler;

import java.util.Scanner;

public class WhileDongusu {

	public static void main(String[] args) {

		/*******************************************/
		/*
		 * int i = 0; while (i <= 15) { System.out.println(i); i++; }
		 * 
		 * i = 15; while (i >= 0) { System.out.println(i); i--; }
		 */
		/*******************************************/
		/*
		 * String Varolan = "159456"; Scanner Klavye = new Scanner(System.in);
		 * System.out.print("Þifre Girin:"); String Girilen = Klavye.next();
		 * while (true) { if (Varolan.equals(Girilen)) { break; }else {
		 * System.out.println("Hatalý Þifre"); System.out.print("Þifre Girin:");
		 * Girilen = Klavye.next(); } }
		 * System.out.println("Doðru Þifre Girdiniz!"); Klavye.close();
		 */
		int i = 0;
		while (i <= 15) {
			i++;
			if ((i % 2) == 1) {
				continue;
			} else {
				System.out.println(i);
			}
		}

	}
}
