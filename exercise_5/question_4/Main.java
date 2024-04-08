package exercise_5.question_4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your birthday (dd/mm/yyyy): ");
        String input = scanner.next();

        DateTimeFormatter formatter= DateTimeFormatter.ofPattern("dd/MM/yyyy");

        try {
            LocalDate date = LocalDate.parse(input,formatter);
            System.out.println("Your birthday: " + date);
        } catch (Exception exception) {
            System.out.println("Invalid input: ");
        }

        scanner.close();

    }
}
