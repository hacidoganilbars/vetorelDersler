package com.vektorel.java23.ders2.ornek;

public class Islem {

	public static void main(String[] args) {
		Yazilimci yazilimci = new Yazilimci();
		yazilimci.setIsim("Ahmet");
		yazilimci.setDil("Java developer");

		Test testci = new Test();
		testci.setIsim("Mehmet");
		testci.setTestModul("Otomatik");

		Yonetici yonetici = new Yonetici();
		yonetici.setIsim("Mahmut");
		yonetici.testciyeIsVer(testci);
		yonetici.yazilimciyaIsVer(yazilimci);
	}

}
