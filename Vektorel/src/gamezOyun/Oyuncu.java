package gamezOyun;

public class Oyuncu {
	String oyuncuAdi;
	public String getOyuncuAdi() {
		return oyuncuAdi;
	}

	public void setOyuncuAdi(String oyuncuAdi) {
		this.oyuncuAdi = oyuncuAdi;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getToplamPuan() {
		return toplamPuan;
	}

	public void setToplamPuan(int toplamPuan) {
		this.toplamPuan = toplamPuan;
	}

	int x;
	int y;
	int toplamPuan;
	
	Oyuncu(String oyuncuAdi,int x,int y){
		this.oyuncuAdi=oyuncuAdi;
		this.x=x;
		this.y=y;
	}
	public void puanEkle(int puan){
		
	}
	public void hareketEt(char yon,int a,int b){
		
	}

}
