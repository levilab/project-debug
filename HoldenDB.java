/**
 * Practical 9: Inheritance
 *
 * @author Hai Son Vu
 */

public class HoldenDB extends VehicleDB{
    public HoldenDB() {
        super(20);
    }

    public void addCar(int capacity, String type, String model) {
        Car newCar = new Car(capacity, "Holden", type, model);
        addVehicle(newCar);
    }

    @Override
    public void print() {
        System.out.println("=== Holdens Only ===");
        super.print();
    }
}
