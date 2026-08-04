import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int lastIndex = numbers.length - 1;
        
        Arrays.sort(numbers);
        
        answer = numbers[lastIndex] * numbers[lastIndex - 1];
        
        return answer;
    }
}