/*Leap Year Check:
Write a program to determine if a given year is a leap year. A leap year is a year divisible by 4, 
but not by 100 unless also divisible by 400. Use a combination of if and else if statements to 
achieve this:
• Ask the user for the year.
• Check divisibility by 4:
o If divisible by 4 but not by 100, it's a leap year.
o If divisible by 100, further check divisibility by 400.
▪ If divisible by 400, it's a leap year.
• Otherwise, it's not a leap year. (Use else statement*/

import java.util.Scanner;
public class Leap_Year_Check {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.print("Enter a Year: ");
        year = scanner.nextInt();

        if(year % 4 ==0){
            if(year % 100 !=0){
                System.out.println(year+" is a Leap year!");
            }
            else if(year % 400 ==0){
                System.out.println(year+" is a Leap year!");
            }
        }
        else{
            System.out.println(year+" is Not a Leap Year!");
        }
        scanner.close();
    }
}
