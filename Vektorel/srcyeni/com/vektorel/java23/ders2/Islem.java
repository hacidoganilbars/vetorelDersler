package com.vektorel.java23.ders2;

public class Islem {

	public static void main(String[] args) {
		int[] array = new int[5];
		array[0] = 1;
		array[1] = 5;
		array[2] = 8;
		array[3] = 9;
		array[4] = 11;
		
		ArrayCarp arrayCarp = new ArrayCarp();
		int islem = arrayCarp.arrayCarp(array);
		System.out.println(islem);

	}


}
