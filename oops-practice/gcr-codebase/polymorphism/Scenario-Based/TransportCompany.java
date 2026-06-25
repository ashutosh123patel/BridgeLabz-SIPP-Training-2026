class Vehicle {
    String name;
    Vehicle(String name) {
        this.name = name;
    }
    public double fuelCost(double km) {
        return 0;
    }
}

class Car extends Vehicle {
    Car(String name) {
        super(name);
    }
    @Override
    public double fuelCost(double km) {
        return km * 8;      
    }
}
class Bus extends Vehicle {

    Bus(String name) {
        super(name);
    }

    @Override
    public double fuelCost(double km) {
        return km * 15;     
    }
}


class Bike extends Vehicle {

    Bike(String name) {
        super(name);
    }

    @Override
    public double fuelCost(double km) {
        return km * 3;      
    }
}


class ElectricCar extends Vehicle {

    ElectricCar(String name) {
        super(name);
    }
    @Override
    public double fuelCost(double km) {
        return km * 2;      
    }
}
public class TransportCompany {

    public static void main(String[] args) {

        Vehicle[] fleet = {
                new Car("Honda City"),
                new Bus("Volvo Bus"),
                new Bike("Royal Enfield"),
                new ElectricCar("Tata Nexon EV")
        };
        double km = 100;
        for (Vehicle v : fleet) {
            System.out.println("Vehicle : " + v.name);
            System.out.println("Fuel Cost : ₹" + v.fuelCost(km));
            if (v instanceof Car) {
                Car c = (Car) v;
                System.out.println("Type : Car");
            }
            else if (v instanceof Bus) {
                Bus b = (Bus) v;
                System.out.println("Type : Bus");
            }
            else if (v instanceof Bike) {
                Bike b = (Bike) v;
                System.out.println("Type : Bike");
            }
            else if (v instanceof ElectricCar) {
                ElectricCar e = (ElectricCar) v;
                System.out.println("Type : Electric Car");
            }

            System.out.println(" ");
        }
    }
}