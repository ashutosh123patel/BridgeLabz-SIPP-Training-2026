public class UnitConvertor1 {

    public static double kmToMiles(double km) {
        return km * 0.621371;
    }

    public static double milesToKm(double m) {
        return m * 1.60934;
    }

    public static double meterToFeet(double m) {
        return m * 3.28084;
    }

    public static double feetToMeter(double f) {
        return f * 0.3048;
    }

    public static void main(String[] args) {

        System.out.println(kmToMiles(10));
        System.out.println(milesToKm(10));
        System.out.println(meterToFeet(10));
        System.out.println(feetToMeter(10));
    }
}