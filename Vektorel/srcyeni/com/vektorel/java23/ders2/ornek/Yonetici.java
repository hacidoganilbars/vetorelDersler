package com.vektorel.java23.ders2.ornek;

public class Yonetici {
	private String isim;

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public String getIsim() {
		return isim;
	}

	public void yazilimciyaIsVer(Yazilimci yazilimci) {

		System.out.println("�smim " + yazilimci.getIsim() + " i� olarak " + yazilimci.getDil()
				+ " olarak �al��maya ba�lad�m say�n y�neticim");
	}

	public void testciyeIsVer(Test testci) {

		System.out.println("�smim " + testci.getIsim() + " i� olarak programlamalarda " + testci.getTestModul()
				+ " denetleyici olarak i�e ba�lad�m " + this.getIsim() + " Bey");
	}

}
