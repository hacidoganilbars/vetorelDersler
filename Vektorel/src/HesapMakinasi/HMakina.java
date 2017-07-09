package HesapMakinasi;

public class HMakina {

	public enum Tip {
		Toplama, Cikarma, Bolme, Carpma, ModAlma
	}

	private int Sayi1;
	private int Sayi2;

	public HMakina(int s1, int s2) {
		this.Sayi1 = s1;
		this.Sayi2 = s2;
	}

	public int Toplama() {
		return this.Sayi1 + this.Sayi2;
	}

	public int Cikarma() {
		return this.Sayi1 - this.Sayi2;
	}

	public int Bolme() {
		return this.Sayi1 / this.Sayi2;
	}

	public int Carpma() {
		return this.Sayi1 * this.Sayi2;
	}

	public int ModAlma() {
		return this.Sayi1 % this.Sayi2;
	}
}
