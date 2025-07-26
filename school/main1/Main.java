package com.school.main1;
//task 4.2
import com.school.utils.MathUtils;


import static com.school.utils.MathUtils.PI;
import static com.school.utils.MathUtils.square;

public class Main {
 public static void main(String[] args) {
     System.out.println("Using static PI: " + PI); 
     System.out.println("Square of 5: " + square(5)); 

    
     int result = MathUtils.square(7);
     System.out.println("Square of 7 (class-qualified): " + result);
 }
}

