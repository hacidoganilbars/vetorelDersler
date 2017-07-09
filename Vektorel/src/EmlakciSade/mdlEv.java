package EmlakciSade;

public class mdlEv {
	public int OdaSayisi;
	public String Semt;
	public int KatNo;

	public mdlEv(int OdaSay, String Semt) {
		this.OdaSayisi = OdaSay;
		this.Semt = Semt;
	}

	public String EvBilgileri() {
		String DonusDegeri = String.format("O.Say : %s\tSemt : %s", this.OdaSayisi, this.Semt);
		return DonusDegeri;
	}
}
