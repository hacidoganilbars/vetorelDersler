package HesapMakinasi;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Islem2 {

	public static void main(String[] args) {
		List<Double> Sayilar = new ArrayList<Double>();
		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();
		Sayilar = ListeOlustur(Sayilar, rnd);

		while (true) {
			System.out.println("1. Randomu Yenile\t 2. Rastgele Sayi ver");
			int Islem = sc.nextInt();
			if (Islem == 1) {
				Sayilar = ListeOlustur(Sayilar, rnd);
			} else {
				int Sayi = rnd.nextInt(100);
				System.out.println(Sayilar.get(Sayi));
			}
		}
	}

	static List<Double> ListeOlustur(List<Double> Liste, Random rnd) {
		Liste.clear();
		for (int i = 0; i < 100; i++) {
			Liste.add(rnd.nextDouble());
		}
		return Liste;
	}
}
