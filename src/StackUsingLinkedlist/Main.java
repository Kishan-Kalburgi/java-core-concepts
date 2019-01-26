package StackUsingLinkedlist;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomStack obj = new CustomStack();
		
		obj.push(2);
		obj.push(3);
		obj.push(4);
		
		obj.display();
		
		System.out.println("\nPeek Element " + obj.peek());
		
		obj.pop();
		
		obj.display();
	}

}
