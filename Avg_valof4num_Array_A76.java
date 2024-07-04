package JavaPrograms;

public class Avg_valof4num_Array_A76 {

	public static void main(String[] args) 
	{

		int no[] = new int[4];
		no[0]=15;
		no[1]=25;
		no[2]=30;
		no[3]=50;
		int sum=0;
		double average=0;
		for(int i=0;i<no.length;i++)
		{
			sum=sum+no[i];
		}
		 System.out.println("Addition of 4 numbers in array is : "+sum);
		 average=sum/no.length;
		 System.out.println("Average of 4 numbers in array is : "+average);
		
		
		
	}

}
