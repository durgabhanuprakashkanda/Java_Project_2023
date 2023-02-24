package day11;

public class Program08 {

	public static void main(String[] args) {
	  /*1
		2 4
		3 9 3
		4 16 4 16
		5 25 5 25 5
		
		5 25 5 25 5 
		4 16 4 16 
		3 9 3 
		2 4 
		1 */
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				if(j%2==0) {
					System.out.print(i*i+" ");
				}
				else System.out.print(i+" ");
			}
			System.out.println();
		}
		
		
		for(int i=5;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				if(j%2==0) {
					System.out.print(i*i+" ");
				}
				else System.out.print(i+" ");
			}
			System.out.println();
		}

	}

}
