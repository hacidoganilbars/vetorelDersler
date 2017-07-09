package Hafta3;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Odev2 {
	public static void main(String[] args) {
		System.out.println("Toplam Bütçe");
		double Butce = new Scanner(System.in).nextDouble();
		NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.getDefault());
		String Sonuc = String.format("1.\tMehmet\t:%s\n2.\tAhmet\t:%s\n3.\tAyþe\t:%s",
				nf.format((Butce * (30 / 100.00))), nf.format(((Butce * 30)) / 100), nf.format((Butce * 0.40)));
		System.out.println(Sonuc);
	}
}
