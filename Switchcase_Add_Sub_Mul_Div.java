package JavaPrograms;

import java.util.Scanner;

public class Switchcase_Add_Sub_Mul_Div {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Arthmetic Operations using Switch case " );

		int a= s1.nextInt();
		switch(a)
		{
		case 1: 
			int c=10;
			int b=20;
			int sum=c+b;
			System.out.println("case1-Addition" +sum);
			break; 
			
		case 2:
			int c1=100;
			int b1=20;
			int sub=c1-b1;
			System.out.println("case2-sub" +sub);
			break; 
			
		case 3:
			int g=15;
			int k=5;
			int mul=g*k;
			System.out.println("case3-mul" +mul);
			break; 
			
		case 4:
			int m=25;
			int n=100;
			int div=n/m;   
			System.out.println("case4-div" +div);
			break;
			
		}
		
		
		
	}

}
