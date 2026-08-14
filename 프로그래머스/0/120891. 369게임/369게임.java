import java.util.Arrays;

class Solution {
    public int solution(int order) {
        int answer = 0;
        
        // 내 풀이
        answer = (int) Arrays.stream(String.valueOf(order).split(""))
                .mapToInt(Integer::parseInt)
                .filter(n -> n != 0 && (n % 3 == 0))
                .count();
        
        
        return answer;
    }
}