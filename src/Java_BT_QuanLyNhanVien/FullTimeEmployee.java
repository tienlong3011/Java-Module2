package Java_BT_QuanLyNhanVien;

public class FullTimeEmployee extends Employee{
    private double fixSalary;
    private double bonus;
    private double fine;

    public FullTimeEmployee(String code, String name, int age, String phone, String email, double fixSalary, double bonus, double fine) {
        super(code, name, age, phone, email);
        this.fixSalary = fixSalary;
        this.bonus = bonus;
        this.fine = fine;
    }

    public double getFixSalary() {
        return fixSalary;
    }

    public void setFixSalary(double fixSalary) {
        this.fixSalary = fixSalary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getFine() {
        return fine;
    }

    public void setFine(double fine) {
        this.fine = fine;
    }

    @Override
    public double getSalary() {
        return getFixSalary() - getFine() + getBonus();
    }

    @Override
    public String toString() {
        return "FullTimeEmployee{" +
                super.toString() +
                "fixSalary=" + fixSalary +
                ", bonus=" + bonus +
                ", fine=" + fine +
                '}';
    }
}
