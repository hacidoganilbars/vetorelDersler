package KontrolIfadeleri;

import java.util.Scanner;

public class MatematikselIslemler {

	public static void main(String[] args) {
		Scanner Klavye = new Scanner(System.in);
		int a, b;
		System.out.print("�nt olarak 1. Say�y� Giriniz:");
		a = Klavye.nextInt();
		System.out.print("�nt olarak 2. Say�y� Giriniz:");
		b = Klavye.nextInt();
		System.out.println(a + "+" + b + "=" + (a + b));
		System.out.println(a + "-" + b + "=" + (a - b));
		System.out.println(a + "/" + b + "=" + (a / b));
		System.out.println(a + "*" + b + "=" + (a * b));
		System.out.println(a + "%" + b + "=" + (a % b));
	}
}
