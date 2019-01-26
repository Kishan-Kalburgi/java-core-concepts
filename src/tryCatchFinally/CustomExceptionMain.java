package tryCatchFinally;

public class CustomExceptionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			throw new CustomException("Custom Exception");
		} catch (CustomException e) {
			// TODO: handle exception
			System.out.println("Catch Block"); 
			  
            System.out.println(e.getMessage()); 
		}
	}

}
