package KontrolIfadeleri;

public class KontrolOrnegi {

	public static void main(String[] args) {
		int a = 5, b = 10;
		// S�sl� Parantez Kullanmama
		/*
		 * if (a == 5) System.out.println("A 5'e E�ittir."); else if (a == b)
		 * System.out.println("A B'ye E�ittir."); else
		 * System.out.println("A 5 ve B ye e�it de�il.");
		 * 
		 * 
		 * String sonuc = (a == b) ? "A E�it B" : ((a < b) ? "A k���k B" :
		 * "A B�y�k B"); System.out.println("1. ��lem Sonucu :" + sonuc); if (a
		 * == b) { System.out.println("A E�it B"); } else if (a < b) {
		 * System.out.println("A k���k B"); } else {
		 * System.out.println("A B�y�k B"); }
		 */
		int cinsiyetNo = 1;
		String Cinsiyet = (cinsiyetNo == 1) ? "Erkek" : "Kad�n";
		System.out.println(Cinsiyet);

	}

}
