package JavaPrograms;

import javapackage.firstprogram;

public class MainmethodOverloading_Nonstatic
{
	
	public  void main(int a)       //non-static method
	{
		
	}

	public static void main(String[] args)
	{

		System.out.println(" static and non-static main method overloading");
		firstprogram f1 = new firstprogram();
		f1.main(10);
		

		
	}

}
