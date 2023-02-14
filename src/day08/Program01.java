package day08;

import java.util.Scanner;

public class Program01 {

	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		System.out.println("enter the value of a -");
		int a=x.nextInt();
		System.out.println("enter the value of b -");
		int b=x.nextInt();
		System.out.println("enter the value of c -");
		int c=x.nextInt();
		x.close();
		

		if(a>=b && a>=c)
		{
			if(a==b && a==c)
			{
				System.out.println("a,b, & c are equal");
			}
			else if(a==b && a>c)
			{
				System.out.println("a &b are equal and greater than c");
			}
			else if(a==c && a>b)
			{
				System.out.println("a &c are equal and greater than b");
			}
			else if(b>c)
			{
				System.out.println("a is greater than b and b is greater than c");
			}
			else if(c>b)
			{
				System.out.println("a is greater than c and c is greater than b");
			}
			else
			{
				System.out.println("a is greater than b & c, b &c are equal");
			}


		}
		else if(b>=a && b>=c)
		{
			if(b==c)
			{
				System.out.println("b & c are equal and greater than a");
			}
			else if(a>c)
			{
				System.out.println("b is greater than a and a is greater than c");
			}
			else if(c>a)
			{
				System.out.println("b is greater than c and c is greater than a");
			}
			else
			{
				System.out.println("b is greater than a and c, a & c are equal");

			}
		}
		else
		{
			if(a>b)
			{
				System.out.println("c is greater than a and a is greater than b");
					
			}
			else if(b>a)
			{
				System.out.println("c is greater than b and b is greater than a");
					
			}
			else
			{
				System.out.println("c is greater than a and b, a & b are equal");
			}
		}








	}

}
