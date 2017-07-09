package Satis;

import java.util.ArrayList;
import java.util.List;

public class Raporlama {

	public static void main(String[] args) {
		List<mdlFatura> Fatura = new ArrayList<mdlFatura>();
		mdlFatura fat1 = new mdlFatura();
		fat1.UrunKod = 1;
		fat1.UrunIsim = "Parliament Night Blue Kýsa";
		fat1.Miktar = 15;
		fat1.Fiyat = 11.5;

		mdlFatura fat2 = new mdlFatura();
		fat2.UrunKod = 2;
		fat2.UrunIsim = "Pýnar Su 0.5 ML";
		fat2.Miktar = 15000;
		fat2.Fiyat = 0.5;

		Fatura.add(fat1);
		Fatura.add(fat2);

		mdlRapor rapor = new mdlRapor();
		rapor.Rapor(Fatura);

	}

}
