package OOP;

public class Islem {

	public static void main(String[] args) {

		mdlKiralikEv KEvim = new mdlKiralikEv();
		KEvim.katNo = 5;
		KEvim.metrekare = 350;
		KEvim.odaSayisi = 5;
		KEvim.semt = "Çankaya";
		KEvim.depozito = 1500;
		KEvim.kiraBedeli = 1200;

		mdlEv Evim = KEvim;

		System.out.println(Evim.EvBilgileri());

	}
}
