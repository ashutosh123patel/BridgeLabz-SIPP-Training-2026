public class Main {

    public static void main(String[] args) {

        Vehicle[] v = {
                new Car(120, "Sedan"),
                new Bus(80, "Volvo"),
                new Bike(100, "Yamaha"),
                new ElectricCar(150, "Tesla")
        };
        double km = 20;
        for (Vehicle x : v) {

            if (x instanceof Car) {

                Car c = (Car) x;
                System.out.println("Car Fuel Cost = " + c.fuelCost(km));

            }

            else if (x instanceof Bus) {

                Bus b = (Bus) x;
                System.out.println("Bus Fuel Cost = " + b.fuelCost(km));

            }

            else if (x instanceof Bike) {

                Bike b = (Bike) x;
                System.out.println("Bike Fuel Cost = " + b.fuelCost(km));

            }
            else if (x instanceof ElectricCar) {

                ElectricCar e = (ElectricCar) x;
                System.out.println("Electric Car Fuel Cost = " + e.fuelCost(km));

            }

        }

    }
}