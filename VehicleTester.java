/**
 * Practical 9: Inheritance
 *
 * @author Hai Son Vu
 */
public class VehicleTester {
    public static void main(String[] args) {
//        Vehicle v1 = new Vehicle(1500, "Mazda");
//        System.out.println(v1);
//
//        Car car1 = new Car(1200, "Holden", "sedan", "Barina");
//        Car car2 = new Car(1500, "Mazda", "sports", "323");
//        System.out.println(car1);
//        System.out.println(car2);
//
//        v1.setEngineCapacity(1600);
//        System.out.println(v1);
//        car1.setEngineCapacity(1600);
//        System.out.println(car1);
//        VehicleDB vdb = new VehicleDB();
//        vdb.addVehicle(new Car(1200, "Holden", "sedan", "Barina"));
//        vdb.addVehicle(new Vehicle(1500, "Mazda"));
//        vdb.addVehicle(new Car(1600, "Nissan", "suv", "X-Trail"));
//        vdb.addVehicle(new Vehicle(1800, "Jeep"));
//        vdb.addVehicle(new Vehicle(1000, "Suzuki"));
//        vdb.addVehicle(new Car(2000, "Kia", "sedan", "Cerato"));
//        vdb.print();
        HoldenDB hdb = new HoldenDB();
        hdb.addCar(1200, "sedan", "Barina");
        hdb.addCar(3800, "wagon", "Commodore");
        hdb.print();
    }
}
