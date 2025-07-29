package java_tasks_exception;

//task 5.3

public class Throw_and_Throws {
	// Method that may throw an exception
    public static void validateAge(int age) throws Exception {
        if (age < 18) {
            throw new Exception("Age must be 18 or above to proceed.");
        } else {
            System.out.println("Access granted – Age verified.");
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
            validateAge(16); // You can change the age for testing
        } catch (Exception ex) 
		{
            System.out.println("Exception caught: " + ex.getMessage());
        }
    
	}

}


    