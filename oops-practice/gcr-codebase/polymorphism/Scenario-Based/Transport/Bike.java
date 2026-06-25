class Bike extends Vehicle {

    Bike(int maxSpeed, String model) {
        super(maxSpeed, model);
    }
    double fuelCost(double km) {
        return km * 3;
    }
}