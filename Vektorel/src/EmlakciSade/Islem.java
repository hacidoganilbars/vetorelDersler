package EmlakciSade;

import java.util.ArrayList;
import java.util.List;

public class Islem {

	public static void main(String[] args) {
		/*
		 * mdlEv Evim = new mdlEv(5, "Aktaþ"); mdlKiralikEv KEvim = new
		 * mdlKiralikEv(); System.out.println(Evim.EvBilgileri());
		 * System.out.println(KEvim.EvBilgileri());
		 */
		/*
		 * mdlKiralikEv KEvim = new mdlKiralikEv(); KEvim.EvBilgileriniAl(5,
		 * "Çankaya"); System.out.println(KEvim.EvBilgileri());
		 */
		List<mdlEv> Evler = new ArrayList();
		Evler.add(new mdlEv(3, "Çinçin"));
		Evler.add(new mdlEv(3, "Aktaþ"));

		mdlEv[] EvlerDizisi = new mdlEv[10];
	
	}
}
