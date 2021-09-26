package Java_BT_QuanLyNhanVien;

import java.util.ArrayList;

import java.util.List;

public class EmployeeManager {
    private List<Employee> employeeList;

    public EmployeeManager() {
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public void displayEmployee() {
        System.out.println("Danh sách tất cả NV là: ");
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }

    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }

    public void displayFullTimeEmployee() {
        double totalSalary = 0;
        List<FullTimeEmployee> fullTimeEmployeeList = new ArrayList<>();

        for (Employee employee : employeeList) {
            totalSalary += employee.getSalary();
        }
        double avgSalary = totalSalary / employeeList.size();
        System.out.println("Lương trung bình của Công ty là: " + avgSalary);

        for (Employee employee : employeeList) {
            if (employee instanceof FullTimeEmployee && employee.getSalary() < avgSalary) {
                fullTimeEmployeeList.add((FullTimeEmployee) employee);
            }
        }

        System.out.println("Danh sách NV FullTime có lương thấp hơn lương trung bình là: ");
        if (!fullTimeEmployeeList.isEmpty()) {
            for (FullTimeEmployee fullTimeEmployee : fullTimeEmployeeList) {
                System.out.println(fullTimeEmployee);
            }
        } else {
            System.out.println("Không có nhân viên nào phù hợp!");
        }

    }

    public void sumSalaryPartTimeEmployee() {
        double sumSalaryPart = 0;
        for (Employee employee : employeeList) {

            if (employee instanceof PartTimeEmployee) {
                sumSalaryPart += employee.getSalary();
            }
        }
        System.out.println("Tổng lương của NV PartTime là: " + sumSalaryPart);
    }

    public void sortEmployee() {
        List<FullTimeEmployee> fullTimeEmployeeList = new ArrayList<>();
        for (Employee employee : employeeList) {
            if (employee instanceof FullTimeEmployee) {
                fullTimeEmployeeList.add((FullTimeEmployee) employee);
            }
        }

        for (int i = 0; i < fullTimeEmployeeList.size(); i++) {
            for (int j = 0; j < fullTimeEmployeeList.size()-1; j++) {
                if(fullTimeEmployeeList.get(j).getSalary() > fullTimeEmployeeList.get(j+1).getSalary()){
                    FullTimeEmployee temp = fullTimeEmployeeList.get(j);
                    fullTimeEmployeeList.set(j, fullTimeEmployeeList.get(j+1));
                    fullTimeEmployeeList.set(j+1, temp);
                }
            }
        }

        System.out.println("Danh sách NV FullTime sau khi sắp xếp theo lương tăng dần là: ");
        for (FullTimeEmployee fullTimeEmployee : fullTimeEmployeeList) {
            System.out.println(fullTimeEmployee);
        }
    }
}
