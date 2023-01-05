import java.util.Arrays;

public class enhanced_for_loop {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 6};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        for(int i : numbers) {
            System.out.println(i);
        }
        Arrays.stream(numbers).forEach(System.out::println);
    }
}
