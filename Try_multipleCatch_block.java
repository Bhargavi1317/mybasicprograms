package JavaPrograms;

import java.util.IllegalFormatException;
import java.util.InputMismatchException;

public class Try_multipleCatch_block {

	public static void main(String[] args)
	{
		
		int rollno[] = new int[3];
		rollno[0]=15;
		rollno[1]=20;
		rollno[2]=35;
		
		
		try
		{
			rollno[3]=40;
		}
		
		catch(ArrayIndexOutOfBoundsException a1)
		{
			System.out.println(" exceeds size ");
		}
		catch(NullPointerException a2)
		{
			System.out.println(" npe ");
		}
		catch(InputMismatchException a3)
		{
			System.out.println(" input ");
		}
		
		catch(IllegalFormatException a4)
		{
			System.out.println(" input ");
		}
		finally
		{
			System.out.println(" no matter if try will execute or catch block will execute, finally will always execcute");
		}

	}

}