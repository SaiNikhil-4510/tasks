package wrapperclass_tasks;

// task 5 generic wrapper class

class Box<T>
{
	 private T value;

	 public void setValue(T value)
	 {
	     this.value = value;
	 }

	 public T getValue() 
	 {
	     return this.value;
	 }
}

public class GenericWrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	     Box<Integer> intBox = new Box<>();
	     intBox.setValue(20); 
	     Integer retrievedInt = intBox.getValue();
	     System.out.println("Integer value: " + retrievedInt);

	     Box<Double> doubleBox = new Box<>();
	     doubleBox.setValue(3.14); 
	     Double retrievedDouble = doubleBox.getValue();
	     System.out.println("Double value: " + retrievedDouble);
	}

}


