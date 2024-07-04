package JavaPrograms;

import java.util.Arrays;

public class Anagram_TwoStrings 

{

	static String s1 = "heart";
	static String s2 = "earth";

	public static void main(String[] args) 
	
	{
		
		if(s1.length()!=s2.length())
		{
			System.out.println("It is not a Anagram");

		}
		else
		{
			System.out.println("It is a Anagram");
			
			char c1[]= s1.toCharArray();
			char c2[] = s2.toCharArray();
			
			System.out.println(Arrays.toString(c1));
			System.out.println(Arrays.toString(c2));
			
		}
		

	}

}
