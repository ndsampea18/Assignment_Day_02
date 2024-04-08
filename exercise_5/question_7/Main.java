package exercise_5.question_7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input;

        System.out.println("Enter even number: ");
        while (true) {
            if(scanner.hasNextInt()) {
                input = scanner.nextInt();
                if(input % 2 == 0) {
                    break;
                } else {
                    System.out.println("Please retype :");
                    scanner.nextLine();
                }
            }
        }
    }
}
