import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        // 내 풀이
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
    }
}