abstract class Vehicle {

    int maxSpeed;
    String model;

    Vehicle(int maxSpeed, String model) {

        this.maxSpeed = maxSpeed;
        this.model = model;
    }

    abstract double fuelCost(double km);
}