package OOP;

public class mdlEv extends mdlBase {
	public double metrekare;

	public String EvBilgileri() {
		// DDegeri ? D�n�� De�eri
		String DDegeri = String.format("%sMetre Kare\t:%s\n", super.EvBilgileri(), metrekare);
		return DDegeri;
	}
}
