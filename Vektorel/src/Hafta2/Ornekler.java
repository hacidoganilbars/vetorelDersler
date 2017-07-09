package Hafta2;

public class Ornekler {
	public static void main(String[] args) {

		Byte ornekbyte = 1;
		byte deneme = 2;
		Short ornekshort = 600;
		Integer ornekint = 15000;
		Long orneklong = 9223377l;
		Float ornekfloat = 123.5F;
		Double ornekdouble = 12.5;
		Boolean ornekbool = false;
		String str = "15";
		Character cc = 'A';
		byte yenideger = ornekbyte.valueOf(str);
		byte sondeger = Byte.valueOf(str);
		

		System.out.println(yenideger);
		
	}
}
