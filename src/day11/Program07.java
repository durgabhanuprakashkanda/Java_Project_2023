package day11;

public class Program07 {

	public static void main(String[] args) {
		/*54321
		  5432
		  543
		  54
		  5*/
		for(int i=1;i<=5;i++) {
			for(int j=5;j>=i;j--) {
				System.out.print(j);
			}
			System.out.println();
		}

		
		for(int i=5;i>=1;i--) {
			for(int j=5;j>=i;j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
