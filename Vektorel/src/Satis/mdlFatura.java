package Satis;

public class mdlFatura {

	public int UrunKod;
	public String UrunIsim;
	public double Fiyat;
	public double Miktar;

	public double Tutar() {
		return Fiyat * Miktar;
	}

}
