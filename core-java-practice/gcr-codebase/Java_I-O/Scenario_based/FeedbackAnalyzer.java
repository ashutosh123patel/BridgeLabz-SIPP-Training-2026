import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FeedbackAnalyzer {

    public static void main(String[] args) throws Exception {

        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        int c = 0;

        for (int i = 1; i <= 5; i++) {

            String s = br.readLine().toLowerCase();

            if (s.contains("good")) {
                c++;
            }
        }

        System.out.println("Good Feedback Count = " + c);
    }
}