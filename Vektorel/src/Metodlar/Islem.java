package Metodlar;

public class Islem {

	public static void main(String[] args) {
		Temizlik.Temizle("�n Bah�e Kat�");
		String DonusDegeri = Sekreter.Arama("541 319 70 60", "Muhasebe ��lemleriniz Tamamland�");
		System.out.println(DonusDegeri);
		Temizlik.Temizle("Ofis i�erisi");
		double OdenecekVergi = KDVHesapla(15600);
		DonusDegeri = Sekreter.Arama("507 133 Ankara Gaziantep", "�demeniz gereken Vergi tutar� : " + OdenecekVergi);
		System.out.println(DonusDegeri);
		System.out.println(Temizlik.ToplamTemizikSayisi());
	}

	private static double KDVHesapla(double KDVMatrah) {
		return (KDVMatrah * 1.18) - KDVMatrah;
	}
}
