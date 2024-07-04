package JavaPrograms;

class two //grandparent class
{
	static void multiply2() //Concrete method
	{
		System.out.println("concrete method2");
	}
	static void div2() //concrete method
	{
		System.out.println("concrete method2");
	}
}


abstract class one extends two//abstract class -parent class
{
abstract void add();   //abstract method

abstract void subtract();//abstract method

static void multiply() //Concrete method static
{
	System.out.println("static concrete method multiply");
}
 void div3() //concrete method non static
{
	System.out.println("non static concrete method div3");
}
}
public class abstract_concrete_class_methods extends one // child class
{

	public static void main(String[] args) {
		System.out.println("main method");
		abstract_concrete_class_methods a5 = new abstract_concrete_class_methods(); //object creation for child class
		a5.div3();
		multiply();
		
		
	}

	@Override
	void add() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void subtract() {
		// TODO Auto-generated method stub
		
	}

}
