package haci.dogan.ilbars.ders4.ornek4;

class Elbise extends Kumas {
	private String model;
	private String tur;

	@Override
	protected String getTur() {
		return tur;
	}

	@Override
	protected void setTur(String tur) {
		this.tur = tur;
	}

	protected String getModel() {
		return model;
	}

	protected void setModel(String model) {
		this.model = model;
	}

	@Override
	protected void kumasKes() {
		System.out.println("Makina ile Kes " + this.getModel() + " " + this.getTur());
	}

}
