package JavaPrograms;

public class Remove_Capitalletters_String {

	public static void main(String[] args) {

		String name=" SaiCharaBharGavi";
		String name1=name.replaceAll("[A-Z]","");
		System.out.println(name1); 
	}

}
