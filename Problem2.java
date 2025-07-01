
import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();            // read the single integer
        StringBuilder out = new StringBuilder();

        for (int i = 1; i <= a; i++) {
            int odd = 2 * i - 1;         // generate the i-th odd number
            out.append(odd);
            if (i < a) out.append(", "); // commas between numbers
        }

        System.out.println(out);
        sc.close();
    }
}
