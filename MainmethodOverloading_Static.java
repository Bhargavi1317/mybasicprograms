package JavaPrograms;

public class MainmethodOverloading_Static 
{
	
	
	public static void main(char m)       //static method
	{
		
	}
	public static void main1()            //non-static method
	{
		
	}
	public static void main(String my_name)     //static method
	{
		
	}

	public static void main(double b)
	{
		
	}

	public static void main(String[] args)
	{
		
			System.out.println(" static and non-static main method overloading");
			main('L');
			main(3.7);
			main1();
			main("bhargavi");
		
	}

}
