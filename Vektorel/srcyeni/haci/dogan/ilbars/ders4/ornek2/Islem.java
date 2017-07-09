package haci.dogan.ilbars.ders4.ornek2;

public class Islem {

	public static void main(String[] args) {
     Insan hasan=new Insan();
     hasan.setAdi("Hasan");
     
     Lokanta lokanta=new Lokanta();
     lokanta.setAd("Mahmutoðllarý");
     lokanta.setTelefonNumarasi("12312312355");
     
     hasan.lokantayiAra(lokanta);

	}

}
