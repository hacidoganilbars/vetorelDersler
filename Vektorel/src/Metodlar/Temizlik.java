package Metodlar;

public class Temizlik {
	private static int TemizlikSayisi = 0;

	public static void Temizle(String TemizlenecekYer) {
		System.out.println(TemizlenecekYer + " i�in temizlik tamamland�.");
		TemizlikSayisi++;
	}

	public static int ToplamTemizikSayisi() {
		return TemizlikSayisi;
	}
}
