import java.util.HashSet;
import java.util.Set;

public class DuplicateSessionTokenDetector {

    public static boolean hasDuplicateToken(String[] tokens) {
        Set<String> seen = new HashSet<>();
        for (String token : tokens) {
            if (!seen.add(token)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        String[] tokens = {
                "ABC123",
                "XYZ456",
                "PQR789",
                "ABC123",
                "LMN111"
        };

        if (hasDuplicateToken(tokens)) {
            System.out.println("Duplicate Session Token Found");
        } else {

            System.out.println("No Duplicate Session Token Found");
        }
    }
}