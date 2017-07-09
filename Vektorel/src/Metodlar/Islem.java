package Metodlar;

public class Islem {

	public static void main(String[] args) {
		Temizlik.Temizle("Ön Bahçe Katý");
		String DonusDegeri = Sekreter.Arama("541 319 70 60", "Muhasebe Ýþlemleriniz Tamamlandý");
		System.out.println(DonusDegeri);
		Temizlik.Temizle("Ofis içerisi");
		double OdenecekVergi = KDVHesapla(15600);
		DonusDegeri = Sekreter.Arama("507 133 Ankara Gaziantep", "Ödemeniz gereken Vergi tutarý : " + OdenecekVergi);
		System.out.println(DonusDegeri);
		System.out.println(Temizlik.ToplamTemizikSayisi());
	}

	private static double KDVHesapla(double KDVMatrah) {
		return (KDVMatrah * 1.18) - KDVMatrah;
	}
}
