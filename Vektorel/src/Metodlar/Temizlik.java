package Metodlar;

public class Temizlik {
	private static int TemizlikSayisi = 0;

	public static void Temizle(String TemizlenecekYer) {
		System.out.println(TemizlenecekYer + " için temizlik tamamlandý.");
		TemizlikSayisi++;
	}

	public static int ToplamTemizikSayisi() {
		return TemizlikSayisi;
	}
}
