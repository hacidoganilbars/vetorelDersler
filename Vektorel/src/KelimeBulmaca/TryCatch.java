package KelimeBulmaca;

import java.util.Scanner;

public class TryCatch {

	public static void main(String[] args) {
		Scanner Klavye = new Scanner(System.in);

		System.out.println("L�tfen Say� Giriniz:");
		try {
			int SS = Klavye.nextInt();
		} catch (Exception e) {
			System.out.println("Say� dedik o�lum?");
		}

	}

}
