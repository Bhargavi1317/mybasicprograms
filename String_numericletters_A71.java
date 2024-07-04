package JavaPrograms;

import java.util.Arrays;

public class String_numericletters_A71 {

	static int count_of_digit;
	
	public static void main(String[] args) {

		String s1 = "testing 45123";
		
		char c1[] = s1.toCharArray();
		
		System.out.println(Arrays.toString(c1));
		
		for(int i=0; i<s1.length();i++)
		{
			boolean b1= Character.isDigit(c1[i]);
			
			if(b1==true)
			{
			
				count_of_digit++;
		}
		}
		
		System.out.println(count_of_digit);
		
		
	}

}
