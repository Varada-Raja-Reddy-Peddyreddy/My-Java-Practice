import java.util.Scanner;

public class Animal_Main {
    public static void main(String[] args) {
        Animal animal;
        Scanner Scanner = new Scanner(System.in);
        System.out.println("What animal do you want?");
        System.out.print("(1=Dog) or (2=Cat): ");
        
        int Choice=Scanner.nextInt();

        if (Choice==1){
            animal = new Dog();
            animal.speak();

        }
        else if (Choice ==2){
            animal = new Cat();
            animal.speak();
        }

        else{
            System.out.println("This Choice was invalid!");
            animal = new Animal();
            animal.speak();
        }
    }
}
