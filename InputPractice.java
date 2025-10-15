import java.util.Scanner;

public class InputPractice {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1️⃣ Integer input
        System.out.print("Enter an integer: ");
        int myInt = sc.nextInt();

        // 2️⃣ Double input
        System.out.print("Enter a double: ");
        double myDouble = sc.nextDouble();

        // 3️⃣ Float input
        System.out.print("Enter a float: ");
        float myFloat = sc.nextFloat();

        // 4️⃣ Long input
        System.out.print("Enter a long number: ");
        long myLong = sc.nextLong();

        // 5️⃣ Short input
        System.out.print("Enter a short number: ");
        short myShort = sc.nextShort();

        // 6️⃣ Byte input
        System.out.print("Enter a byte number: ");
        byte myByte = sc.nextByte();

        // 7️⃣ Boolean input
        System.out.print("Enter true/false: ");
        boolean myBool = sc.nextBoolean();

        // 8️⃣ Character input
        System.out.print("Enter a character: ");
        char myChar = sc.next().charAt(0); // first character of string

        // 9️⃣ String input
        System.out.print("Enter a string: ");
        sc.nextLine(); // consume newline
        String myString = sc.nextLine();

        // Display all inputs
        System.out.println("\n--- You Entered ---");
        System.out.println("Integer: " + myInt);
        System.out.println("Double: " + myDouble);
        System.out.println("Float: " + myFloat);
        System.out.println("Long: " + myLong);
        System.out.println("Short: " + myShort);
        System.out.println("Byte: " + myByte);
        System.out.println("Boolean: " + myBool);
        System.out.println("Character: " + myChar);
        System.out.println("String: " + myString);
    }
}
