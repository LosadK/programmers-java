import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        // 내 풀이
        int SEVEN = 7;

        StringBuilder sb = new StringBuilder();
        for (int n : array) {
            sb.append(n);
        }

        answer = (int) Arrays.stream(sb.toString().split(""))
                .filter(s -> s.equals(String.valueOf(SEVEN)))
                .count();
        
        
        return answer;
    }
}