package Emlakci;


public class Islem {

	public static void main(String[] args) {
		Ev HacininEvi = new Ev(3, 5, "Çinçin", 100000, 1500, 300);
		Ev IlkcaninEvi = new Ev(5, 2, "Çankaya", 200000, 2000, 500);
		/*
		 * HacininEvi.depozito = 1500; HacininEvi.fiyat = 100000;
		 * HacininEvi.katNumarasi = 5; HacininEvi.odaSayisi = 3; HacininEvi.semt
		 * = "Çinçin"; HacininEvi.metreKare = 300; IlkcaninEvi.depozito = 2000;
		 * IlkcaninEvi.fiyat = 200000; IlkcaninEvi.katNumarasi = 2;
		 * IlkcaninEvi.odaSayisi = 5; IlkcaninEvi.semt = "Çankaya";
		 * IlkcaninEvi.metreKare = 500;
		 */
		
		HacininEvi.depozito = 1250;

		System.out.println(HacininEvi.EvBilgileri());
		System.out.println();
		System.out.println(IlkcaninEvi.EvBilgileri(15));

	}
}
