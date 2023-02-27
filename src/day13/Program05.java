package day13;

import java.util.Scanner;

public class Program05 {

	public static void main(String[] args) {
		// Armstrong number
		Scanner x=new Scanner(System.in);
		int n=x.nextInt();
		x.close();
		int temp=n;
		int sum=0;
		while(temp>0) {
			int a=n;
			int pro=1;
			while(a>0) {
				int r=temp%10;
							
				pro = pro*r;
				a=a/10;
			}
			sum = sum+pro;
			temp=temp/10;
		}

		if(n==sum) {
			System.out.println(n+" is a Armstrong number");
		}
		else System.out.println(n+" is not a Armstrong number");
		
	}

}
