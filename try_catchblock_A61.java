package JavaPrograms;

public class try_catchblock_A61 {

	public static void main(String[] args) {

		try
		{
			int a = 1/0; 
		System.out.println(a);
		}
		catch(ArithmeticException a1)
		
		{
			System.out.println("handled the exception");

		}
		
	}

}
