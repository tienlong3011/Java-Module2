package Java_BT_QuanLyNhanVien;

import java.util.ArrayList;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new FullTimeEmployee("1", "Quang Anh", 23, "0999888666", "abc", 10000, 1000, 500);
        Employee employee2 = new FullTimeEmployee("2", "BằngAladin", 23, "0999888666", "abc", 15000, 2000, 1000);
        Employee employee5 = new FullTimeEmployee("2", "Quân", 23, "0999888666", "abc", 1000, 2000, 1000);
        Employee employee3 = new PartTimeEmployee("3", "Trường", 23, "0999888666", "abc", 5);
        Employee employee4 = new PartTimeEmployee("4", "Tuấn", 23, "0999888666", "abc", 10);
        Employee employee6 = new PartTimeEmployee("4", "K.Anh", 23, "0999888666", "abc", 105);
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);
        employeeList.add(employee5);
        employeeList.add(employee6);
        EmployeeManager employeeManager = new EmployeeManager();
        employeeManager.setEmployeeList(employeeList);
//        employeeManager.displayEmployee();
//        employeeManager.addEmployee(employee2);
//        employeeManager.displayEmployee();
//        employeeManager.displayFullTimeEmployee();
//        employeeManager.sumSalaryPartTimeEmployee();
        employeeManager.displayEmployee();
        employeeManager.sortEmployee();
    }
}

