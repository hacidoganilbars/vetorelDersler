package OOP;

public class mdlKiralikEv extends mdlEv {
	public double kiraBedeli;
	public double depozito;
	
	public String EvBilgileri() {
		// DDegeri ? Dönüþ Deðeri
		String DDegeri = String.format("%sKira Bedeli\t:%s\nDepozito\t:%s\n", 
				super.EvBilgileri(), kiraBedeli, depozito);
		return DDegeri;
	}
}
