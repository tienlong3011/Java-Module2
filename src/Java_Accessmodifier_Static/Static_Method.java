package Java_Accessmodifier_Static;

public class Static_Method {
    private int rollno;
    private String name;
    private static String college = "BBDIT";

    public Static_Method() {
    }

    //constructor to initialize the variable
    Static_Method(int r, String n) {
        rollno = r;
        name = n;
    }

    //static method to change the value of static variable
    static void change() {
        college = "CODEGYM";
    }

    //method to display values
    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }

    public static void main(String args[]) {
        Static_Method.change(); //calling change method

        //creating objects
        Static_Method s1 = new Static_Method(111, "Hoang");
        Static_Method s2 = new Static_Method(222, "Khanh");
        Static_Method s3 = new Static_Method(333, "Nam");

        //calling display method
        s1.display();
        s2.display();
        s3.display();
    }

}
