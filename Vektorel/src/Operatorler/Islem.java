package Operatorler;

public class Islem {

	public static void main(String[] args) {
		int Sayi1 = 10, Sayi2 = 15, Sayi3 = 20, Sonuc;

		// + Operatörü ile Toplama Ýþlemi
		// Sonuc = Sayi1 + Sayi2;
		// System.out.println(Sonuc);

		// - Operatörü ile Çýkarma Ýþlemi
		// Sonuc = Sayi1 - Sayi2;
		// System.out.println(Sonuc);

		// * Operatörü ile Çarpma Ýþlemi
		// Sonuc = Sayi1 * Sayi2;
		// System.out.println(Sonuc);

		// '/' Operatörü ile Bölme Ýþlemi
		// Sonuc = Sayi3 / Sayi1;
		// System.out.println(Sonuc);
		/*
		 * int Ornek1 = 1, Ornek2 = 1, Ornek3 = 1, Ornek4 = 1;
		 * 
		 * System.out.println(Ornek1++); System.out.println(++Ornek2);
		 * System.out.println(Ornek3--); System.out.println(--Ornek4);
		 * System.out.println("--------------------------------");
		 * System.out.println(Ornek1); System.out.println(Ornek2);
		 * System.out.println(Ornek3); System.out.println(Ornek4);
		 */

		// Sonuc = Sayi3 % 3;
		// System.out.println(Sonuc);

		String Barkod = "979975329368";
		int Cift = 0, Tek = 0;
		for (int i = 0; i < Barkod.length(); i++) {
			if (i % 2 == 0) {
				Cift += Integer.parseInt(Character.toString(Barkod.charAt(i)));
			}
			else {
				Tek += Integer.parseInt(Character.toString(Barkod.charAt(i)));
			}	
		}
		System.out.println(Tek);
		int Adim2 = Tek * 3;
		System.out.println(Adim2);
		System.out.println(Cift);
		int Adim4 = Adim2 + Cift;
		System.out.println(Adim4);
		if ((10 - (Adim4 % 10)) >= 10) {
			System.out.println(0);
		}
		else {
			System.out.println((10 - (Adim4 % 10)));
		}
		//int sonuc = (10 - ((Tek * 3) + Cift) % 10);
		//System.out.println(sonuc);
	}

}
