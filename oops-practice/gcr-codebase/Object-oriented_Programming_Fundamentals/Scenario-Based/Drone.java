class Drone {

    int droneId;
    double batteryPercentage;

    static String companyName = "SkyExpress";

    Drone(int droneId, double batteryPercentage) {
        this.droneId = droneId;
        this.batteryPercentage = batteryPercentage;
    }

    void startDelivery() {
        System.out.println("Drone " + droneId + " started delivery");
    }

    void displayStatus() {
        System.out.println("Drone Id: " + droneId);
        System.out.println("Battery: " + batteryPercentage + "%");
        System.out.println("Company: " + companyName);
        System.out.println();
    }

    public static void main(String[] args) {

        Drone d1 = new Drone(101, 85);
        Drone d2 = new Drone(102, 70);

        d1.startDelivery();
        d2.startDelivery();

        d1.displayStatus();
        d2.displayStatus();
    }
}