import java.util.stream.IntStream;

class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        
                // 내 풀이1
        answer = IntStream.rangeClosed(1, n)
                .filter(i -> i % 2 != 0)
                .toArray();

        
        // 내 풀이2
        /*
        int[] temp_arr = new int[n];
        int temp_index = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                temp_arr[temp_index] = i;
                temp_index++;
            }
        }

        answer = new int[temp_index];
        for (int i = 0; i < temp_index; i++) {
            answer[i] = temp_arr[i];
        }
        */
        
        
        return answer;
    }
}