package Hafta3;

import java.util.Scanner;

public class Odev1 {

	public static void main(String[] args) {
		System.out.print("5 Karakterli Palindrom bir kelime giriniz:");
		String girilen = new Scanner(System.in).next();
		girilen = girilen.toUpperCase();
		if (girilen.length() == 5) {
			if (girilen.charAt(0) == girilen.charAt(4) && 
					girilen.charAt(1) == girilen.charAt(3)) {
				System.out.println(girilen + " Palindrom Bir Kelimedir!");
			} else {
				System.out.println(girilen + " Palindrom DEÐÝLDÝR!");
			}
		} else {
			System.out.println("5 Karakterden Fazla yada Eksik girdiniz!");
		}

	}
}
