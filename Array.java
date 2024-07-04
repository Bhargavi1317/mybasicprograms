package JavaPrograms;

public class Array {
	static	int no_to_check=15;
	public static void main(String[] args) 
	{

		int rollno[]= {12,56,77,65,89};
		//or
		int rollno1[]=new int[5];
		rollno1[0]=10;
		rollno1[1]=13;
		rollno1[2]=15;
		rollno1[3]=19;
		rollno1[4]=90;
		
		
		for(int i=0;i<rollno1.length;i++)
		{
			if(no_to_check==rollno1[i])
			{
				System.out.println("15 is present in the given Array and its index is-> "+i);
			}
		}
	}
}
