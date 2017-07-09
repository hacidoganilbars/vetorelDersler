package HayvanlarAlemi;

public class Islem {

	public static void main(String[] args) {
		// IKedigiller Kediler = new IKedigiller();

		mdlAslan Aslan = new mdlAslan();
		System.out.println(Aslan.SesVer());
		mdlKedi Kedi = new mdlKedi();
		System.out.println(Kedi.SesVer());

		IKedigiller Kedicik = Kedi;
		IKedigiller Kopekcik = Aslan;

		System.out.println(Kopekcik.SesVer());
	}
}
