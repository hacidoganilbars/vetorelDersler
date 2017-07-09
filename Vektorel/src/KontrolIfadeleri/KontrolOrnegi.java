package KontrolIfadeleri;

public class KontrolOrnegi {

	public static void main(String[] args) {
		int a = 5, b = 10;
		// Süslü Parantez Kullanmama
		/*
		 * if (a == 5) System.out.println("A 5'e Eþittir."); else if (a == b)
		 * System.out.println("A B'ye Eþittir."); else
		 * System.out.println("A 5 ve B ye eþit deðil.");
		 * 
		 * 
		 * String sonuc = (a == b) ? "A Eþit B" : ((a < b) ? "A küçük B" :
		 * "A Büyük B"); System.out.println("1. Ýþlem Sonucu :" + sonuc); if (a
		 * == b) { System.out.println("A Eþit B"); } else if (a < b) {
		 * System.out.println("A küçük B"); } else {
		 * System.out.println("A Büyük B"); }
		 */
		int cinsiyetNo = 1;
		String Cinsiyet = (cinsiyetNo == 1) ? "Erkek" : "Kadýn";
		System.out.println(Cinsiyet);

	}

}
