package BT.backend;

import BT.backend.model.Employee;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Logic {
    public static void sortEmployee(List<Employee> employeeList) {
        employeeList.sort(Comparator.comparing(Employee::getId));
    }

    public static void addEmployee(List<Employee> employeeList, Employee employee) {
        employeeList.add(employee);
    }

    public static void deleteEmployee(List<Employee> employeeList, String id) {
        for (Iterator<Employee> iterator = employeeList.iterator(); iterator.hasNext(); ) {
            Employee employee = iterator.next();
            if (employee.getId().equals(id)) {
                iterator.remove();
                System.out.println("Nhân viên có ID " + id + " đã được xóa.");
            }
        }
    }
}
