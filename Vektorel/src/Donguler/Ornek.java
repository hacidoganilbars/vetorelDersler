package Donguler;

public class Ornek {

	public static void main(String[] args) {
		int Sayi = 1323;
		switch (Sayi / 1000) {
		case 1:
			System.out.print("Bin");
			break;
		case 2:
			System.out.print("�ki Bin");
			break;
		case 3:
			System.out.print("�� Bin");
			break;
		default:
			break;
		}
		switch ((Sayi / 100) % 10) {
		case 1:
			System.out.print(" Y�z");
			break;
		case 2:
			System.out.print(" �kiy�z");
			break;
		case 3:
			System.out.print(" ��y�z");
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
			System.out.print(" �ki");
			break;
		case 3:
			System.out.print(" ��");
			break;
		default:
			break;
		}
	}
}
