package day14;

import java.util.Scanner;

public class Program04 {

	public static void main(String[] args) {
		
		// decimal to binary
		Scanner x=new Scanner(System.in);
		System.out.println("Enter the decimal number");
		int a=x.nextInt();
		x.close();
		int temp=a;
		int r=0;
		int i=0;
		int[] y;
		y = new int[20];
		while(a!=0) {
			r=a%2;
			y[i]=r;
			a=a/2;	
			i++;
		}
		int k=0;
		int b[];
		b = new int[y.length];
		for(int j=y.length-1;j>=0;j--) {
			b[k]=y[j];
			System.out.print(b[k]);
			k++;
		}
		System.out.print(" is the binary number of "+temp);

	}
}


