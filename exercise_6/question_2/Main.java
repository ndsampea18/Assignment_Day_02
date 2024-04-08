package exercise_6.question_2;
import exercise_5.question_5.model.Account;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Account> accountList = new ArrayList<>();
        printAccount(accountList);
    }

    private static void printAccount(List<Account> accounts) {
        for (Account account : accounts) {
            System.out.println(account);
        }
    }
}
