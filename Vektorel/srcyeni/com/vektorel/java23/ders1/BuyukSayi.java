package com.vektorel.java23.ders1;

public class BuyukSayi {

	public static void main(String[] args) {

		// System.out.println(buyukSayi(4, 6));
		System.out.println(buyukSayi1(11,15));

	}

	// static int buyukSayi(int a, int b) {
	// int buyuk;
	// if (a > b) {
	// buyuk = a;
	// } else {
	// buyuk = b;
	// }
	// return buyuk;
	// }

	static int buyukSayi1(int a, int b) {
		if (a > b) {
			return a;
		} else {
			return b;
		}

	}

}
