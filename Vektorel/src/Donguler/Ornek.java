package Donguler;

public class Ornek {

	public static void main(String[] args) {
		int Sayi = 1323;
		switch (Sayi / 1000) {
		case 1:
			System.out.print("Bin");
			break;
		case 2:
			System.out.print("Ýki Bin");
			break;
		case 3:
			System.out.print("Üç Bin");
			break;
		default:
			break;
		}
		switch ((Sayi / 100) % 10) {
		case 1:
			System.out.print(" Yüz");
			break;
		case 2:
			System.out.print(" Ýkiyüz");
			break;
		case 3:
			System.out.print(" Üçyüz");
			break;
		default:
			break;
		}
		switch ((Sayi / 10) % 10) {
		case 1:
			System.out.print(" On");
			break;
		case 2:
			System.out.print(" Yirmi");
			break;
		case 3:
			System.out.print(" Otuz");
			break;
		default:
			break;
		}
		switch (Sayi % 10) {
		case 1:
			System.out.print(" Bir");
			break;
		case 2:
			System.out.print(" Ýki");
			break;
		case 3:
			System.out.print(" Üç");
			break;
		default:
			break;
		}
	}
}
