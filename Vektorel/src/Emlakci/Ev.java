package Emlakci;

public class Ev {

	public Ev() {

	}

	public Ev(int OdaSayisi, int KatNumarasi, String Semt, double Fiyat, double Depozito, int MetreKare) {

		this.depozito = Depozito;
		this.fiyat = Fiyat;
		this.katNumarasi = KatNumarasi;
		this.metreKare = MetreKare;
		this.semt = Semt;
		this.odaSayisi = OdaSayisi;
	}

	public int odaSayisi;
	public int katNumarasi;
	public String semt;
	public double fiyat;
	public double depozito;
	public int metreKare;

	private int okunmaSayisi;

	public int ToplamOkuma() {
		return okunmaSayisi;
	}

	public String EvBilgileri() {
		okunmaSayisi++;
		return String.format("Oda S.\t:%s\nFiyatý\t:%s\nKat no\t:%s\nSemt\t:%s\nDep.\t:%s\nM.Kare\t:%s", odaSayisi,
				fiyat, katNumarasi, semt, depozito, metreKare);
	}

	public String EvBilgileri(int OdaSayisi) {
		okunmaSayisi++;
		return String.format("Oda S.\t:%s\nFiyatý\t:%s\nKat no\t:%s\nSemt\t:%s\nDep.\t:%s\nM.Kare\t:%s", OdaSayisi,
				fiyat, katNumarasi, semt, depozito, metreKare);
	}

	public String EvBilgileri(String Semt) {
		okunmaSayisi++;
		return String.format("Oda S.\t:%s\nFiyatý\t:%s\nKat no\t:%s\nSemt\t:%s\nDep.\t:%s\nM.Kare\t:%s", odaSayisi,
				fiyat, katNumarasi, Semt, depozito, metreKare);
	}
}
