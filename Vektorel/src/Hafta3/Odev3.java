package Hafta3;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Odev3 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Scanner Klavye = new Scanner(System.in);
		System.out.print("Kiþi Sayýsý:");
		int Kisi = Klavye.nextInt();
		System.out.print("Toplam Tutar:");
		double TTutar = Klavye.nextDouble();

		Date dt = new Date();
		dt.setHours(-24);
		SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy EEEE");
		SimpleDateFormat sdf1 = new SimpleDateFormat("HH:mm");
		NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.getDefault());
		NumberFormat nf1 = NumberFormat.getNumberInstance(Locale.getDefault());
		String Sonuc = String.format(
				"%s günü yaptýðýnýz alýþveriþ neticesinde toplamda %s alýþveriþ yaptýnýz. Sonuç olarak saat %s itibariyle kiþi baþýna düþen pay %s olup, yuvarlamayla %s 'dir",
				sdf.format(dt), nf.format(TTutar), sdf1.format(dt), (TTutar / Kisi), nf1.format((TTutar / Kisi)));
		System.out.println(Sonuc);
		Klavye.close();
	}

}
