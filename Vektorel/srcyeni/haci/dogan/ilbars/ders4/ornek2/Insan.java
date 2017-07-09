package haci.dogan.ilbars.ders4.ornek2;

public class Insan {
	String adi;
	String TC;
	Lokanta lokanta;
	public String getAdi() {
		return adi;
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}

	public String getTC() {
		return TC;
	}

	public void setTC(String tC) {
		TC = tC;
	}


	
	public void lokantayiAra(Lokanta lokanta){
		System.out.println(this.getAdi()+" "+lokanta.getAd()+" lokantasýný aradý. "+"Numara: "+lokanta.getTelefonNumarasi());
	}

}
