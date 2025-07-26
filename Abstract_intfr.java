package java_oops_tasks;

//task 8

abstract class Appliance
{
    abstract void turnOn();
}

interface Connectable
{
    void connect();
}

class SmartTV extends Appliance implements Connectable
{
    void turnOn()
    {
        System.out.println("SmartTV is now ON.");
    }

    public void connect()
    {
        System.out.println("SmartTV connected to Wi-Fi.");
    }
}
public class Abstract_intfr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartTV tv = new SmartTV();
		 tv.turnOn();
		 tv.connect();
	}

}
