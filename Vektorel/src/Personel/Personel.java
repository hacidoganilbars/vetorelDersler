package Personel;

import java.util.Date;

public abstract class Personel implements IPersonel {

	public enum SDurum {
		Sigortali, Sigortasiz, Ogrenci, Emekli
	}

	public int personelNo;
	protected String ad;
	protected String soyad;
	protected String telefon;
	protected SDurum sigorta;
	protected Date isBasi;
	protected double maas;

	public abstract String Ad();

	public abstract void Ad(String ad);

	public abstract String Soyad();

	public abstract void Soyad(String soyad);

	public abstract String Telefon();

	public abstract void Telefon(String telefon);

	public abstract SDurum Sigorta();

	public abstract void Sigorta(SDurum sigorta);

	public abstract Date IsBasi();

	public abstract void IsBasi(Date isBasi);

	public abstract double Maas();

	public abstract void Maas(double maas);

	public boolean NumaraDogrula(String TelNo) {
		boolean deger = TelNo.matches("^\\([1-9]+[0-9]{2}\\)\\s[0-9]{3}\\s[0-9]{2}\\s[0-9]{2}$");
		return deger;
	}
}
