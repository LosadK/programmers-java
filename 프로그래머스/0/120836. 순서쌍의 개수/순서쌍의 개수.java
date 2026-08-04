import java.util.stream.IntStream;

class Solution {
    public int solution(int n) {
        int answer = 0;
        
        /*
            a * b = n, 즉 a를 알면 b가 정해짐
            n의 약수 문제
        */
        
        // 내 풀이
        for (int a = 1; a <= n; a++) {
            if (n % a == 0) {
                answer++;
            }
        }
        
        
        // 다른 풀이
        /*
        answer = (int) IntStream.rangeClosed(1, n).filter(a -> n % a == 0).count();
        */
        
        return answer;
    }
}