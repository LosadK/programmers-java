import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        // 내 풀이1
        /*
        int prev = 0;

        for (int i = 0; i <= numbers.length -1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                prev = numbers[i];

                if (numbers[i] < numbers[j]) {
                    numbers[i] = numbers[j];
                    numbers[j] = prev;
                }
            }
        }
        */
        
        
        // 내 풀이2
        numbers = Arrays.stream(numbers).sorted().toArray();
        

        answer = Math.max(
                numbers[0] * numbers[1],
                numbers[numbers.length - 1] * numbers[numbers.length - 2]
        );
        
        
        return answer;
    }
}