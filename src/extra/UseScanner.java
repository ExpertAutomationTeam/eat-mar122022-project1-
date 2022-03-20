package extra;

import java.util.Scanner;

public class UseScanner {
    public static void main(String[] args) {

        //captures the user input

        //object of scanner class
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter your name: ");

        //capture the user input
        String name = scanner.nextLine();

        System.out.println("Hi "+name+" welcome to java class");

        System.out.println("enter your age: ");

        //capture the user input
        int age = scanner.nextInt();

        System.out.println("your age is: "+age);

    }
}
