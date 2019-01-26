package staticAndInstanceVariablesDemo;

public class Main {

	// instance variable
	public String studentName;

	// instance variable
	private int age;
	
	// DEPARTMENT is static variable
	public static final String DEPARTMENT = "CSE";

	public Main(String stuName) {
		studentName = stuName;
	}

	public void setage(int stuAge) {
		age = stuAge;
	}

	public void printStudent() {
		System.out.println("studentName  : " + studentName + ", age :" + age + ", Department : " + DEPARTMENT);
	}

	public static void main(String args[]) {
		Main studentObj = new Main("Bob");
		studentObj.setage(24);
		studentObj.printStudent();
	}
}
