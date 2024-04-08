package exercise_5.question_9;

import exercise_5.question_9.model.Group;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Account> accounts = new ArrayList<>();
        List<Group> groups = new ArrayList<>();

        for (Account account : accounts) {
            System.out.println(account.getUsername());
        }

        System.out.println("Enter account username: ");
        String account_username = scanner.nextLine();

        System.out.println(groups);

        System.out.println("Enter group name: ");
        String group_name = scanner.nextLine();

        addAccount(account_username, group_name, groups);
    }

    private static void addAccount(String username, String group_name, List<Group> groupList) {
        for (Group group : groupList) {
            if(group.getGroupName().equals(group_name)) {
                group.getAccount_name().add(username);
            }
        }
    }

}
