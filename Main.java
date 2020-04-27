import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String... args) {

        List<String> strings = Arrays.asList("one", "two", null, "four");

        int size = strings.size();
        System.out.println("size = " + size);

        int length = strings.get(2).length();
        System.out.println("length = " + length);
    }

}