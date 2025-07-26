package myproject;
//task no 8.2

public class pre_post_increment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        // Pre/Post Increment
		        int a = 5;
		        System.out.println("Original a = " + a);
		        System.out.println("Post-increment a++ = " + a++); // prints then increments
		        System.out.println("After a++ a = " + a);
		        System.out.println("Pre-increment ++a = " + ++a); // increments then prints

		        // Bitwise Shift Operators
		        int b = 8; // binary: 00001000
		        System.out.println("\nOriginal b = " + b);
		        System.out.println("Left Shift (b << 1) = " + (b << 1));  // 00010000 = 16
		        System.out.println("Right Shift (b >> 1) = " + (b >> 1)); // 00000100 = 4
		        
		        // Logical vs Bitwise AND
		        boolean x = true;
		        boolean y = false;
		        System.out.println("\nLogical AND (x && y): " + (x && y));  // short-circuits, only checks y if x is true
		        System.out.println("Bitwise AND (x & y): " + (x & y));      // always evaluates both sides

		        // Bonus: Bitwise AND with integers
		        int m = 6; // 0110
		        int n = 3; // 0011
		        System.out.println("\nBitwise AND of ints (m & n): " + (m & n)); // 0010 = 2
		    }
		}

	


