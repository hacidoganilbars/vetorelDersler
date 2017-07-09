package TurDonusumleri;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Islem {

	public static void main(String[] args) {
		int Sayi1 = 165;
		byte Sayi2 = 100;
		double Sayi3 = 125.5165465465465156;

		String yaz = String.format("Birinci Sayýmýz: %.2f TL", Sayi3);

		yaz = String.format("\"%s\"", Sayi1);
		// System.out.println("\"" + Sayi1 + "\"");
		// System.out.println("\"" + Sayi3 + "\"");
		// System.out.println(String.format("\"%.2f\"", Sayi3));
		/*
		 * NumberFormat formatter = new DecimalFormat("#0.000");
		 * System.out.println(formatter.format(Sayi3));
		 * System.out.println(String.format("%s", Sayi3));
		 * 
		 * SimpleDateFormat dateformatter = new SimpleDateFormat("dd/MM/yyyy");
		 * String date = dateformatter.format(new Date());
		 * System.out.println(date); // 15/10/2013
		 */

		// YYYY = 2017
		// MM = 11
		// dd = 30
		// SimpleDateFormat dFormat = new SimpleDateFormat("dd.MM.yyyy");
		SimpleDateFormat dYil = new SimpleDateFormat("yyyy");
		SimpleDateFormat dAy = new SimpleDateFormat("MM");
		SimpleDateFormat dGun = new SimpleDateFormat("dd");

		Date tarihimiz = new Date();// dFormat.parse("30.11.2017");
		String formatliTarih = String.format("%s Yýlýnýn %s Ayýnýn %s Günü", dYil.format(tarihimiz),
				dAy.format(tarihimiz), dGun.format(tarihimiz));
		// System.out.println(formatliTarih);
		// System.out.println("2017 Yýlýnýn 11 Ayýnýn 30 günü");

		/*
		 * Date tarih = new Date(); SimpleDateFormat uzunFormat = new
		 * SimpleDateFormat("dd.MM.yyyy HH:mm:ss"); SimpleDateFormat uzunFormat2
		 * = new SimpleDateFormat("dddd.MMMM.yyyyyy HH:mm:ss"); SimpleDateFormat
		 * uzunFormat3 = new SimpleDateFormat("dd.MMM.yy HH:mm:ss");
		 * SimpleDateFormat uzunFormat4 = new
		 * SimpleDateFormat("EEEE.MMMM.yy HH:mm:ss"); SimpleDateFormat
		 * uzunFormat5 = new SimpleDateFormat("EEE.MMMM.yy HH:mm:ss");
		 * SimpleDateFormat uzunFormat6 = new
		 * SimpleDateFormat("EEE.MMMM.yy HH:mm:ss zzzz"); SimpleDateFormat
		 * uzunFormat7 = new SimpleDateFormat("EEE.MMMM.yy HH:mm:ss zz");
		 * SimpleDateFormat uzunFormat8 = new
		 * SimpleDateFormat("dd.kk-MM-yy HH:mm:ss zz"); SimpleDateFormat
		 * GlobalFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
		 * System.out.println(GlobalFormat.format(tarih));
		 */

		StringBuilder sb = new StringBuilder();
		byte d1 = 1;
		short d2 = 2;
		int d3 = 3;
		float d4 = 4f;
		double d5 = 5d;
		String d6 = "Merhaba Dünya";
		char d7 = 'H';
		char d8 = 'A';
		char d9 = 'C';
		char d10 = 'I';

		System.out.println(d1 + "\n" + d2 + "\n" + d3 + "\n" + d4 + "\n" + d5 + "\n" + d6 + "\n" + d7 + d8 + d9 + d10);
		sb.append(d1);
		sb.append("\n");
		sb.append(d2);
		sb.append("\n");
		sb.append(d3);
		sb.append("\n");
		sb.append(d4);
		sb.append("\n");
		sb.append(d5);
		sb.append("\n");
		sb.append(d6);
		sb.append("\n");
		sb.append(d7);
		sb.append(d8);
		sb.append(d9);
		sb.append(d10);
		System.out.println(sb.toString());

		String str1 = " public class Islem {";
		String str2 = "	public static void main(String[] args) {";
		String str3 = " 		int Sayi1 = 165;";
		String str4 = "	byte Sayi2 = 100;";
		String str5 = "	double Sayi3 = 125.5165465465465156;";
		String str6 = "                                        ";
		String str7 = "		String yaz = String.format(Birinci Sayýmýz: %.2f TL, Sayi3);";
		String str8 = "	}";
		String str9 = "}";

	}
}
