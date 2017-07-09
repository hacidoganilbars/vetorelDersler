package PersonelTemelSeviye;

import PersonelTemelSeviye.mdlPersonel.Sigorta;

public class Islem {

	public static void main(String[] args) {

		mdlPersonel Personel = new mdlPersonel("Hacý", "Doðan", 38);
		Personel.SigortaAyarlama(Sigorta.Sigortasiz);
		Personel.MaasAyarlama(2500);
		
		System.out.println(Personel.PersonelDokumu());
		
		mdlPersonel Personel2 = new mdlPersonel("Hacý", "Doðan", 38);
		Personel.SigortaAyarlama(Sigorta.Sigortasiz);
		Personel.MaasAyarlama(2500);
		
		mdlPersonel Personeller[] = new mdlPersonel[20];
		
	}
}
