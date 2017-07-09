package Hafta5;

public class ConBreOrnek {

	public static void main(String[] args) {

		int tekSayilarToplami = 0;
		for (int i = 0; i < 5; i++) {
			if (i % 2 == 0)
				break;
			else
				tekSayilarToplami += i;
		}
		System.out.println(tekSayilarToplami);

	}

}
