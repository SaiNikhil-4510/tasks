package java_tasks_exception;
//Task 2.1
interface RemoteControl 
{
 
 void turnOn();
 
 default void batteryStatus() 
 {
     System.out.println("Battery is 80% charged.");
 }
}

//TV class implementing RemoteControl
class TV implements RemoteControl
{
 public void turnOn() {
     System.out.println("Turning on the TV...");
 }
}
 
public class Static_default {
 public static void main(String[] args) {
     TV myTV = new TV();
     myTV.turnOn();           
     myTV.batteryStatus();    
 }
}





