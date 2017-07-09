package com.vektorel.java23.ders2.ornek;

public class Yazilimci {
	private String isim;
	private String dil;

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public void setDil(String dil) {
		this.dil = dil;
	}

	public String getIsim() {
		return isim;
	}

	public String getDil() {

		if (dil != null) {
			return dil;
		} else {
			dil = "";
			return dil;
		}

	}

}
