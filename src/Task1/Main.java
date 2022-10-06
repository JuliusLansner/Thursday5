package Task1;

public class Main {
    public static void main(String[] args) {
        //
        Driver driver1 = new Driver("mig",4);
        Car car1 = new Car("make","model",69,"goodStyle",driver1);
        Car car2 = new Car("make1","model1",70,"bestStyle",driver1);
        System.out.println(driver1);

    }
}