package Hafta5;

public class ForEachOrnegi {

	public static void main(String[] args) {

		String[] dizi = new String[6];
		dizi[0] = "Metin";
		dizi[1] = "Seda";
		dizi[2] = "Oðuz";
		dizi[3] = "Mustafa";
		dizi[4] = "Hakan";
		dizi[5] = "Fatih";
		String[] dizi2 = new String[6];
		dizi[0] = "POLAT";
		dizi[1] = "DÜZENOÐLU";
		dizi[2] = "ÞENEL";
		dizi[3] = "GÖKKOYUN";
		dizi[4] = "CEYLAN";
		dizi[5] = "SEVÝM";

		for (String isim : dizi) {
			System.out.print(isim + " - ");
		}
		System.out.println();

		for (int i = 0; i < dizi.length; i++) {
			System.out.print(dizi[i] + " - ");
		}
	}
}
