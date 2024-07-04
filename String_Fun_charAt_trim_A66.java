package JavaPrograms;

public class String_Fun_charAt_trim_A66 {

	public static void main(String[] args)
	
	{
		
		String name = "india good morning";
		char first_char = name.charAt(4);
		System.out.println(first_char);
		
		String name1 = "bhargavi";
		int i1=name1.indexOf('r');
		System.out.println(i1);
		
		String s1= "       selinium-java Automation Testing     batch42";
		String trimmed = s1.trim();
		System.out.println(trimmed);
		
		String name3 = "Automation batch - selinium java";
		String s2=name3.substring(5);
		System.out.println(s2);

		String name4 = "corejava Automation batch 42 - selinium java";
		String s3=name3.substring(2,9);
		System.out.println(s3);
		
		
	}

}
