package KontrolIfadeleri;

import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {
		System.out.print("L�tfen 1 ile 10 Aras�nda Bir De�er Giriniz: ");
		Scanner Klavye = new Scanner(System.in);
		
		int girilenDeger = Klavye.nextInt();
		switch (girilenDeger) {
		case 1:
			System.out.println("Bir");
			break;
		case 2:
			System.out.println("�ki");
			break;
		case 3:
			System.out.println("��");
			break;
		case 4:
			System.out.println("D�rt");
			break;
		case 5:
			System.out.println("Be�");
			break;
		default:
			System.out.println("Ge�ersiz De�er Girdiniz!");
			break;
		}
		
		
		
		String stringDeger = Klavye.next();
		switch (stringDeger) {
		case "06":
			System.out.println("Ankara Plakas� Girdiniz.");
			break;
		case "27":
			System.out.println("Gaziantep Plakas� Girdiniz.");
			break;
		default:
			System.out.println("Ge�ersiz bir plaka de�eri girdiniz.");
			break;
		}
		
	}
}
