package programs.set1;

import java.util.Arrays;
import java.util.Scanner;

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
		String str = "ABABA";

		String[] arrStr = new String[5];
		String[] reverceStr = new String[5];

		arrStr = str.split("");

		System.out.println("Before Reverce");
		for (String i : arrStr) {
			System.out.printf(i);
		}

		System.out.println("\nAfter Reverce");

		for (int i = 0; i < arrStr.length; i++) {
			reverceStr[i] = arrStr[arrStr.length - i - 1];
		}

		for (String i : reverceStr) {
			System.out.printf(i);
		}

		System.out.println("");
		if (Arrays.equals(arrStr, reverceStr)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("not");
		}

		int[] arrInt = new int[5];
		int[] reverceInt = new int[5];
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter 5 digit Number");
		for (int i = 0; i < arrInt.length; i++) {
			arrInt[i] = scan.nextInt();
		}

		System.out.println("Inpute Numbers are: ");
		for (int i : arrInt) {
			System.out.print(i);
		}

		for (int i = 0; i < arrInt.length; i++) {
			reverceInt[i] = arrInt[arrInt.length - i - 1];
		}

		System.out.println("\nAfter reverce");
		for (int i : reverceInt) {
			System.out.print(i);
		}

		System.out.println("");
		if (Arrays.equals(arrInt, reverceInt)) {
			System.out.println("Number is Palindrome");
		} else {
			System.out.println("Number is NOT a Palindrome");
		}
	}

}
