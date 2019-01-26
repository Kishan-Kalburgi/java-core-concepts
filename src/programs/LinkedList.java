package programs;

import java.util.List;
import java.util.Scanner;

public class LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = new java.util.LinkedList<Integer>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(60);
		list.add(70);
		
		
		System.out.println("Middle element is ");
		System.out.println(list.get(list.size()/2));
		
//		####################################################
		
		System.out.println("############################################");
		
		int number;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number");
		
		number = scan.nextInt();
		
		
	}

}
