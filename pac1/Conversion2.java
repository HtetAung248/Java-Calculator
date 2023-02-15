package calculator.pac1;

public class Conversion2 {

	public static void main(String[] args) {
		byte b;
		int i=257;
		double d=325.142;
		
		System.out.println("Convert int to byte");
		b=(byte)i;
		System.out.println(b);
		
		
		System.out.println("Convert double to int");
		i=(int)d;
		System.out.println(i);
		
		System.out.println("Convert double to byte");
		b=(byte)d;
		System.out.println(b);
	}

}
