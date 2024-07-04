package JavaPrograms;

import java.util.Arrays;

public class Reverse_Array_ForLoop

{
	static int k=0;

	public static void main(String[] args) 
	{
		int roll_no[] = {10,20,30,40,15};
		int roll_no_reverse[]=new int[5];
		
		for(int i=4;i>=0;i--)
		{
			
			roll_no_reverse[i]=roll_no[k];
			k++;
		}
		System.out.println(Arrays.toString(roll_no));
		System.out.println(Arrays.toString(roll_no_reverse));
		

	}

}
