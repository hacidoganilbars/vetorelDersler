package Hafta5;

public class ForEachOrnegi {

	public static void main(String[] args) {

		String[] dizi = new String[6];
		dizi[0] = "Metin";
		dizi[1] = "Seda";
		dizi[2] = "O�uz";
		dizi[3] = "Mustafa";
		dizi[4] = "Hakan";
		dizi[5] = "Fatih";
		String[] dizi2 = new String[6];
		dizi[0] = "POLAT";
		dizi[1] = "D�ZENO�LU";
		dizi[2] = "�ENEL";
		dizi[3] = "G�KKOYUN";
		dizi[4] = "CEYLAN";
		dizi[5] = "SEV�M";

		for (String isim : dizi) {
			System.out.print(isim + " - ");
		}
		System.out.println();

		for (int i = 0; i < dizi.length; i++) {
			System.out.print(dizi[i] + " - ");
		}
	}
}
