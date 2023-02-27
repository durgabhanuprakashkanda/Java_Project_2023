package day13;

public class Program04 {

	public static void main(String[] args) {
		int[] x= {10,1,20,23,45,65,78,92,100,2}; 
		int count;
		System.out.println(x.length);
		System.out.println("The prime numbers are");
		for(int i=0;i<x.length;i++)
		{
			count=0;
			for(int j=1;j<=x[i];j++) {
				if(x[i]%j==0)
				{
					count++;
				}
			}
			if(count==2) {
				System.out.println(x[i]);
			}
		}
	}

}
