/**
 * Practical 9: Inheritance
 *
 * @author Hai Son Vu
 */

public class VehicleDB {
    private Vehicle[] vehicleList;
    private int numV = 0;

    public VehicleDB() {
        vehicleList = new Vehicle[5];
    }

    public VehicleDB(int dbSize) {
        vehicleList = new Vehicle[dbSize];
    }

    private Vehicle[] grow() {
        Vehicle[] temp = new Vehicle[numV + 10];
        for (int i = 0; i < vehicleList.length; i++) {
            temp[i] = vehicleList[i];
        }
        return temp;
    }
    public void addVehicle (Vehicle vehicle) {
        if (numV == vehicleList.length) {
            this.vehicleList = grow();
        }

        vehicleList[numV] = vehicle;
        numV ++;
    }
    public void print() {
        System.out.println("=== Vehicle Data Base ===");
        for (Vehicle vehicle:vehicleList) {
            if (vehicle != null) {
                System.out.println(vehicle);
            }
        }
    }

    public int getSize() {
        return vehicleList.length;
    }

    public int getNumV() {
        return numV;
    }
}
