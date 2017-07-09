package com.vektorel.ders4.ornek1;

public class MySwitch {
	public static void main(String[] args) {

		System.out.println("Ýþlem sonuc= " + islem(3, 4, '+'));

	}

	public static int islem(int a, int b, char key) {
		int sonuc = 0;
		switch (key) {
		case '+':
			sonuc = a + b;
			break;
		case '-':
			sonuc = a - b;
			break;
		case '*':
			sonuc = a * b;
			break;
		case '/':
			sonuc = a / b;
			break;
		default:
			sonuc = 0;
			System.out.println("Yanlýþ seçim");
			break;
		}

		return sonuc;
	}

}
