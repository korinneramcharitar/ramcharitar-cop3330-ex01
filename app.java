package base;

import java.util.Scanner;

/*Create a program that prompts for your name and prints a greeting using your name.

 */
public class app {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = in.nextLine();

        String outputString = "Hello, " + name + ", nice to meet you";
        System.out.println(outputString);

    }
}
