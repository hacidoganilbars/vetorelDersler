package Hafta6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Odev1 {
	public static void main(String[] args) {
		System.out.println("Ýstediðiniz kadar kelime girebilirsiniz.");
		System.out.println("Kelime giriþini durdurmak için -1 yazýnýz.");
		List<String> Liste = new ArrayList();
		while (true) {
			String deger = new Scanner(System.in).nextLine();
			if (deger.equals("-1")) {
				break;
			} else {
				Liste.add(deger);
			}
		}
		for (String item : Liste) {
			System.out.print(item + ",");
		}
	}
}
