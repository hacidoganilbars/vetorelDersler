package com.vektorel.ders4.ornek1;

public class BenimDizim {

	public static void main(String[] args) {

		int[] array = { 11, 12, 15, 16, 22 };
		int[] yeniArray = new int[array.length];
		// System.out.println(arrayKareAktar(array, yeniArray));
		arrayKareAktar(array, yeniArray);

		// for (int i = 0; i < array.length; i++) {
		// yeniArray[i]=array[i]*array[i];
		//
		//
		//
		// }
		// for (int i = 0; i < yeniArray.length; i++) {
		// int j = yeniArray[i];
		// System.out.println(j);
		//
		// }

	}

	public static void arrayKareAktar(int array[], int yeniArray[]) {
		for (int i = 0; i < array.length; i++) {
			yeniArray[i] = array[i] * array[i];
		}

		for (int i = 0; i < yeniArray.length; i++) {
			// int j = yeniArray[i];
			System.out.println(yeniArray[i]);

		}

	}

}
