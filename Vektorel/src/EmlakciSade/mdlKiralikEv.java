package EmlakciSade;

public class mdlKiralikEv {

	public int OdaSayisi;
	public String Semt;
	public double KiraBedeli;
	public double Depozito;

	public void EvBilgileriniAl(int OdaSa, String Semt) {
		this.OdaSayisi = OdaSa;
		this.Semt = Semt;
	}

	public String EvBilgileri() {
		String DonusDegeri = String.format("O.Say : %s\tSemt : %s", this.OdaSayisi, this.Semt);
		return DonusDegeri;
	}
}
