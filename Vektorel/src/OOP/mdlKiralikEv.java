package OOP;

public class mdlKiralikEv extends mdlEv {
	public double kiraBedeli;
	public double depozito;
	
	public String EvBilgileri() {
		// DDegeri ? D�n�� De�eri
		String DDegeri = String.format("%sKira Bedeli\t:%s\nDepozito\t:%s\n", 
				super.EvBilgileri(), kiraBedeli, depozito);
		return DDegeri;
	}
}
