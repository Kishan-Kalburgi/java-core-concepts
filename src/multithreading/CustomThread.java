package multithreading;

import java.util.ArrayList;

public class CustomThread implements Runnable {

	ArrayList<Integer> arr = new ArrayList<Integer>();
	
	@Override
	public void run() {
		// TODO Auto-generated method stub

	}
	
	void add(int a) {
		
		for (int i = 0; i < a+100000; i++) {
			arr.add(i);
		}
	}

}
