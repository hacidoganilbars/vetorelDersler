package Emlakci;

import java.util.Scanner;

public class Islem2 {

	public static void main(String[] args) {
		System.out.print("L�tfen Ev Say�s� Giriniz:");
		Scanner Klavye = new Scanner(System.in);
		Ev Evler[] = new Ev[Klavye.nextInt()];

		for (int i = 0; i < Evler.length; i++) {
			Evler[i] = new Ev();
			System.out.print((i + 1) + ". Ev i�in Oda Say�s� \t:");
			Evler[i].odaSayisi = Klavye.nextInt();
			System.out.print((i + 1) + ". Ev i�in Kat Numaras� \t:");
			Evler[i].katNumarasi = Klavye.nextInt();
			System.out.print((i + 1) + ". Ev i�in Semt Bilgisi \t:");
			Evler[i].semt = Klavye.next();
			System.out.print((i + 1) + ". Ev i�in Evin Fiyat� \t:");
			Evler[i].fiyat = Klavye.nextDouble();
			System.out.print((i + 1) + ". Ev i�in Depozitosu \t:");
			Evler[i].depozito = Klavye.nextDouble();
			System.out.print((i + 1) + ". Ev i�in Metre Karesi \t:");
			Evler[i].metreKare = Klavye.nextInt();

			// Evler[i] = new Ev(odaSayisi, katNumarasi, semt, fiyat, depozito,
			// metreKare);
		}
		for (int i = 0; i < Evler.length; i++) {
			System.out.println(Evler[i].EvBilgileri());
			System.out.println();
		}
	}
}
