package Constructor_Yapicilar;

import Constructor_Yapicilar.mdlInsan.Cins;

public class Islem {

	public static void main(String[] args) {
		mdlEv evim = new mdlEv();
		// Class Nesne = Yeni Constructor
		mdlInsan insan = new mdlInsan();
		mdlDosyaOku okuyucu = new mdlDosyaOku("C:\\Armut.txt");
		okuyucu.SatirOku(15);

		System.out.println(String.format("%s", Cins.Erkek));
		System.out.printf("%s", 2);
	}
}
