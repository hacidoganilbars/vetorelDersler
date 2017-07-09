package KurtAdam;

public class mdlInsan implements IInsan {

	private int saglikSeviye;
	private int yas;
	private String mod;
	
//	mdlInsan(){
//	this.MOD_INSAN=mod;
//	}
//	



	public void setYas(int yas) {
		this.yas = yas;
	}

	public void setSaglikSeviye(int Seviye) {
		if (Seviye > 0 && Seviye <= 100)
			this.saglikSeviye = Seviye;
	}

	@Override
	public boolean Saglik() {
		if (this.saglikSeviye > 30) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public int SaglikSeviye() {
		return this.saglikSeviye;
	}

	@Override
	public int Yas() {
		return this.yas;
	}

	@Override
	public boolean Konusma() {
		if (this.yas > 5) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean YumrukAtma() {
		if (saglikSeviye > 20) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean Kacma() {
		if (this.saglikSeviye < 30) {
			return true;
		} else {
			return false;
		}
	}

}
