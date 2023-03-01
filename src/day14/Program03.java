package day14;

import java.util.Scanner;

public class Program03 {

	public static void main(String[] args) {
		
		// binary to decimal
		
		Scanner a=new Scanner(System.in);
		System.out.println("enter the binary number");
		int x=a.nextInt();
		a.close();
		String y = String.valueOf(x);
		int count = y.length();			
		double z=0;
		for(int i=0;i<count;i++)
		{
			z=(Integer.parseInt(y.charAt(i)+"") * Math.pow((2), count-1-i))+z;
		}
		System.out.println("The decimal value of "+x+" is "+ z);
	}

}
