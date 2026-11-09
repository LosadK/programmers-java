import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        // 내 풀이
        /*
        int SEVEN = 7;

        StringBuilder sb = new StringBuilder();
        for (int n : array) {
            sb.append(n);
        }

        answer = (int) Arrays.stream(sb.toString().split(""))
                .filter(s -> s.equals(String.valueOf(SEVEN)))
                .count();
        */
        
        
        // 다른 풀이
        for (int num : array) {
            String num_str = String.valueOf(num);

            for (char c : num_str.toCharArray()) {
                if (c == '7') {
                    answer++;
                }
            }
        }
        
        
        return answer;
    }
}