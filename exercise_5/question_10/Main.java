package exercise_5.question_10;

import exercise_5.question_6.model.Department;
import exercise_5.question_9.model.Group;
import exercise_5.utils.Position;
import exercise_5.utils.DepartmentEnum;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào chức năng muốn sử dụng: ");

        String input = scanner.nextLine();

        List<Group> groups = new ArrayList<>();

        boolean correct = false;

        while (!correct) {
            switch (input) {
                case "1" -> {
                    System.out.println(createAccount("test@gmail,com","test","test",DepartmentEnum.Sales,Position.PM));
                    System.out.println("Bạn có muốn nhập chức năng khác không?");
                    String answer = scanner.nextLine();
                    if(answer.equals("Không")) {
                        correct = true;
                    }
                }
                case "2" -> {
                    System.out.println(createDepartment("test","Including automated and manual testers"));
                    System.out.println("Bạn có muốn nhập chức năng khác không?");
                    String answer = scanner.nextLine();
                    if(answer.equals("Không")) {
                        correct = true;
                    }
                }
                case "3" -> {
                    System.out.println("Enter account username: ");
                    String account_username = scanner.nextLine();
                    System.out.println("Enter group name: ");
                    String group_name = scanner.nextLine();
                    addAccount(account_username, group_name, groups);
                    System.out.println("Bạn có muốn nhập chức năng khác không?");
                    String answer = scanner.nextLine();
                    if(answer.equals("Không")) {
                        correct = true;
                    }
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

    private static void addAccount(String username, String group_name, List<Group> groupList) {
        for (Group group : groupList) {
            if(group.getGroupName().equals(group_name)) {
                group.getAccount_name().add(username);
            }
        }
    }



}
