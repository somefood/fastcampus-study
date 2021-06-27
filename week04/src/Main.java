import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class Main {
    public static TreeSet<Integer> variable  = new TreeSet<>();
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 4, 5, 7 ,8, 9, 2, 3, 6, 7, 10);

        for(Integer num: numbers) {
            deduplication(num);
        }

        // numbers 오름차순 정렬
        System.out.println(variable);;
    }

    private static void deduplication(Integer number) {
        variable.add(number);
    }
}
