package day14;

import java.util.Scanner;

public class Program06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a=new Scanner(System.in);
		System.out.println("enter the Octal number");
		int x=a.nextInt();
		a.close();
		String b = String.valueOf(x);
		int count = b.length();			
		double z=0;
		for(int i=0;i<count;i++)
		{
			z=(Integer.parseInt(b.charAt(i)+"") * Math.pow((8), count-1-i))+z;
		}
		int temp=x;
		int r=0;
		int i=0;
		int[] y;
		int d=(int)z; 
		y = new int[20];
		while(d!=0) {
			r=d%2;
			y[i]=r;
			d=d/2;	
			i++;
		}
		int k=0;
		int c[];
		c = new int[y.length];
		for(int j=y.length-1;j>=0;j--) {
			c[k]=y[j];
			System.out.print(c[k]);
			k++;
		}
		System.out.print(" is the binary number of Octal number"+temp);
	}

}
