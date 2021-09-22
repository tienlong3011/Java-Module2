package Java_Accessmodifier_Static;

public class xay_dung_lop_chi_ghi_trong_java {
    private String name;
    private String classes;

    public xay_dung_lop_chi_ghi_trong_java() {
    }

    public String getName() {
        return name;
    }

    public String getClasses() {
        return classes;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setClasses(String classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "xay_dung_lop_chi_ghi_trong_java{" + "name='" + name + '\'' + ", classes='" + classes + '\'' + '}';
    }

    public static void main(String[] args) {
        xay_dung_lop_chi_ghi_trong_java student1 = new xay_dung_lop_chi_ghi_trong_java();
        student1.setName("long");
        student1.setClasses("c0821h1");
        System.out.println(student1.toString());
    }
}
