import java.util.Scanner;

public class input_output {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        int age;
        System.out.println("Enter your name:");
        name = scanner.nextLine();
        System.out.println("Hii "+name);

        System.out.println("Enter your age");
        age = scanner.nextInt();
        System.out.println("You are "+age+" ryears old");

        scanner.close();
    }
}
