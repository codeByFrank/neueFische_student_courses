import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("test");
        System.out.println("test2");

        int a = 5;
        int b = 3;
        System.out.println(a + b);

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter username");

        String userName = myObj.nextLine();  // Read user input
        System.out.println("Hi " + userName);  // Output user input
    }
}