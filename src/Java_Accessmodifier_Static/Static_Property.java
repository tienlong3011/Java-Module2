package Java_Accessmodifier_Static;

public class Static_Property {

    private String name;

    private String engine;

    public static int numberOfCars;



    public Static_Property(String name, String engine) {

        this.name = name;

        this.engine = engine;

        numberOfCars ++;

    }



    // getters and setters
    public static void main(String[] args) {

        Static_Property car1 = new Static_Property("Mazda 3","Skyactiv 3");

        System.out.println(Static_Property.numberOfCars);

        Static_Property car2 = new Static_Property("Mazda 6","Skyactiv 6");

        System.out.println(Static_Property.numberOfCars);

        Static_Property car3 = new Static_Property("Mazda cx-5","Skyactiv ");

        System.out.println(Static_Property.numberOfCars);

    }
}
