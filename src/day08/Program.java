package day08;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner x=new Scanner(System.in);
		System.out.println("enter the value of a -");
		int a=x.nextInt();
		System.out.println("enter the value of b -");
		int b=x.nextInt();
		System.out.println("enter the value of c -");
		int c=x.nextInt();
		System.out.println("enter the value of d -");
		int d=x.nextInt();
		x.close();
		if(a>=b && a>=c && a>=d) {
			if(a==b && a==c && a==d) {
		         System.out.println("a & b & c & d are equal");
			}
			else if(a==b && a==c && a>d) {
				System.out.println("a & b & c are equal and greater than d");
			}
			else if(a==b && a==d && a>c) {
				System.out.println("a & b & d are equal and greater than c");
			}
			else if(a==d && a==c && a>b) {
				System.out.println("a & d & c are equal and greater than b");
			}
			else if(a==b && a>c && c>d) {
				System.out.println("a & b are equal and greater than c and c is greater than d");
			}
			else if(a==b && a>d && d>c) {
				System.out.println("a & b are equal and greater than d and d is greater than c");
			}
			else if(a==c && a>b && b>d) {
				System.out.println("a & c are equal and greater than b and b is greater than d");
			}
			else if(a==c && a>d && d>b) {
				System.out.println("a & c are equal and greater than d and d is greater than b");
			}
			else if(a==d && a>c && c>b) {
				System.out.println("a & d are equal and greater than c and c is greater than b");
			}
			else if(a==d && a>b && b>c) {
				System.out.println("a & d are equal and greater than b and b is greater than c");
			}
			else if(a>b && b>c && c>d) {
				System.out.println("a is greater than b & b is greater than c and c is greater than d");
			}
			else if(a>b && b>d && d>c) {
				System.out.println("a is greater than b & b is greater than d and d is greater than c");
			}
			else if(a>c && c>b && b>d) {
				System.out.println("a is greater than c & c is greater than b and b is greater than d");
			}
			else if(a>c && c>d && d>b) {
				System.out.println("a is greater than c & c is greater than d and d is greater than b");
			}
			else if(a>d && d>b && b>c) {
				System.out.println("a is greater than d & d is greater than b and b is greater than c");
			}
			else if(a>d && d>c && c>b) {
				System.out.println("a is greater than d & d is greater than c and c is greater than b");
			}
			else if(a>b && b>c && c==d) {
				System.out.println("a is greater than b and b is greater than c and c & d are equal");
			}
			else if(a>b && b>c && b==d) {
				System.out.println("a is greater than b and b is greater than c and b & d are equal");
			}
			else if(a>c && c>b && b==d) {
				System.out.println("a is greater than c and b is greater than c and c & d are equal");
			}
			else if(a>c && c>b && c==d) {
				System.out.println("a is greater than c and c is greater than b and c & d are equal");
			}
			else if(a>d && d>c && c==b) {
				System.out.println("a is greater than d and d is greater than c and c & b are equal");
			}
			else if(a>d && d>c && d==b) {
				System.out.println("a is greater than d and d is greater than c and d & b are equal");
			}
			else if (a==d && b==c && a>b) {
				System.out.println("a& d are equal & greater than b&c and b & c are equal");
			}
			else if (a==c && b==d && a>b) {
				System.out.println("a& c are equal & greater than b&d and b & d are equal");
			}
			else if (a==b && d==c && a>d) {
				System.out.println("a& b are equal & greater than d&c and d & c are equal");
			}
		}
		else if(b>a && b>=c && b>=d) {
			if(b==c && b==d) {
				System.out.println("b & c & d are equal and greater than a ");
			}
			else if(c==a && a==d) {
				System.out.println("b is greater than a & c & d and a & c & d are equal");
			}
			else if(b==c && b>d && d>a){
				System.out.println("b & c are equal and b is greater than d and d is greater than a");
			}
			else if(b==c && a>d){
				System.out.println("b & c are equal and b is greater than a and a is greater than d");
			}
			else if(b==d && b>c && c>a){
				System.out.println("b & d are equal and b is greater than c and c is greater than a");
			}
			else if(b==d && a>c){
				System.out.println("b & d are equal and b is greater than a and a is greater than c");
			}
			else if(a>c && c>d) {
				System.out.println("b is greater than a and a is greater than c and c is greater than d");
			}
			else if(c>a && a>d) {
				System.out.println("b is greater than c and c is greater than a and a is greater than d");
			}
			else if(d>c && c>a) {
				System.out.println("b is greater than d and d is greater than c and c is greater than a");
			}
			else if(c>d && d>a) {
				System.out.println("b is greater than c and c is greater than d and d is greater than a");
			}
			else if(d>a && a>c) {
				System.out.println("b is greater than d and d is greater than a and a is greater than c");
			}
			else if(a>d && d>c) {
				System.out.println("b is greater than a and a is greater than d and d is greater than c");
			}
			else if(a>c && c==d) {
				System.out.println("b is greater than a and a is greater than c & d and c & d are equal");
			}
			else if(c>a && a==d) {
				System.out.println("b is greater than c and c is greater than a & d and a & d are equal");
			}
			else if(d>a && a==c) {
				System.out.println("b is greater than d and d is greater than a & c and a & c are equal");
			}
		}
		else if(c>a && c>b && c>=d) {
			if(c>d && d==b && b==a) {
				System.out.println("c is greater than a & b & d and a & b & d are equal");
			}
			else if(c==d && d>a && a>b) {
				System.out.println("c & d are equal and c & d are greater than a and a is greater than b");
			}
			else if(c==d && d>b && b>a) {
				System.out.println("c & d are equal and c & d are greater than b and b is greater than a");
			}
			else if(c>d && b>d && a>b) {
				System.out.println("c is greater than a and a is greater than b and b is greater than d");
			}
			else if(c>d && a>d && b>a) {
				System.out.println("c is greater than b and b is greater than a and a is greater than d");
			}
			else if(c>d && d>a && a>b) {
				System.out.println("c is greater than d and d is greater than a and a is greater than b");
			}
			else if(c>d && d>b && b>a) {
				System.out.println("c is greater than d and d is greater than b and b is greater than a");
			}
			else if(c>d && b>d && a==b) {
				System.out.println("c is greater than a & b and a & b are equal and a & b is greater than d");
			}
			else if(c>d && d>b && a==b) {
				System.out.println("c is greater than d and d is greater than a & b and a & b are equal");
			}
			else if(c>d && a==d && b>a) {
				System.out.println("c is greater than b and b is greater than a & d and a & d are equal");
			}
			else if(c>d && d==a && a>b) {
				System.out.println("c is greater than a & d and a & d are equal and a & b are greater than b");
			}
		}
		else {
			if(a==b && b==c) {
				System.out.println("d is greater than a & b & c and a & b & c are equal");
			}
			else if(a>b && b==c) {
				System.out.println("d is greater than a and a is greater than b & c and b & c are equal");	
			}
			else if(b>a && a==c) {
				System.out.println("d is greater than b and b is greater than a & c and a & c are equal");
			}
			else if(c>a && a==b) {
				System.out.println("d is greater than c and c is greater than a & b and a & b are equal");
			}
			else if(a>b && b>c) {
				System.out.println("d is greater than a and a is greater than b and b is greater than c");
			}
			else if(b>a && a>c) {
				System.out.println("d is greater than b and b is greater than a and a is greater than c");
			}
			else if(c>a && a>b) {
				System.out.println("d is greater than c and c is greater than a and a is greater than b");
			}
			else if(c>b && b>a) {
				System.out.println("d is greater than c and c is greater than b and b is greater than a");
			}
		}
			
	}

}
