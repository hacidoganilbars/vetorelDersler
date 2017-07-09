package Kapsulleme;

public class Islem {

	public static void main(String[] args) {

		mdlOgrenci Ogrenci = new mdlOgrenci();
		Ogrenci.Ad(" Metin Oktay POLAT ");
		System.out.println(Ogrenci.Ad());
		Ogrenci.Yas(18);
		System.out.println(Ogrenci.Yas());
		System.out.println(Ogrenci.Soyad());

	}

}
