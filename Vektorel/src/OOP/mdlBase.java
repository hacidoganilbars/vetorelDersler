package OOP;

public class mdlBase {
	// Fields ( Deðiþkenler )
	public int odaSayisi;
	public int katNo;
	public String semt;

	public String EvBilgileri() {
		// DDegeri ? Dönüþ Deðeri
		String DDegeri = String.format("Oda Sayisi\t:%s\nKat No\t\t:%s\nSemt\t\t:%s\n", odaSayisi, katNo, semt);
		return DDegeri;
	}
}
