package JavaPrograms;

public class Count_of_Space_inString 

{
	static int count_of_SpecialCharacter;
	
	public static void main(String[] args)
	
	{
		
		String s1="Bhargavi @^&*$%#!) ^&%%$#^ $$%$%^$*";
		char c1[]=s1.toCharArray();
		
		for(int i=0;i<s1.length();i++)
		{
			boolean b2=Character.is(c1[i]);
			if (b2==true)
			{
				count_of_SpecialCharacter++;
			}
			
		}
		
		System.out.println("The Number of spaces in given String are :   " +count_of_SpecialCharacter);
		
		
		
		
		

	}

}
