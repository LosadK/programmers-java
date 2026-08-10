import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        // 내 풀이
        // array = Arrays.stream(array).sorted().toArray();
        // answer = array[array.length / 2];
        

        // 다른 풀이
        
        for (int i = 0; i < array.length -1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
        
        answer = array[array.length / 2];
        
        
        
        return answer;
    }
}