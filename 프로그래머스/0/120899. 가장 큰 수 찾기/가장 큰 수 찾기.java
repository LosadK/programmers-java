import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] array) {
        int[] answer = {};
        
        int max = 0;
        int max_index = array[0];
        
        // 내 풀이
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                max_index = i;
            }
        }
        
        answer = new int[]{max, max_index};
        
        
        // 다른 풀이
        /*
        max_index = IntStream.range(0, array.length)
            .reduce((i, j) -> array[i] > array[j] ? i : j)
            .getAsInt();
        

        answer = new int[]{array[max_index], max_index};
        */
        
        
        return answer;
    }
}