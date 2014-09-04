package homework2.pkg2;

/* 
 * Chapter No. 2    Excercise No. 3
 * File Name: HomeWork2.java
 * @author: Eric Schenck
 * Date: September 2, 2012
 * 
 * 
 * Problem Statement: Prompt the user to enter a temperature in degrees 
 * Fahrenheit as a whole non-decimal number, then write a program to 
 * convert Fahrenheit to Celsius and print out the converted temperature in 
 * degrees Celsius.
 *
 * Overall plan:
 * 1.) Ask the user to enter a Fahrenheit temperature
 * 2.) subtract the users input by 32
 * 3.) Multiply the sum by 5
 * 4.) divide the sum by 9
 * 5.) print out a statement with the degrees converted to celsius.
 *
 */
//import Scanner and decimal format
import java.text.DecimalFormat;
import java.util.Scanner;


public class HomeWork22 {

    
    public static void main(String[] args) {
        
        
            // Ask the user to input a temperature in Fahrenheit
            System.out.println("Please enter a temperature in degrees"
                    + " Fahrenheit,");
            System.out.println("but make sure the temperature is rounded"
                    + " to the ");
            System.out.println("nearest whole value:");
        
        
        //set the decimal format to one decimal place
        DecimalFormat df1 = new DecimalFormat("0.0");
        
        
        //
        Scanner keyboard = new Scanner(System.in);
        
        // Declare variables to define later
        float n1, sum1, sum2, fnl;
        float n2, sum3, fnl2, fnl3;
        
        // set n1 equal to the user input
        n1 = keyboard.nextInt();
        
        // subtract 32 from the user input(n1)
        sum1 = n1 - 32;
        
        // multiply the sum of the last equation by 5
        sum2 = sum1 * 5;
        
        // divide the sum of the last equation by 9
        fnl = sum2 / 9;
        
        
        // print out a message along with the converted celsius temperature.
        //rounded to the nearest tenth.
            System.out.println("It is... " );
            System.out.println(df1.format(fnl) + " Degrees Celsius.");
            System.out.print("Go ahead and enter another temperature "
                    + "for me too");
            System.out.println(" convert to Celsius:");
       
        // user input is set equal to n2
        n2 = keyboard.nextInt();
    
        // subract 32 from the user input, set equal to sum3
        sum3 = n2 - 32;
    
        // multiply by 5 and set equal to fnl2
        fnl2 = sum3 * 5;
    
        // Divide by 9 and set to fnl3
        fnl3 = fnl2 / 9;
    
            //print out the second temperature in celsius
            System.out.println("It is...");
            System.out.println(df1.format(fnl3) + " Degrees Celsius.");
  
            System.out.println("Alright, I don't feel like doing "
                    + "anymore calculations.");
            System.out.println("Come back tomorrow and we will continue.");
            System.out.println("Goodbye");
    
    
    
    
    }
}
