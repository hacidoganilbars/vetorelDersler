package Hafta5;

public class OdevOrnegi {

	public static void main(String[] args) {

		String Cumle = "Mahmut TUNCER";
		for (int i = 0; i <= Cumle.length() - 1; i++) {
			if (Cumle.charAt(i) != ' ')
				System.out.println(Cumle.substring(0, i + 1));
		}
	}
}
