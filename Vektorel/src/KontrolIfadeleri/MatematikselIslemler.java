package KontrolIfadeleri;

import java.util.Scanner;

public class MatematikselIslemler {

	public static void main(String[] args) {
		Scanner Klavye = new Scanner(System.in);
		int a, b;
		System.out.print("Ýnt olarak 1. Sayýyý Giriniz:");
		a = Klavye.nextInt();
		System.out.print("Ýnt olarak 2. Sayýyý Giriniz:");
		b = Klavye.nextInt();
		System.out.println(a + "+" + b + "=" + (a + b));
		System.out.println(a + "-" + b + "=" + (a - b));
		System.out.println(a + "/" + b + "=" + (a / b));
		System.out.println(a + "*" + b + "=" + (a * b));
		System.out.println(a + "%" + b + "=" + (a % b));
	}
}
