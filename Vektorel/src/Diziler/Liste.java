package Diziler;

import java.util.ArrayList;
import java.util.List;

public class Liste {

	public static void main(String[] args) {

		List<String> Ogrenci = new ArrayList();
		Ogrenci.add("Metin Oktay");
		Ogrenci.add("Metin Oktay3");
		Ogrenci.add("Metin Oktay4");
		Ogrenci.add("Metin Oktay2");
		System.out.println(Ogrenci.size());
		List<String> Ogrenciler = new ArrayList();
		// Ogrenci.remove("Metin Oktay");
		// Ogrenci.sort(null);
		// System.out.println(Ogrenci.get(Ogrenci.lastIndexOf("Metin Oktay4")));
		// System.out.println(Ogrenci.toString());
		for (String item : Ogrenci) {
			System.out.print(item + ", ");
		}
		System.out.println();
		List<Integer> Sayilar = new ArrayList();
		Sayilar.add(5);
		Sayilar.add(10);
		Sayilar.add(15);
		Sayilar.add(20);

		for (int i = 0; i < Sayilar.size(); i++) {
			System.out.println(Sayilar.get(i));
		}

	}
}
