package java_tasks_exception;

//task 3.3
final class Constants {
    public static final String COUNTRY = "India";
    public static final double PI = 3.14;
    public static final int MAX_USERS = 100;
   }

//This will cause a compile-time error
		//class Config extends Constants {
		    // Attempting inheritance from a final class
public class FinalClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Country: " + Constants.COUNTRY);
	}

}




