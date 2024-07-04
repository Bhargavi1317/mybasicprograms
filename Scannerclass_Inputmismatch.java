package JavaPrograms;

import java.util.Scanner;

public class Scannerclass_Inputmismatch 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner s1 = new Scanner(System.in);
		int age = s1.nextInt();
		byte marks = s1.nextByte();
		short salary = s1.nextShort();
		//String name = s1.next();
		long aadhar = s1.nextLong();
		boolean b1 = s1.nextBoolean();
		float f1 = s1.nextFloat();
		double d1 = s1.nextDouble();	

	}

}
