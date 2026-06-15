public class UnitConvertor3 {

    public static double fToC(double f) {
        return (f - 32) * 5 / 9;
    }

    public static double cToF(double c) {
        return (c * 9 / 5) + 32;
    }

    public static double poundsToKg(double p) {
        return p * 0.453592;
    }

    public static double kgToPounds(double k) {
        return k * 2.20462;
    }

    public static double gallonsToLiters(double g) {
        return g * 3.78541;
    }

    public static double litersToGallons(double l) {
        return l * 0.264172;
    }

    public static void main(String[] args) {

        System.out.println(fToC(100));
        System.out.println(cToF(100));
        System.out.println(poundsToKg(10));
        System.out.println(kgToPounds(10));
        System.out.println(gallonsToLiters(10));
        System.out.println(litersToGallons(10));
    }
}