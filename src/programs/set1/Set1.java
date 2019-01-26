package programs.set1;

public class Set1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Kishan Kalburgi");
		
		int[] arr = new int[100];
		int temp = 1;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = temp;
			temp++;
		} 
		
		for (int i : arr) {
			System.out.printf(i + ", ");
		}
		
		
		
	}

}
