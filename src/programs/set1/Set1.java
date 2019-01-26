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
		
		System.out.println("");
		
//		String Reverse
		String str = "ABCD";
		
		String[] arrStr = new String[4];
		String[] reverceStr = new String[4];
		
		arrStr = str.split("");
		
		System.out.println("Before Reverce");
		for (String i : arrStr) {
			System.out.printf(i);
		}
		
		System.out.println("\nAfter Reverce");
		
		for (int i = 0; i < arrStr.length; i++) {
			reverceStr[i] = arrStr[arrStr.length-i-1];
 		}
		
		for (String i : reverceStr) {
			System.out.printf(i);
		} 
		
		
	}

}
