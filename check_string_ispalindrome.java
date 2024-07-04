package JavaPrograms;

public class check_string_ispalindrome {

	public static void main(String[] args) {
		String name ="rotator"
				+ "";
		String input =name.toLowerCase();
		String reverse="";
		for(int i=input.length()-1;i>=0;i--)
		{
			char c1=input.charAt(i);
			reverse=reverse+c1;
		}
			System.out.println(reverse);
			boolean result = name.equals(reverse);
			System.out.println(result);
			
			if(result==true)
			{
				System.out.println("given string is palindrome");

			}
			
			else
			{
				System.out.println("given string is not palindrome");
			}
			
		}
		
		
		
	}


