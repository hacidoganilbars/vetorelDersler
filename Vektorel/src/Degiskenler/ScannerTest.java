package Degiskenler;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		/*
		System.out.println("Hello World");
		System.out.println(2);
		System.out.println(2.25);
		System.out.println(false);
		*/
		//Scanner S�n�f�n�n kurulumu.
		
		Scanner klavye = new Scanner(System.in);
		//System.out.println("L�tfen bir yaz� giriniz:");
		//System.out.println(klavye.nextLine());
		
		//System.out.println("L�tfen bir say� giriniz:");
		//System.out.println(klavye.nextInt());
		
		//System.out.println("L�tfen bir yaz� giriniz:");
		//System.out.println(klavye.next());
		
		System.out.println("L�tfen bir double say� giriniz:");
		System.out.println(klavye.nextDouble());
		
	}
}
