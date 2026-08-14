import java.util.Arrays;

class Solution {
    public int solution(int order) {
        int answer = 0;
        
        // 내 풀이
        /*
        answer = (int) Arrays.stream(String.valueOf(order).split(""))
                .mapToInt(Integer::parseInt)
                .filter(n -> n != 0 && (n % 3 == 0))
                .count();
        */
        
        
        //다른 풀이1
        answer = (int) String.valueOf(order).chars()
                .filter(c -> c == '3' || c == '6' || c == '9')
                .count();
        
        
        // 다른 풀이2
        /*
        while (order > 0) {
            int remain = order % 10;

            if (remain > 0 && remain % 3 == 0) {
                answer++;
            }

            order /= 10;
        }
        */
        
        
        return answer;
    }
}