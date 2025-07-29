package java_tasks_exception;

//task 3.2
class Vehicle {
    final void engineType() {
        System.out.println("Company Name: Mahindra");
    }
}

class Car extends Vehicle {
    // This will cause a compile-time error if you try to override engineType()
//     void engineType() {
//         System.out.println("Engine type: Electric");
//     }
}
public class FinalMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Car c = new Car();
	        c.engineType();
	}

}



       
