package wrapperclass_tasks;

//task 4 comparing == and . 

public class Comparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Integer number = 100;
        
        Integer created = new Integer(100);
        
        System.out.println("number == created: " + (number == created));

        // Compare using .equals()
        System.out.println("number.equals(created): " + number.equals(created));
	}

}
