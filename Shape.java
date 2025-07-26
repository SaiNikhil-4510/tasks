package java_oops_tasks;
//task 4

abstract class shapes
{
abstract double area();
}
class Circle extends shapes 
{
double rad;

Circle(double rad)
{
   this.rad = rad;
}
double area() {
   return 3.14 * rad * rad;
}
}
class Rectangle extends shapes {
double len, width;
Rectangle(double len, double width) {
   this.len = len;
   this.width = width;
}

double area() {
   return len * width;
}
}
public class Shape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Circle c = new Circle(3);
     Rectangle r = new Rectangle(4, 5);

     System.out.println("Circle area: " + c.area());
     System.out.println("Rectangle area: " + r.area());
 }
}
