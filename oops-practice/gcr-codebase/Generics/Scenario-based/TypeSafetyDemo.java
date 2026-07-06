import java.util.ArrayList;

public class TypeSafetyDemo {

    public static void main(String[] args) {

        ArrayList<String> languages = new ArrayList<>();

        languages.add("Java");
        languages.add("Python");
        languages.add("C++");

        for (String language : languages) {
            System.out.println(language);
        }
    }
}