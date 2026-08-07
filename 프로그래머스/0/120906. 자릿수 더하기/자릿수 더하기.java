import java.util.Arrays;

class Solution {
    public int solution(int n) {
        int answer = 0;
        
        // 내 풀이1
        /*
        String[] num_arr = String.valueOf(n).split("");
        for (String num : num_arr) {
            answer += Integer.parseInt(num);
        }
        */
        
        
        // 내 풀이2
        /*
        answer = Arrays.stream(String.valueOf(n).split(""))
            .mapToInt(Integer::parseInt)
            .sum();
        */
        
        
        // 다른 풀이1
        /*
        answer = String.valueOf(n).chars()
            .map(c -> c - '0')
            .sum();
        */
        
        
        // 다른 풀이2
        while (n > 0) {
            answer += n % 10;
            n /= 10;
        }
        
        
        return answer;
    }
}