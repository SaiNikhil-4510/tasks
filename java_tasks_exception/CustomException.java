package java_tasks_exception;

//task 5.5
class InvalidAccountException extends Exception {
    public InvalidAccountException(String msg) {
        super(msg);
    }
}
public class CustomException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double balance = -500;
        try {
            if (balance < 0) {
                throw new InvalidAccountException("Account balance cannot be negative!");
            }
        } catch (InvalidAccountException e) {
            System.out.println("Exception: " + e.getMessage());
        }
	}

}


