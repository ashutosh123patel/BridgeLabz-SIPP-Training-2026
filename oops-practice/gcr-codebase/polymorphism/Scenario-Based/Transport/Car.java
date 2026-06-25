class Car extends Vehicle {

    Car(int maxSpeed, String model) {

        super(maxSpeed, model);
    }

    double fuelCost(double km) {
        return km * 8;
    }
}