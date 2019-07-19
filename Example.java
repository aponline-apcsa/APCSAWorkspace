import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        // the following line prints out "Java is working!"
        System.out.println("Java is working!");
        System.out.println("What is your name? (press enter/return when you have typed it):");

        // the following lines get the
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        input.close();

        // the following line prints out a hello message
        System.out.println("Hello, " + name + ".\nNice to meet you, I am Rahul!");
    }
}
