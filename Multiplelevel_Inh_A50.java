package JavaPrograms;
interface Two   //interface class
{
	 void add(); 

	}

class One 
{
	 void sub()
	{
		int a1=100;
		int b1=50;
		int sub = a1-b1;
		System.out.println(sub);

	}
}
public class Multiplelevel_Inh_A50 extends One implements Two
{
	public static void main(String[] args) {
		System.out.println("Main method starting ");
		Multiplelevel_Inh_A50 m1 = new Multiplelevel_Inh_A50();
		m1.sub();
	

}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		
	}
}

