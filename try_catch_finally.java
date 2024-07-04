package JavaPrograms;

import java.util.InputMismatchException;
import java.util.Scanner;

public class try_catch_finally {

	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		try
		{
			
			System.out.println(" Enter valid age ");
			int age = s1.nextInt();
			
		}
		catch(InputMismatchException a1)
		{
			System.out.println(" please fill the form again ");
			Scanner s2 = new Scanner(System.in);
			System.out.println(" Enter valid age ");
			int age1 = s2.nextInt();
		}
		finally
		{
			System.out.println(" no matter if try will execute or catch block will execute, finally will always execcute ");

		}
	}

}
