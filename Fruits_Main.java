public class Fruits_Main {
    public static void main(String[] args) {

        Fruits fruits = new Fruits("apple", "mango", "banana", "pineapple");
        System.out.println("These are all the fruits:");
        System.out.println(fruits.Fruits1);
        System.out.println(fruits.Fruits2);
        System.out.println(fruits.Fruits3);
        System.out.println(fruits.Fruits4);

        Fruits fruits1 = new Fruits("apple", "mango", "banana");
        System.out.println("These are all the fruits:");
        System.out.println(fruits1.Fruits1);
        System.out.println(fruits1.Fruits2);
        System.out.println(fruits1.Fruits3);
    }
}
