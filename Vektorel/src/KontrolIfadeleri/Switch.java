package KontrolIfadeleri;

import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {
		System.out.print("Lütfen 1 ile 10 Arasýnda Bir Deðer Giriniz: ");
		Scanner Klavye = new Scanner(System.in);
		
		int girilenDeger = Klavye.nextInt();
		switch (girilenDeger) {
		case 1:
			System.out.println("Bir");
			break;
		case 2:
			System.out.println("Ýki");
			break;
		case 3:
			System.out.println("Üç");
			break;
		case 4:
			System.out.println("Dört");
			break;
		case 5:
			System.out.println("Beþ");
			break;
		default:
			System.out.println("Geçersiz Deðer Girdiniz!");
			break;
		}
		
		
		
		String stringDeger = Klavye.next();
		switch (stringDeger) {
		case "06":
			System.out.println("Ankara Plakasý Girdiniz.");
			break;
		case "27":
			System.out.println("Gaziantep Plakasý Girdiniz.");
			break;
		default:
			System.out.println("Geçersiz bir plaka deðeri girdiniz.");
			break;
		}
		
	}
}
