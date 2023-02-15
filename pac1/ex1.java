package calculator.pac1;
import java.util.Scanner;
public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		/*System.out.print("Enter Max Number: ");
		int max=scan.nextInt();
		System.out.print("Enter Min Number: ");
		int min=scan.nextInt();
		int result = (max+min)/2;
		System.out.println("The result is: "+result+".");
		
		
		System.out.println("ex4=======================================");
		
		
		System.out.print("Enter temperature Fahrenheit Degree: ");
		double f=scan.nextDouble();
		
		double c=(f-32)*5/9;
		
		System.out.println("Temperature in Celcius: "+c+".");*/
		
		
/*		System.out.println("Ex5==========================================");
		System.out.print("Enter Circle radius: ");
		double r=scan.nextDouble();
		double area=3.14*(r*r);
		System.out.println("The area of circle is: "+area+".");
		
		
		System.out.println("Ex7============================================");
		int amount=5000;
		System.out.println("Your money amount in bank: "+amount+".");
		System.out.print("Enter Withdraw amount: ");
		int withdraw=scan.nextInt();
		int famount=amount-withdraw;
		System.out.println("The final amount: "+famount+".");*/
		
		
		System.out.println("Ex6=============================================");
		
		System.out.print("Enter time in hour: ");
		int ghour=scan.nextInt();
		System.out.print("Enter time in minutes: ");
		int gminu=scan.nextInt();
		int gtime=ghour+gminu;
		
		int finaltime=gtime*3600;
		System.out.println("Userr given times: "+ghour+":"+gminu+".");
		System.out.println("Your given times is seconds: "+finaltime+".");
		
		
		
	}

}
