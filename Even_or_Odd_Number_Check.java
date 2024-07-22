/* Even or Odd Number Check:
Write a program that asks the user to enter a number. Use an if statement to check if the number 
is even or odd:
• If the number divided by 2 has a remainder of 0 (even number), print "The number is 
even."
• Otherwise (odd number), print "The number is odd."   */

import java.util.Scanner;
public class Even_or_Odd_Number_Check {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.print("Enter a number: ");
        number = scanner.nextInt();
        if(number%2==0){
            System.out.println("The number is Even");
        }
        else{
            System.out.println("The number is Odd");
        }

    } 
}
