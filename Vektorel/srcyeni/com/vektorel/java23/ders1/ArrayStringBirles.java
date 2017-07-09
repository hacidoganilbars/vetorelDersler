package com.vektorel.java23.ders1;

public class ArrayStringBirles {

	public static void main(String[] args) {
		String[] str = { "Merhaba", "Dünya" };
		System.out.println(stringBirlestir(str));
	
	}

	static String stringBirlestir(String[] strings) {
		String s="";
		for (int i = 0; i < strings.length; i++) {

			s=s+strings[i]+" " ;
			

		}return s;
		

	}

}
