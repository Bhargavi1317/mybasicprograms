package JavaPrograms;

class seleniumAutomation
{
	static void add()
	{
		int a1=10;
		int b1= 5;
		int sum = a1+b1;
		System.out.println(sum);
		
		
	}
}
class javaAutomation extends seleniumAutomation
{
	static void sub()
	{
		int a2=10;
		int b2= 5;
		int sub = a2-b2;
		System.out.println(sub);
		
		
	}
}
class AutomationTesting extends javaAutomation
{
	void mul()
	{
		int a3=10;
		int b3= 5;
		int mul = a3*b3;
		System.out.println(mul);
		
		
	}
}
public class Multilevel_Inheritance  extends AutomationTesting{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AutomationTesting a5 = new AutomationTesting();
		a5.mul();
		sub();
		add();
		

	}

}
