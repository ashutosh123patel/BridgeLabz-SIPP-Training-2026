public class MovieSeatReservation {

    public static int getSeat(int idx) {

        int[] seats = {101, 102, 103, 104, 105};

        try {
            return seats[idx];

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid Seat Position");

            return -1;
        }
    }

    public static void main(String[] args) {
        System.out.println(getSeat(2));
        System.out.println(getSeat(8));
    }
}