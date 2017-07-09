package Hafta6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Odev3 {

	public static void main(String[] args) {
		String[] Ad = new String[] { "Ahmet", "Mehmet", "Ali", "Veli", "Ayþe" };
		List<String> Soyad = new ArrayList();
		Soyad.add("Soyad1");
		Soyad.add("Soyad2");
		Soyad.add("Soyad3");
		Soyad.add("Soyad4");
		Soyad.add("Soyad5");

		List<String> Toplu = new ArrayList();

		// Eski usül birleþtirme yöntemleri
		
		for (int i = 0; i < Ad.length; i++) {
			Toplu.add(Ad[i]);
		}
		for (String item : Soyad) {
			Toplu.add(item);
		}
		
		// ArrayList özelliði ile birleþtirme
		Toplu.addAll(Arrays.asList(Ad));
		Toplu.addAll(Soyad);

		for (String item : Toplu) {
			System.out.print(item + ",");
		}
	}
}
