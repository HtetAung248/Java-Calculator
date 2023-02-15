package calculator.pac1;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		//datatype varible-name
		/*int number1=20;
		int number2=30;
		int number3=40;
		int sum=number1+number2+number3;
		System.out.println("number 1 is "+number1+".");
		System.out.println("number 2 is "+number2+".");
		System.out.println("number 3 is "+number3+".");
		System.out.println("Sum is "+sum+".");*/
		
		Scanner scannerobj = new Scanner(System.in);
		/*System.out.print("Enter first number: ");
		int num1=scannerobj.nextInt();
		System.out.println("number 1 is "+num1+".");
		System.out.print("Enter second number: ");
		int num2=scannerobj.nextInt();
		System.out.println("number 2 is "+num2+".");
		int sum= num1+num2;
		System.out.println("Sum is "+sum+".");*/
		
		/*System.out.print("Enter first number: ");
		int num1=scannerobj.nextInt();
		System.out.println("The first number is "+num1);
		System.out.print("Enter second number: ");
		int num2=scannerobj.nextInt();
		System.out.println("The second number is "+num2);
		int sub=num1-num2;
		System.out.println("Substraction is "+sub);*/
		
		System.out.print("Enter first number: ");
		int num1=scannerobj.nextInt();
		System.out.println("The first number is "+num1);
		System.out.print("Enter second number: ");
		int num2=scannerobj.nextInt();
		System.out.println("The second number is "+num2);
		int multi=num1*num2;
		System.out.println("Multiplication is "+multi);
		
	}

}
