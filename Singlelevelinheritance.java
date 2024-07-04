package JavaPrograms;

class inheritance 
{
	static void add()           //Static method
	{
		int a= 2;
		int b=5;
		int sum=a+b;
		System.out.println(sum);
	}
}

public class Singlelevelinheritance extends inheritance{
	 void subtract()       //non-static method
	{
		int a=5;
		int b=10;
		int subtract = a-b;
		System.out.println(subtract);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Singlelevelinheritance s2= new Singlelevelinheritance();
		s2.subtract();
		add();

	}

}
