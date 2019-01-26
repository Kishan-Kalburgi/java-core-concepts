package StackUsingLinkedlist;

public class CustomStack {

	Node top;

	public CustomStack() {
		this.top = null;
	}

	public void push(int x) {
		Node temp = new Node();

		if (temp == null) {
			System.out.println("Stack Overflow");
			return;
		}

		temp.data = x;
		temp.link = top;
		top = temp;
	}

	public boolean isEmpty() {
		return top == null;
	}

	public int peek() {
		if (!isEmpty()) {
			return top.data;
		} else {
			System.out.println("Stack is empty");
			return -1;
		}
	}

	public void pop() {
		if (isEmpty()) {
			System.out.println("Stack underflow");
			return;
		}
		System.out.println(top.data + " was deleted");
		top = (top).link;
		
	}

	public void display() {
		if (isEmpty()) {
			System.out.println("Stack Underflow");
			return;
		} else {
			Node temp = top;
			System.out.printf("Stack");
			while (temp != null) {
				System.out.printf("-> ");
				System.out.printf("%d ", temp.data);
				temp = temp.link;
			}
		}
	}
}
