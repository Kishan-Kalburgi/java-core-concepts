package programs;

import java.util.List;

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
	}

}
