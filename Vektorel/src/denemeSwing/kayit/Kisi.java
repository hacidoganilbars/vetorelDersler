package denemeSwing.kayit;

public class Kisi {
	
	String ad;
	String soyad;
	String telefon;
	String ders;
	
	public void kaydetKisi(Kisi kisi){
		OgrenciListe.ogrListe.add(kisi);
		
		
	}
	
	public int kayitSayisi(){
		return OgrenciListe.ogrListe.size();
	}

}
