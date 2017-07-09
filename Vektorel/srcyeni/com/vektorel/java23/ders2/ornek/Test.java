package com.vektorel.java23.ders2.ornek;

public class Test {
	private String isim;
	private String testModul;

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public void setTestModul(String testModul) {
		this.testModul = testModul;
	}

	public String getIsim() {
		return isim;
	}

	public String getTestModul() {
		if (testModul != null) {
			return testModul;
		} else {
			return testModul = "";
		}

	}

}
