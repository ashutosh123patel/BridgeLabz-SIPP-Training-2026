interface Refuelable {

    void refuel();
}

class Vehicle {
    int maxSpeed;
    String model;

    Vehicle(int maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }
}

class ElectricVehicle extends Vehicle {

    ElectricVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }

    void charge() {
        System.out.println("Charging...");
    }
}

class PetrolVehicle extends Vehicle
        implements Refuelable {
    PetrolVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }

    public void refuel() {
        System.out.println("Refueling...");
    }
}

public class VehicleManagement {

    public static void main(String[] args) {
        ElectricVehicle e =new ElectricVehicle(180, "Tesla");
        PetrolVehicle p =new PetrolVehicle(220, "BMW");
        e.charge();
        p.refuel();
    }
}