package exercise_5.question_8;

import exercise_5.question_6.model.Department;
import exercise_5.utils.Position;
import exercise_5.utils.DepartmentEnum;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào chức năng muốn sử dụng: ");

        String input = scanner.nextLine();
        boolean correct = false;

        while (!correct) {
            switch (input) {
                case "1" -> {
                    System.out.println(createAccount("test@gmail,com","test","test",DepartmentEnum.Sales,Position.PM));
                    correct = true;
                }
                case "2" -> {
                    System.out.println(createDepartment("test","Including automated and manual testers"));
                    correct = true;
                }
                default -> {
                    System.out.println("Mời bạn nhập lại :");
                    input = scanner.nextLine();
                }
            }
        }
    }

    private static Account createAccount(String email, String username, String fullname, DepartmentEnum department, Position position) {
        return new Account(new Random().nextLong(), email, username, fullname, department.name(), position.name(), Date.from(LocalDate.now().atStartOfDay(ZoneId.systemDefault()).toInstant()));
    }

    private static Department createDepartment(String name, String description) {
        return new Department(new Random().nextLong(), name, description, LocalDate.now(), LocalDate.now().plusMonths(2));
    }


}
