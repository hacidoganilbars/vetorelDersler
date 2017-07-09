package Hafta6;

import java.util.Scanner;

public class Odev1a {

	public static void main(String[] args) {
		Scanner Klavye = new Scanner(System.in);
		System.out.print("Kaç kelime girmek istersiniz? : ");
		String[] Liste = new String[Klavye.nextInt()];
		for (int i = 0; i < Liste.length; i++) {
			Liste[i] = Klavye.next();
		}
		for (int i = 0; i < Liste.length; i++) {
			System.out.print(Liste[i] + ",");
		}
		Klavye.close();
	}
}
