package com.vektorel.java23.ders2;

public class ArrayCarp {

	public int arrayCarp(int[] arrays) {

		int sonuc = 1;
		for (int i = 0; i < arrays.length; i++) {
			sonuc *= arrays[i];
		}
		return sonuc;
	}

}
