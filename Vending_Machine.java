/*Vending Machine (Single Choice):
Simulate a simple vending machine with two options:
• Display a message "Press 1 for juice or 2 for soda."
• Ask the user for their choice using nextInt() method.
• Use an if statement to check the choice: 
o If 1, print "Dispensing juice."
o If 2, print "Dispensing soda."
o Otherwise, print "Invalid choice."  */

import java.util.Scanner;
public class Vending_Machine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Press 1 for juice or 2 for soda:");
        int choice = scanner.nextInt();
        if(choice ==1){
            System.out.println("Dispensing juice.");
        }
        else if (choice==2){
            System.out.println("Dispensing soda.");

        }
        else{
            System.out.println("Choice Not Found");
        }
    }
}
