package calculator.pac1;

public class Student {
	String name;
	public static void main(String[] args) {
		Student student = new Student();
		student.name="Juu lone";
		System.out.println("first name:"+student.name);
		Student student1 = new Student();
		student1.name="Htet Aung";
		System.out.println("Second name: "+student1.name);
		
		int a=3;
		if(a==3)
		{
			int localvar=4;
			System.out.println("local varible"+localvar);
			System.out.println("a="+a);
		}

	}

}
