package BT.frontend;

import BT.backend.Logic;
import BT.backend.model.Employee;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("========Quản lý nhân viên========");
        System.out.println("1: Danh sách nhân viên");
        System.out.println("2: Thêm mới nhân viên");
        System.out.println("3: Xóa nhân viên");
        System.out.println("4. Thoát");
        System.out.println("================================");

        Scanner scanner = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();

        int input = 0;
        while (input != 4) {
            System.out.println("Chọn 1 để hiển thị danh sách nhân viên theo thứ tự tăng dần id.");
            System.out.println("Chọn 2 để thêm mới 1 nhân viên.");
            System.out.println("Chọn 3 để xóa nhân viên.");
            System.out.println("Chọn 4 để thoát.");
            System.out.print("Nhập lựa chọn của bạn: ");

            input = scanner.nextInt();
            scanner.nextLine();

            switch (input) {
                case 1 -> {
                    Logic.sortEmployee(employees);
                    System.out.println("|   Tên      |    Sinh nhật    |    ID      |");
                    System.out.println("-----------------------------------------");
                    for (Employee employee : employees) {
                        System.out.println(employee.toTableRow());
                    }
                }
                case 2 -> {
                    System.out.print("Nhập tên nhân viên: ");
                    String name = scanner.nextLine();
                    System.out.print("Nhập ngày sinh (yyyy-MM-dd): ");
                    String dateString = scanner.nextLine();
                    Date birthday = null;
                    try {
                        birthday = new SimpleDateFormat("yyyy-MM-dd").parse(dateString);
                    } catch (ParseException e) {
                        System.out.println("Ngày sinh không hợp lệ!");
                        break;
                    }
                    System.out.print("Nhập ID: ");
                    String id = scanner.nextLine();
                    Logic.addEmployee(employees, new Employee(name, birthday, id));
                }
                case 3 -> {
                    System.out.print("Nhập ID của nhân viên cần xóa: ");
                    String deleteId = scanner.nextLine();
                    Logic.deleteEmployee(employees, deleteId);
                }
                case 4 -> System.out.println("Thoát chương trình.");
                default -> System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        }

        scanner.close();
    }
}
