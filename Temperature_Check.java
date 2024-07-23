/*Temperature Check:
Write a program that asks the user for the current temperature. Use a series of if statements to 
categorize the temperature:
• If the temperature is above 30 degrees Celsius, print "It's hot!"
• If the temperature is between 20 and 30 degrees Celsius, print "It's warm."
• If the temperature is between 10 and 20 degrees Celsius, print "It's cool."
• Otherwise, print "It's cold."*/


import java.util.Scanner;
public class Temperature_Check {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int temp;
        System.out.print("Enter Your Current Temperature: ");
        temp = scanner.nextInt();

        if(temp>30){
            System.out.println("It's hot!");
        }
        else if (temp>=20 || temp<=30){
            System.out.println("It's warm.");
        }
        else if(temp>=10 || temp<=20){
            System.out.println("It's cool.");
        }
        else{
            System.out.println("It's cold.");
        }
        scanner.close();

    }
}
