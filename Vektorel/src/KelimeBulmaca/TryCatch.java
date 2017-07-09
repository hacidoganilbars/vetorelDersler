package KelimeBulmaca;

import java.util.Scanner;

public class TryCatch {

	public static void main(String[] args) {
		Scanner Klavye = new Scanner(System.in);

		System.out.println("Lütfen Sayý Giriniz:");
		try {
			int SS = Klavye.nextInt();
		} catch (Exception e) {
			System.out.println("Sayý dedik oðlum?");
		}

	}

}
