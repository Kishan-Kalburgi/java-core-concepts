package collectionSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> emp = new ArrayList<Employee>();
		emp.add(new Employee("Bob", 589, 38));
		emp.add(new Employee("John", 246, 42));
		emp.add(new Employee("Bob", 636, 29));
		
		System.out.println("Unsorted");
		System.out.println(emp);
		
		System.out.println("Sorted with ID");
		Collections.sort(emp, new SortByID());
		System.out.println(emp);
		
		System.out.println("Sorted with age");
		Collections.sort(emp, new SortByAge());
		System.out.println(emp);

	}

}
