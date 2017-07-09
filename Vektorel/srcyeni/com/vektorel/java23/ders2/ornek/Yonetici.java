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

		System.out.println("Ýsmim " + yazilimci.getIsim() + " iþ olarak " + yazilimci.getDil()
				+ " olarak çalýþmaya baþladým sayýn yöneticim");
	}

	public void testciyeIsVer(Test testci) {

		System.out.println("Ýsmim " + testci.getIsim() + " iþ olarak programlamalarda " + testci.getTestModul()
				+ " denetleyici olarak iþe baþladým " + this.getIsim() + " Bey");
	}

}
