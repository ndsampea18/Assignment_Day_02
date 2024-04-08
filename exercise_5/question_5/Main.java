package exercise_5.question_5;


import java.time.ZoneId;
import java.time.LocalDate;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

import exercise_5.question_5.model.Account;
import exercise_5.utils.DepartmentEnum;
import exercise_5.utils.Position;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your email: ");
        String email = scanner.nextLine();

        System.out.println("Enter your username: ");
        String username = scanner.nextLine();

        System.out.println("Enter your fullname: ");
        String fullname = scanner.nextLine();

        System.out.println("Enter your departmentID: ");
        String departmentID = scanner.nextLine();
        String departmentName = "";

        switch (departmentID) {
            case "1" -> departmentName += DepartmentEnum.Sales;
            case "2" -> departmentName += DepartmentEnum.Test;
            default -> departmentName += "null";
        }

        System.out.println("Enter your positionID: ");
        String positionID = scanner.nextLine();
        String position = "";

        switch (positionID) {
            case "1" -> position += Position.DEV;
            case "2" -> position += Position.Test;
            case "3" -> position += Position.ScrumMaster;
            case "4" -> position += Position.PM;
            default -> position += "null";
        }


        Account account = new Account(new Random().nextLong(), email, username, fullname, departmentName, position, Date.from(LocalDate.now().atStartOfDay(ZoneId.systemDefault()).toInstant()));

        System.out.println(account);
        scanner.close();
    }


}
