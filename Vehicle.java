package java_oops_tasks;

//task 5

class BaseVehicle
{
 String brand;
 int speed;

 BaseVehicle(String brand, int speed)
 {
     this.brand = brand;
     this.speed = speed;
 }

 void showDetails()
 {
     System.out.println("Brand: " + brand);
     System.out.println("Speed: " + speed + " km/h");
 }
}

class Car extends BaseVehicle 
{
 Car(String brand, int speed)
 {
     super(brand, speed);
 }

 @Override
 void showDetails() 
 {
     System.out.println("Car Brand: " + brand);
     System.out.println("Car Speed: " + speed + " km/h");
 }
}
class Bike extends BaseVehicle 
{
 Bike(String brand, int speed) 
 {
     super(brand, speed);
 }

 @Override
 void showDetails() {
     System.out.println("Bike Brand: " + brand);
     System.out.println("Bike Speed: " + speed + " km/h");
 }
}

public class Vehicle
{
 public static void main(String[] args) {
	// TODO Auto-generated method stub
     Car myCar = new Car("Toyota", 180);
     Bike myBike = new Bike("Yamaha", 120);
     myCar.showDetails();
     System.out.println();
     myBike.showDetails();
 }
}

