package Diziler;

public class CokluDizi {

	public static void main(String[] args) {
		String Ogrenciler[][] = new String[3][2];
		Ogrenciler[0][0] = "Metin Oktay";
		Ogrenciler[0][1] = "POLAT";
		Ogrenciler[1][0] = "Hacý Doðan";
		Ogrenciler[1][1] = "ÝLBARS";
		Ogrenciler[2][0] = "Ýlkcan";
		Ogrenciler[2][1] = "ÖKSÜZ";
		for (int i = 0; i < Ogrenciler.length; i++) {
			for (int j = 0; j < Ogrenciler[i].length; j++) {
				System.out.println(Ogrenciler[i][j]);
			}
		}
	}
}
