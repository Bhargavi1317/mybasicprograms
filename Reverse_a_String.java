package JavaPrograms;

public class Reverse_a_String {

	public static void main(String[] args) {

		String name="bhargavi";
		String input =name.toLowerCase();
		String reverse="saicharan";
		for(int i=input.length()-1;i>=0;i--)
		{
			char c1=input.charAt(i);
			reverse=reverse+c1;
			System.out.println(reverse);
			
		}
		
		
	}

}
