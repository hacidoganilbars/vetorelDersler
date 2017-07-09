package com.vektorel.java23.ders1;

public class Faktoriyel {

	public static void main(String[] args) {

		System.out.println(fakt(10));

	}

	private static int fakt(int a) {
		int faktor = 1;
		for (int i = 1; i <= a; i++) {

			faktor = faktor * i;

		}
		return faktor;

	}

}
