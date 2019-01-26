package runtimePolymorphism;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent myObj = new Child();
		System.out.println("Invoking child class");
		myObj.myMethod();
		
		Parent myObj2 = new Parent();
		System.out.println("Invoking Parent Class");
		myObj2.myMethod();
	}

}
