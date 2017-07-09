package PersonelTemelSeviye;

public class mdlPersonel {

	public enum Sigorta {
		Sigortali, Sigortasiz, Ogrenci
	}

	public mdlPersonel(String Ad, String Soyad, int Yas) {
		this.adi = Ad;
		this.soyadi = Soyad;
		this.yas = Yas;
	}

	private double maas;
	private boolean sigorta;
	private int yas;
	private String adi;
	private String soyadi;

	public void SigortaAyarlama(Sigorta SigortaDurumu) {
		if (SigortaDurumu == Sigorta.Ogrenci) {
			sigorta = false;
		} else if (SigortaDurumu == Sigorta.Sigortali) {
			sigorta = true;
		} else if (SigortaDurumu == Sigorta.Sigortasiz) {
			sigorta = false;
		}
	}

	public void MaasAyarlama(double Maas) {
		if (sigorta) {
			this.maas = (Maas * 1.30);
		} else {
			this.maas = Maas;
		}
	}

	public String PersonelDokumu() {
		return String.format(
				"P.Adi\t:%s\nP.Soy.\t:%s\nYaþ\t:%s\nMaaþ\t:%s\n", 
				this.adi, this.soyadi, this.yas,this.maas);
	}
}
