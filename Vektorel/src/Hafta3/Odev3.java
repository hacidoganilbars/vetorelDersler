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
		System.out.print("Ki�i Say�s�:");
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
				"%s g�n� yapt���n�z al��veri� neticesinde toplamda %s al��veri� yapt�n�z. Sonu� olarak saat %s itibariyle ki�i ba��na d��en pay %s olup, yuvarlamayla %s 'dir",
				sdf.format(dt), nf.format(TTutar), sdf1.format(dt), (TTutar / Kisi), nf1.format((TTutar / Kisi)));
		System.out.println(Sonuc);
		Klavye.close();
	}

}
