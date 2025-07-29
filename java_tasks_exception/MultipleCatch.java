package java_tasks_exception;

//task 5.4
public class MultipleCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
	            int[] arr = {10, 20};
	            int value = arr[2]; // ArrayIndexOutOfBoundsException
	            int result = 10 / 0; // ArithmeticException
	            System.out.println("Result: " + result);
	        } catch (ArrayIndexOutOfBoundsException ex) {
	            System.out.println("Index out of range!");
	        } catch (ArithmeticException ex) {
	            System.out.println("Division by zero!");
	        }
	}

}

       
