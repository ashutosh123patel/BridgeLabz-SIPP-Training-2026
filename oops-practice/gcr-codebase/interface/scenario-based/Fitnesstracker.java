
interface Trackable {
    void logActivity();

    default void resetData() {
        System.out.println("Fitness data has been reset.");
    }
}
interface Reportable {
    void generateReport();
}

interface Notifiable {
    void sendAlert();
}

class FitnessDevice implements Trackable, Reportable, Notifiable {

    @Override
    public void logActivity() {
    System.out.println("Activity Logged: 5000 steps,  I walked 3 km walked.");
    }

    @Override
    public void generateReport() {
    System.out.println("Report: Your calories Burned = 250, Active Time = 45 minutes.");
    }

    @Override
    public void sendAlert() {
    System.out.println("Alert:Its  time to drink water!");
    }
}


public class Fitnesstracker {
    public static void main(String[] args) {
        FitnessDevice fd = new FitnessDevice();
        fd.sendAlert();
        fd.logActivity();
        fd.generateReport();


    }
}