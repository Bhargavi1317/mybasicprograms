package JavaPrograms;

public class Count_of_SpecialCharacter_String 

{
	static int count_of_space;
	static int count_of_Specialcharacter;

	public static void main(String[] args) {

		String s1=" $&^&^&$  ";
		char c1[]=s1.toCharArray();
		
		for(int i=0;i<s1.length();i++)
		{
			boolean b2=Character.isSpaceChar(c1[i]);
			if (b2==true)
			{
				count_of_space++;
			}
			
			else
			{
				count_of_Specialcharacter++;
			}
		
	}

	}
}
