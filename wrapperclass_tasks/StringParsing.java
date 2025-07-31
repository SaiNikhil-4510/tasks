package wrapperclass_tasks;

// task 3 string prasing method 

public class StringParsing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

       // Define input strings
        String intStr = "123";
        String doubleStr = "45.67";
        String boolStr = "true";

        //Parse strings to primitives
        int intVal = Integer.parseInt(intStr);
        double doubleVal = Double.parseDouble(doubleStr);
        boolean boolVal = Boolean.parseBoolean(boolStr);

        //Print the converted primitives and their types
        System.out.println("Parsed int: " + intVal + " (Type: int)");
        System.out.println("Parsed double: " + doubleVal + " (Type: double)");
        System.out.println("Parsed boolean: " + boolVal + " (Type: boolean)");
	}

}

       