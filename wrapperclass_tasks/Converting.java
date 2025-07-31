package wrapperclass_tasks;

// task 1  converting datatype into wrapper class and vice versa
public class Converting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 20;
        double d = 3.14159;
        char c = 'A';
        
        Integer intObj = Integer.valueOf(i);
        Double doubleObj = Double.valueOf(d);
        Character charObj = Character.valueOf(c);

        int newInt = intObj.intValue();
        double newDouble = doubleObj.doubleValue();
        char newChar = charObj.charValue();
        
        //  Print all values
        System.out.println("Original int: " + i + ", Wrapper: " + intObj + ", Back to Primitive: " + newInt);
        System.out.println("Original double: " + d + ", Wrapper: " + doubleObj + ", Back to Primitive: " + newDouble);
        System.out.println("Original char: " + c + ", Wrapper: " + charObj + ", Back to Primitive: " + newChar);
    
        
	}

}


        
