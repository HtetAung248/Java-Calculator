package calculator.pac1;
import java.util.Scanner;
public class AssignmentOperator {

	public static void main(String[] args) {
		int ans= 37;
		System.out.println(ans);
		ans +=20;
		System.out.println(ans);
		
		Scanner scan= new Scanner(System.in);
		System.out.print("Enter your age: ");
		int age = scan.nextInt();
		
		if(age<23)
		{
			System.out.println("Accept from School");
		}
		else{
			System.out.println("Go away!");
		}
		
	}

}
