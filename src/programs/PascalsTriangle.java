package programs;

import java.util.Scanner;

public class PascalsTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		pascals triangle formula a = a * (line - i) / i; 
		
		int line;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter number of lines");
		line = scan.nextInt();
		
		for (int i = 1; i <= line; i++) {
			int a=1;
			for (int j = 1; j <= i; j++) {
				
				System.out.print(a + " ");
				a = a * (i - j) / j;
			}
			System.out.println("");
		}
		
	}

}
