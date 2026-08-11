import java.util.Arrays;

class Solution {
    public int solution(int[] box, int n) {
        int answer = 0;
        
        // 내 풀이1
        int max = 1;

        for (int len : box) {
            max *= (len / n);
        }

        answer = max;
        
        
        // 다른 풀이
        /*
        answer = Arrays.stream(box)
            .map(len -> len / n)
            .reduce(1, (result, value) -> result * value);
        */
        
        
        return answer;
    }
}