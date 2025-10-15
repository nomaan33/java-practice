import java.util.Scanner; // import Scanner class

public class UserInputExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // create Scanner object

        System.out.print("Enter your name: ");
        String name = sc.nextLine(); // read string

        System.out.print("Enter your age: ");
        int age = sc.nextInt(); // read integer

        System.out.println("Hello, " + name + "! You are " + age + " years old.");
    }
}
