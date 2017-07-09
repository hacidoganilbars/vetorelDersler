package com.vektorel.ders3;

public class Sekil {

	int array[];

	Sekil(int array[]) {
		this.array = array;
	}

	public int sekilCevre() {
		int toplam = 0;
		for (int i = 0; i < array.length; i++) {
			toplam += array[i];
		}
		return toplam;

	}

}
