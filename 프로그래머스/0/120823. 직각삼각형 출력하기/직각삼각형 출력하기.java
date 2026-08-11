import java.util.Scanner;
import java.util.stream.IntStream;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        // 내 풀이
        /*
        final String ASTER = "*";
        
        int count = 0;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            count++;

            for (int j = 0; j < count; j++) {
                sb.append(ASTER);
            }

            sb.append("\n");
        }
        
        System.out.println(sb);
        */
        
        
        // 다른 풀이1
        for (int i = 1; i <= n; i++) {
            System.out.println("*".repeat(i));
        }
        
        
        // 다른 풀이2
        /*
        IntStream.rangeClosed(1, n).forEach(i -> System.out.println("*".repeat(i)));
        */
        
    }
}