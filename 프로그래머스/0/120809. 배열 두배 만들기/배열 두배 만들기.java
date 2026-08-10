import java.util.Arrays;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        
        // 내 풀이1
        answer = Arrays.stream(numbers)
                .map(num -> num * 2)
                .toArray();


        // 내 풀이2
        /*
        answer = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            answer[i] = numbers[i] * 2;
        }
        */
        
        
        return answer;
    }
}