/**
 * Practical 9: Inheritance
 *
 * @author Hai Son Vu
 */
public class Vehicle { // parent class
    private int engineCapacity;
    private String make;

//    Constructor
    public Vehicle(int engineCapacity, String make) {
        this.engineCapacity = engineCapacity;
        this.make = make;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
        System.out.println("Changing vehicle engine capacity: new capacity = " + engineCapacity);
    }

    public String getMake() {
        return make;
    }

    public String toString() {
        String output =
                "Vehicle Info:\n" +
                "  engine capacity = " + engineCapacity + "cc" + "\n" +
                "  make = " + make;
        return output;
    }
}
