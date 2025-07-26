package java_tasks_exception;
//task 1.1

abstract class Shape_of_different
{
abstract double area(); 
}

class Circle extends Shape_of_different
{
double radius;

Circle(double radius) 
{
   this.radius = radius;
}

double area()
{
   return 3.14 * radius * radius;
}
}

class Rectangle extends Shape_of_different
{
double length, width;

Rectangle(double length, double width) 
{
   this.length = length;
   this.width = width;
}

double area()
{
   return length * width;
}
}
public class Shape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape_of_different c = new Circle(3.0);
		Shape_of_different r = new Rectangle(2.3, 5.0);

	     System.out.println("Area of a Circle: " + c.area());
	     System.out.println("Area of a Rectangle: " + r.area());
	}

}

     