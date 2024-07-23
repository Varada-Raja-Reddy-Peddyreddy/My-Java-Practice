/*Positive, Negative, or Zero:
Create a program that asks the user to enter a number. Use an if statement with else if to 
check the number's sign:
• If the number is greater than 0, print "The number is positive."
• If the number is less than 0, print "The number is negative."
• Otherwise, print "The number is zero." */

import java.util.Scanner;
public class Positive_Negative_or_Zero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.print("Enter a Number: ");
        number = scanner.nextInt();
        
        if(number>0){
            System.out.println("The number is Positive");
        }
        else if(number <0){
            System.out.println("The number is Negative");
        }
        else{
            System.out.println("Zero!");
        }
        scanner.close();
    }
}
