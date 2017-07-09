package Personel;

public class Islem {

	public static void main(String[] args) {

		PersonelContext ctx = new PersonelContext();
		ctx.PersonelOlustur();
		ctx.PersonelBilgileri();
		while (true) {
			System.out.println("1. Ekle\t2. Sil\t 3.Düzenle");
		}

	}
}
