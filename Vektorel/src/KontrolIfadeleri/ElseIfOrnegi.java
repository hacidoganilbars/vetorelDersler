package KontrolIfadeleri;

import java.util.Scanner;

public class ElseIfOrnegi {

	public static void main(String[] args) {
		System.out.print("Lütfen 1 ile 10 Arasýnda Bir Deðer Giriniz: ");
		Scanner Klavye = new Scanner(System.in);
		int girilenDeger = Klavye.nextInt();

		if (girilenDeger == 1) {
			System.out.println("Bir");
		}
		else if (girilenDeger == 2) {
			System.out.println("Ýki");
		}
		else if (girilenDeger == 3) {
			System.out.println("Üç");
		}
		else {
			System.out.println("Geçersiz bir deðer giriniz");
		}
	}

}
