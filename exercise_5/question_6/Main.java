package exercise_5.question_6;

import exercise_5.question_6.model.Department;

import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter name department: ");
        String name = scanner.nextLine();

        System.out.println("Enter description department: ");
        String description = scanner.nextLine();

        LocalDate create_at = LocalDate.now();
        LocalDate update_at = LocalDate.now().plusMonths(2);

        Department department = new Department(new Random().nextLong(), name, description, create_at, update_at);
        System.out.println(department);

        scanner.close();
    }


}
