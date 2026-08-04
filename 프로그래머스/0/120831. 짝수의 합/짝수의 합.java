import java.util.stream.IntStream;

class Solution {
    public int solution(int n) {
        int answer = 0;
        
        // 내 풀이
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                answer += i;
            }
        }
        
        // 다른 풀이
        /*
        answer = IntStream.rangeClosed(0, n)
            .filter(e -> e % 2 == 0)
            .sum();
        */
        
        return answer;
    }
}