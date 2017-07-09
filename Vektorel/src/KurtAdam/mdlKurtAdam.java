package KurtAdam;

public class mdlKurtAdam extends KurtAdam {

	public enum Mode {
		Insan, KurtAdam
	}

	public Mode durum;
	private int sSeviye;
	private int yas;

	public void setSaglikSeviye(int sSeviye) {
		if (sSeviye > 0 && sSeviye <= 100)
			this.sSeviye = sSeviye;
	}

	public void setYas(int yas) {
		this.yas = yas;
	}

	@Override
	public boolean Konusma() {
		if (durum == Mode.Insan) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean Evcil() {
		return false;
	}

	@Override
	public String Ses() {
		if (durum == Mode.Insan) {
			return "Ben bir insanım!";
		} else {
			return "Auuuuuuuuuuuuuuuuuu";
		}
	}

	@Override
	public boolean Saldirganlik() {
		if (durum == Mode.Insan) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public boolean Saglik() {
		if (this.sSeviye > 40) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public int SaglikSeviye() {
		return this.sSeviye;
	}

	@Override
	public int Yas() {
		return this.yas;
	}

	@Override
	public boolean Pence() {
		if (this.durum == Mode.Insan) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public boolean Isirma() {
		if (this.durum == Mode.Insan) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public boolean Koklama() {
		if (this.sSeviye > 20)
			return true;
		else
			return false;
	}

	@Override
	public boolean YumrukAtma() {
		if (this.durum == Mode.Insan) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean Kacma() {
		if (this.durum == Mode.Insan) {
			return true;
		} else {
			return false;
		}
	}

}
