package myproject;

//task 5.2

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner sc =new Scanner(System.in);
				System.out.println("Please enter input");
				String input=sc.next();
				String output ="";
				//System.out.println(input.length());
				for(int i=0;i<=(input.length()-1);i++){
					output=input.charAt(i)+output;
			}
				
				System.out.println("originalString :"+ input);
				System.out.println("ReversedString :"+ output);

			}

		}

