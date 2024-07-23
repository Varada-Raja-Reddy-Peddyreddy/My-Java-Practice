/*Grading System:
Write a program that asks the user for their exam score. Use a switch statement to assign a letter 
grade based on the score:
• 90-100: "A" (Excellent)
• 80-89: "B" (Very Good)
• 70-79: "C" (Good)
• 60-69: "D" (Satisfactory)
• Below 60: "F" (Fail)
• You can add a default case for any invalid score input.*/

import java.util.Scanner;

public class Grading_System {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score;

        System.out.print("Enter Your Score: ");
        score = scanner.nextInt();

        if (score < 0 || score > 100) {
            System.out.println("Invalid score. Please enter a score between 0 and 100.");
        } else {
            switch (score / 10) {
                case 10: //  score of 100
                case 9:
                    System.out.println("A   (Excellent)");
                    break;
                case 8:
                    System.out.println("B   (Very Good)");
                    break;
                case 7:
                    System.out.println("C   (Good)");
                    break;
                case 6:
                    System.out.println("D   (Satisfactory)");
                    break;
                case 5: // This case handles scores from 50 to 59
                case 4: // This case handles scores from 40 to 49
                case 3: // This case handles scores from 30 to 39
                case 2: // This case handles scores from 20 to 29
                case 1: // This case handles scores from 10 to 19
                case 0: // This case handles scores from 0 to 9
                    System.out.println("F   (Fail)");
                    break;
                default:
                    System.out.println("Invalid score.");
                    break;
            }
        }
        scanner.close();
    }
}
