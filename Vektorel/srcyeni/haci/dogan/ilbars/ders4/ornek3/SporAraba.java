package haci.dogan.ilbars.ders4.ornek3;

public class SporAraba extends Araba {
	private String aksesuar;
	private String nos;

	protected String getAksesuar() {
		return aksesuar;
	}

	protected void setAksesuar(String aksesuar) {
		this.aksesuar = aksesuar;
	}

	protected String getNos() {
		return nos;
	}

	protected void setNos(String nos) {
		this.nos = nos;
	}
    @Override
	protected void arabaGoster() {
		System.out.println(
				this.getMarka() + " " + this.getRenk() + "  motor: " + this.getMotor() + "  nos: " + this.getNos());
	}

}
