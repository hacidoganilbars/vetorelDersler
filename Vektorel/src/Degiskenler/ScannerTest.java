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
		//Scanner Sýnýfýnýn kurulumu.
		
		Scanner klavye = new Scanner(System.in);
		//System.out.println("Lütfen bir yazý giriniz:");
		//System.out.println(klavye.nextLine());
		
		//System.out.println("Lütfen bir sayý giriniz:");
		//System.out.println(klavye.nextInt());
		
		//System.out.println("Lütfen bir yazý giriniz:");
		//System.out.println(klavye.next());
		
		System.out.println("Lütfen bir double sayý giriniz:");
		System.out.println(klavye.nextDouble());
		
	}
}
