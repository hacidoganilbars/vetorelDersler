package com.vektorel.ders4.ornek1;

public class CarpmaMatrisi {

	public static void main(String[] args) {

		int array[][] = new int[3][3];

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {

				array[i][j] = i * j;
				System.out.println(array[i][j]);

			}

		}

	}

}
