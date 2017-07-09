package Satis;

import java.util.List;

public class mdlRapor implements IPdfRapor, IXmlRapor {

	@Override
	public void Rapor(List<mdlFatura> Faturalar) {
		for (mdlFatura item : Faturalar) {
			System.out.println("***************************************");
			System.out.println("Urun Kod \t:" + item.UrunKod);
			System.out.println("Urun Ýsim \t:" + item.UrunIsim);
			System.out.println("Fiyat \t\t:" + item.Fiyat);
			System.out.println("Miktar \t\t:" + item.Miktar);
			System.out.println("Toplam Tutar \t:" + item.Tutar());
		}
	}

	@Override
	public void XmlFormat(List<mdlFatura> Faturalar) {
		// TODO Auto-generated method stub

	}

	@Override
	public void PdfFormat(List<mdlFatura> Faturalar) {
		// TODO Auto-generated method stub

	}

}
