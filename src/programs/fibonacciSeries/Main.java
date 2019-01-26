package programs.fibonacciSeries;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0, b=1, c, count=10;
		System.out.printf(a + " " + b + " ");
		for (int i = 0; i <= count; i++) {
			c = a + b;
			System.out.printf(c + " ");
			a = b;
			b = c;
		}
		
	}

}
