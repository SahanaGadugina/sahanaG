
import java.util.*;

public class Problem4 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30};
        Map<Integer, Integer> result = new LinkedHashMap<>();

        // Initialize dictionary keys from 1 to 9
        for (int i = 1; i <= 9; i++) {
            result.put(i, 0);
        }

        // Count how many numbers are divisible by each 1..9
        for (int num : numbers) {
            for (int i = 1; i <= 9; i++) {
                if (num % i == 0) {
                    result.put(i, result.get(i) + 1);
                }
            }
        }

        // Print the result
        System.out.println(result);
    }
}