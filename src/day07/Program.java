package day07;
import java.util.Scanner;
public class Program {
	public static void main(String[] args) {
		Scanner x= new Scanner(System.in);
		System.out.println("Enter the Numbers:-  ");
		int a=x.nextInt();
        int b=x.nextInt();
        int c=x.nextInt();
		x.close();


		if(a>b && a>c)
		{  
			System.out.println("a is greater..!");  
		}
		else if(b>a && b>c)
		{
			System.out.println("b is greater..!");   
		}
		else if(c>a && c>b)
		{
			System.out.println("c is greater..!");   
		}
		else if(a==b && a==c)
		{
			System.out.println("a & b & c are equal..!");
		}
		else if(a==c)
		{
			System.out.println("a & c are equal..!");
		}
		else if(c==b)
		{
			System.out.println("c & b are equal..!");
		}
		else 
		{
			System.out.println("a & b are equal..!");
		}
		

	}

}
