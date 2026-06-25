class ElectricCar extends Vehicle {

    ElectricCar(int maxSpeed, String model) {
        super(maxSpeed, model);
    }
    double fuelCost(double km) {
        return km * 2;
    }
}