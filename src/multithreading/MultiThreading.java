package multithreading;

import java.sql.Timestamp;
import java.util.Date;

public class MultiThreading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date date = new Date();
		CustomThread obj1 = new CustomThread();
		CustomThread obj2 = new CustomThread();
		System.out.println(new Timestamp(date.getTime()));
		obj1.add(0);
		obj2.add(0);
		date = new Date();
		System.out.println(new Timestamp(date.getTime()));

		Thread t1 = new Thread(new CustomThread(), "t1");
		Thread t2 = new Thread(new CustomThread(), "t2");

		System.out.println("Starting Runnable threads");
		System.out.println(new Timestamp(date.getTime()));
		t1.start();
		t2.start();
		System.out.println(new Timestamp(date.getTime()));
	}

}
