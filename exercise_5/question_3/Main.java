package exercise_5.question_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your surname: ");
        String surname = scanner.nextLine();

        System.out.println("Enter your name:");
        String name = scanner.nextLine();

        System.out.println("Your name: " + surname +' ' + name);

        scanner.close();
    }
}
