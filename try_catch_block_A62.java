package JavaPrograms;
import java.util.InputMismatchException;
import java.util.Scanner;
public class try_catch_block_A62 {

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
			System.out.println(" age must be valid, please enter again ");
			Scanner s2 = new Scanner(System.in);
			System.out.println(" Enter valid age ");
			int age1 = s2.nextInt();
			

		}
		Scanner s3 = new Scanner(System.in);
		System.out.println(" Enter Name");
		String name=s3.next();
		Scanner s4 = new Scanner(System.in);
		System.out.println(" Enter salary");
		double salary=s4.nextDouble();
		Scanner s5 = new Scanner(System.in);
		System.out.println(" Enter weight");
		float weight=s5.nextFloat();
		Scanner s6 = new Scanner(System.in);
		System.out.println(" Are you a Student");
		boolean value =s6.nextBoolean();
		
	}

}
