package java_oops_tasks;
//task 7

class Animal 
{
void sound()
{
   System.out.println("This animal makes a sound");
}
}

class Dog extends Animal 
{
@Override
void sound()
{
   System.out.println("Barking");
}
}

class Cat extends Animal {
@Override
void sound() {
   System.out.println("Meow!");
}
}
class Bird extends Animal {
@Override
void sound() {
   System.out.println("Bird sound");
}
}
public class Animal_sound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Animal a1 = new Dog(); 
		 Animal a2 = new Cat();
	     Animal a3 = new Bird(); 
	     a1.sound();
	     a2.sound();
	     a3.sound();
	}

}


