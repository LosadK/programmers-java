import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int n, int[] numlist) {
        int[] answer = {};
        
        // 내 풀이
        /*
        int[] temp_arr = new int[numlist.length];
        int temp_index = 0;

        for (int i = 0; i < numlist.length; i++) {
            if (numlist[i] % n == 0) {
                temp_arr[temp_index] = numlist[i];
                temp_index++;
            }
        }

        answer = new int[temp_index];

        for (int i = 0; i < temp_index; i++) {
            answer[i] = temp_arr[i];
        }
        */
        
        
        // 다른 풀이1
        answer = Arrays.stream(numlist)
            .filter(num -> num % n == 0)
            .toArray();
        
        
        // 다른 풀이2
        /*
        answer = IntStream.range(0, numlist.length)
            .filter(i -> numlist[i] % n == 0)
            .map(i -> numlist[i])
            .toArray();
        */
        
        
        return answer;
    }
}