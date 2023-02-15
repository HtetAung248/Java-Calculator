package calculator.pac1;

public class GlobalVariable {
	static String name;
	public static void main(String[] args) {
		GlobalVariable.name="Juu Lone";
		System.out.println("Name: "+GlobalVariable.name);
		name();

	}
	
	public static void name()
	{
		GlobalVariable.name="Su Su";
		System.out.println("Name: "+GlobalVariable.name);
	}

}
