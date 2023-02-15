package calculator.pac1;

public class Conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Implicit Conversion
		int i=100;
		long l=i;
		float f=l;
		double d=f;
		
		System.out.println("int i: "+i);
		System.out.println("long l: "+l);
		System.out.println("float f: "+f);
		System.out.println("double d: "+d);
		
		System.out.println("********************************************");
		//Explicit Conversion
		double d1=25.0;
		float f1=(float)d1;
		long l1=(long)f1;
		int i1=(int)l1;
		System.out.println("int i: "+i1);
		System.out.println("long l: "+l1);
		System.out.println("float f: "+f1);
		System.out.println("double d: "+d1);
		
		
		

	}

}
