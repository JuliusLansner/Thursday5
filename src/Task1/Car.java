package Task1;

public class Car {
    private String make;
    private String model;
    private int year;
    private String bodyStyle;
    private Driver driver;
    public Car(String make, String model, int year, String bodyStyle, Driver driver){


    }
    //getter
    public Driver getDriver(){
        return driver;
    }
    //setter
    public void setDriver(Driver newDriver){
        this.driver= newDriver;
    }

    @Override
    public String toString() {
        return "Task1.Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", bodyStyle='" + bodyStyle + '\'' +
                '}';
    }

}
