/*Age Verification:
Create a program that asks the user for their age. Use an if statement to determine eligibility to 
vote:
• If the user's age is 18 or above, print "You are eligible to vote."
• Otherwise, print "You are not eligible to vote."  */


import java.util.Scanner;
public class Age_Verification {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age;
        System.out.print("Enter your Age: ");
        age = scanner.nextInt();
        if(age>=18){
            System.out.println("You are eligible to vote");
        }
        else{
            System.out.println("You are not eligible to vote");
        }
    }
}
