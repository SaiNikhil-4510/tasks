package myproject;
//task 11.2
public class String_buffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        // Create a StringBuffer
		        StringBuffer sb = new StringBuffer();

		        // Append a sentence
		        sb.append("Java programming is fun.");
		        System.out.println("After append: " + sb);

		        // Insert a word at index 5
		        sb.insert(5, "language ");
		        System.out.println("After insert: " + sb);

		        // Delete or  remove characters from index 5 to 14 ("language ")
		        sb.delete(5, 14);
		        System.out.println("After delete: " + sb);
		    }
		}

