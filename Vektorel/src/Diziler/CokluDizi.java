package Diziler;

public class CokluDizi {

	public static void main(String[] args) {
		String Ogrenciler[][] = new String[3][2];
		Ogrenciler[0][0] = "Metin Oktay";
		Ogrenciler[0][1] = "POLAT";
		Ogrenciler[1][0] = "Hac� Do�an";
		Ogrenciler[1][1] = "�LBARS";
		Ogrenciler[2][0] = "�lkcan";
		Ogrenciler[2][1] = "�KS�Z";
		for (int i = 0; i < Ogrenciler.length; i++) {
			for (int j = 0; j < Ogrenciler[i].length; j++) {
				System.out.println(Ogrenciler[i][j]);
			}
		}
	}
}
