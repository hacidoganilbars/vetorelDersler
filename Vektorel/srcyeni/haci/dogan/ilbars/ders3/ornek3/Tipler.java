package haci.dogan.ilbars.ders3.ornek3;

public class Tipler {
static double delta=0.0d;
	public static void main(String[] args) {

		byte bb = 3;
		byte cc = 4;
		byte gg = (byte) (bb + cc);
		System.out.println(gg);

		System.out.println(bb);
		short ss = 34;
		short ss1 = 35;

		int ii;
		long ll;

		float ff;
		double dd;

		char ch;

		String str = "Hacý Doðan Ýlbars";
		System.out.println(str);

		topla(5, 6);
		carp(5, 5);
		System.out.println(str);
		delta(4,11,3);
	

	}

	static void topla(int a, int b) {
		System.out.println(a + b);
	}

	static void carp(int a, int b) {
		System.out.println(a * b);
	}

	static void bolme(int a, int b) {
		System.out.println(a / b);
	}

	static void cikarma(int a, int b) {
		System.out.println(a - b);
	}

	static void ustAl(int a, int b) {
		System.out.println(Math.pow(a, b));
	}

	static void kokAl(int a, int b) {
		System.out.println(Math.sqrt(a * b));
	}

	static void delta(int a, int b, int c) {
		int sonuc=b * b - (4 * a * c);
		System.out.println(sonuc);
		 System.out.println(Math.sqrt(sonuc));
	
	}
	
	static void koklerBul(int a, int b) {
		System.out.println("Artý Kök= "+(-b+delta)/2*a);
	}

}
