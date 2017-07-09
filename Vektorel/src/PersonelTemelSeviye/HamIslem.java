package PersonelTemelSeviye;

import java.util.Date;

import PersonelTemelSeviye.mdlPersonel.Sigorta;

public class HamIslem {

	public enum Sigorta {
		Sigortali, Sigortasiz, Ogrenci
	}

	public static void main(String[] args) {
		double maas = 0.0;
		boolean sigorta = false;
		Date dogumTarihi = new Date();
		int yas = 38;
		String adi = "Hacý";
		String soyadi = "Doðan";
		Sigorta SigortaDurumu = Sigorta.Ogrenci;

		if (SigortaDurumu == Sigorta.Sigortali) {
			sigorta = true;
		} else {
			sigorta = false;
		}
		if (sigorta) {
			maas = (2500 * 1.30);
		} else {
			maas = 2500;
		}

		System.out.println(String.format("P.Adi\t:%s\nP.Soy.\t:%s\nYaþ\t:%s\nMaaþ\t:%s\n", adi, soyadi, yas, maas));
	}

}
