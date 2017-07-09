
public class Tavsan {

	boolean acTok;
	boolean korku;
	boolean ye;
	
	public Tavsan(boolean acTok,boolean korku){
		this.acTok=acTok;
		this.korku=korku;
		
	}

	public void kos() {

		if (korku == true) {
			System.out.println("korkudan kaç");
		} else {
			System.out.println("korkmuyor:)");
		}

	}

	public void ye() {
		if (acTok == true) {
			System.out.println("Yemek yemeli");
		} else {
			System.out.println("Karný tok");
		}

	}
	public void saklan(){
		if(korku==true){
			System.out.println("Tehlike hisediliyor saklan");
		}else{
			System.out.println("herþey yolunda");
		}
	}
	public static void main(String args[]){
		Tavsan t=new Tavsan(true,false);
		t.ye();
		t.saklan();
	}

}
