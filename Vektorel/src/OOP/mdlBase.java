package OOP;

public class mdlBase {
	// Fields ( De�i�kenler )
	public int odaSayisi;
	public int katNo;
	public String semt;

	public String EvBilgileri() {
		// DDegeri ? D�n�� De�eri
		String DDegeri = String.format("Oda Sayisi\t:%s\nKat No\t\t:%s\nSemt\t\t:%s\n", odaSayisi, katNo, semt);
		return DDegeri;
	}
}
