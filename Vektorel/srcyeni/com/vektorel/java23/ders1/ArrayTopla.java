package com.vektorel.java23.ders1;

public class ArrayTopla {

	public static void main(String[] args) {

		int array[] = new int[4];
		array[0] = 10;
		array[1] = 20;
		array[2] = 30;
		array[3] = 40;

		arrayVeriTopla(array);

	}

	static void arrayVeriTopla(int array[]) {
		int toplam = 0;

		for (int i = 0; i < array.length; i++) {

			toplam += array[i];

		}
		System.out.println(toplam);

	}

}
