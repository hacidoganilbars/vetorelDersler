package Hafta5;

import java.util.Scanner;

public class VCizimi {

	public static void main(String[] args) {
		System.out.print("Lütfen V Miktarý Giriniz:");
		int VMiktar = new Scanner(System.in).nextInt();
		for (int i = 0; i < VMiktar; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			System.out.print("*");
			for (int j = (VMiktar * 2 - i) - 1; j > i; j--) {
				System.out.print(" ");
			}
			System.out.println("*");
		}
		for (int j = 0; j < VMiktar; j++) {
			System.out.print(" ");
		}
		System.out.println("*");
	}
}
