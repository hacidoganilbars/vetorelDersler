package KontrolIfadeleri;

import java.util.Scanner;

public class ElseIfOrnegi {

	public static void main(String[] args) {
		System.out.print("L�tfen 1 ile 10 Aras�nda Bir De�er Giriniz: ");
		Scanner Klavye = new Scanner(System.in);
		int girilenDeger = Klavye.nextInt();

		if (girilenDeger == 1) {
			System.out.println("Bir");
		}
		else if (girilenDeger == 2) {
			System.out.println("�ki");
		}
		else if (girilenDeger == 3) {
			System.out.println("��");
		}
		else {
			System.out.println("Ge�ersiz bir de�er giriniz");
		}
	}

}
