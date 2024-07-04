package JavaPrograms;

public class Remove_allSpaces_fromString {

	public static void main(String[] args) {

		String name=" sai charan bhargavi";
		String name1=name.replace(" ", "");
		
		//System.out.println(name1);   
		System.out.println(name1.replaceAll(" ",""));
		
		
	}

}
