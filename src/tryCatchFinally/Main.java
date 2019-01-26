package tryCatchFinally;

public class Main {
	
	
	int[] arr = new int[2];
	
	void add(int i) throws ArrayIndexOutOfBoundsException {
		arr[3] = i;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main obj = new Main();
		
		
		try {
			
			System.out.println("Try block");
			obj.add(3);
		} catch (ArrayIndexOutOfBoundsException ex) {
			// TODO: handle exception
			System.out.print("Catch block -> ");
			System.out.println("Array out of Bound Exception");
		} finally {
			System.out.println("Finally will block");
		}
	}

}
