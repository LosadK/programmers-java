import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2 - num1 + 1];
        
        // 내 풀이
        for (int i = 0; i < numbers.length; i++) {
            if (i >= num1 && i <= num2) {
                answer[i - num1] = numbers[i];
            }
        }
        
        
        // 다른 풀이1
        /*
        answer = Arrays.copyOfRange(numbers, num1, num2 + 1);
        */
        
        
        // 다른 풀이2
        /*
        answer = IntStream.rangeClosed(num1, num2).map(i -> numbers[i]).toArray();
        */
        
        
        return answer;
    }
}