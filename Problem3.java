

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        // decide how many numbers to print
        int terms = (a % 2 == 0) ? a - 1 : a;

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < terms; i++) {
            sb.append(2 * i + 1);        // 2*i + 1 gives the i-th odd number
            if (i < terms - 1) sb.append(", ");
        }
        System.out.println(sb);

        sc.close();
    }
}
