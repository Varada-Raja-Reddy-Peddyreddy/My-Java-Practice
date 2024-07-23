/*Simple Calculator:
Create a basic calculator that performs addition or subtraction based on user input:
• Display a message "Enter 1 for addition or 2 for subtraction."
• Ask the user for their choice using nextInt().
• Use an if statement to check the choice:
o If 1, ask for two numbers and print their sum.
o If 2, ask for two numbers and print their difference.
• Add an else statement to handle invalid choices. */

import java.util.Scanner;
public class Simple_Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        System.out.print("Enter Your Choice: ");
        choice = scanner.nextInt();
//choice 1 is for addition and choice 2 is for subtraction.
        if(choice ==1){
            Double num1,num2;
            double sum;
            System.out.print("Enter First Numbers: ");
            num1= scanner.nextDouble();
            System.out.print("Enter Second Number: ");
            num2 = scanner.nextDouble();
            sum = num1 +num2;
            System.out.print("The sum of "+num1+" and "+num2+" is "+sum);
        }
        else if(choice ==2){
            Double number1,number2;
            double difference;
            System.out.print("Enter Your first Number: ");
            number1= scanner.nextDouble();
            System.out.print("Enter Your Second Number: ");
            number2 =scanner.nextDouble();
            difference = number1-number2;
            System.out.println("The difference of "+number1+" and "+number2+" is "+difference);
        }
        else{
            System.out.println("invalid choice. please enter 1 for additon or 2 for subtraction.");
        }
        scanner.close();
    }
}
