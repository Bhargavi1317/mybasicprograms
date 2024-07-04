package JavaPrograms;

import java.util.Arrays;

public class Copy_1Array_toanother_Array_Iteration 

{

	public static void main(String[] args) {

	int rollno[] = new int[5];
	rollno[0]=10;
	rollno[1]=20;
	rollno[2]=30;
	rollno[3]=40;
	rollno[4]=50;
	
	int rollno_copied[] = new int [rollno.length];
	for(int i=0;i<rollno.length;i++)
			{
		rollno_copied[i]=rollno[i];
		
			}
		
		System.out.println(Arrays.toString(rollno));
		System.out.println(Arrays.toString(rollno_copied));
		
	}

}
