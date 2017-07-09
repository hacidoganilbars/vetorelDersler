package haci.dogan.ilbars.ders4.ornek4;

class Kumas {
	private String tur;

	protected String getTur() {
		return tur;
	}

	protected void setTur(String tur) {
		this.tur = tur;
	}

	protected void kumasKes() {
		System.out.println("Makasla Kes " + this.getTur());
	}

}
