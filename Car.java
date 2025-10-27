/**
 * Practical 9: Inheritance
 *
 * @author Hai Son Vu
 */
public class Car extends Vehicle{
    private String type, model;
    public Car(int engineCapacity, String make, String type, String model) {
        super(engineCapacity, make);
        this.type = type;
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public String getModel() {
        return model;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setEngineCapacity(int engineCapacity) {
        System.out.println("Cannot change the engine capacity of a car");
    }


    public String toString() {
        String output = super.toString();
        output += "\n  type = " + type +
                "\n  model = " + model;
        return output;
    }

}
