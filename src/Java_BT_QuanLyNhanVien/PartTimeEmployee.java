package Java_BT_QuanLyNhanVien;

public class PartTimeEmployee extends Employee{
    private double hours;

    public PartTimeEmployee(String code, String name, int age, String phone, String email, double hours) {
        super(code, name, age, phone, email);
        this.hours = hours;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    @Override
    public double getSalary() {
        return getHours() * 100;
    }

    @Override
    public String toString() {
        return "PartTimeEmployee{" +
                super.toString() +
                "hours=" + hours +
                '}';
    }
}
