package wrapperclass_tasks;

//task 9 Null handler
import java.util.Optional;

public class NullHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Double value = null;
        try
        {
            double primitive = value; 
            System.out.println("Primitive value: " + primitive);
        }
        catch (NullPointerException ex) 
        {
            System.out.println("Caught NullPointerException while unboxing!");
        }

        double safeValueWithOptional = Optional.ofNullable(value).orElse(0.0);//optional
        System.out.println("Safe value using Optional: " + safeValueWithOptional);

        
        double safeValueWithCheck = (value != null) ? value : 0.0;//manual
        System.out.println("Safe value using manual check: " + safeValueWithCheck);
	}

}

