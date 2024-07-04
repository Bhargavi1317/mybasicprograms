package JavaPrograms;

public class Alphabets_present_ingiven_String {
	static int count_of_alphabets;
	
	public static void main(String[] args) {

		String s1="salary of ram is 20000";
		char c1[]=s1.toCharArray();
		
		for(int i=0;i<s1.length();i++)
		{
			boolean b2=Character.isLetter(c1[i]);
			if (b2==true)
			{
				count_of_alphabets++;
			}
		}
		
		System.out.println("The Number of Alphabets in given String are :   " +count_of_alphabets);
		
	}

}
