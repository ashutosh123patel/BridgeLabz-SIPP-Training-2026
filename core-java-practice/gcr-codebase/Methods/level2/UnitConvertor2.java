public class UnitConvertor2 {

    public static double yardsToFeet(double y) {
        return y * 3;
    }

    public static double feetToYards(double f) {
        return f * 0.333333;
    }

    public static double meterToInches(double m) {
        return m * 39.3701;
    }

    public static double inchesToMeter(double i) {
        return i * 0.0254;
    }

    public static double inchesToCm(double i) {
        return i * 2.54;
    }

    public static void main(String[] args) {

        System.out.println(yardsToFeet(10));
        System.out.println(feetToYards(10));
        System.out.println(meterToInches(10));
        System.out.println(inchesToMeter(10));
        System.out.println(inchesToCm(10));
    }
}