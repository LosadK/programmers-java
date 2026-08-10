import java.util.Arrays;

class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        
        // 내 풀이1
        answer = (int) Arrays.stream(array)
                .filter(h -> h > height)
                .count();

        
        // 내 풀이2
        /*
        answer = (int) IntStream.range(0, array.length)
                .filter(i -> array[i] > height)
                .count();
         */

        
        // 내 풀이3
        /*
        for (int i = 0; i < array.length; i++) {
            if (array[i] > height) {
                answer++;
            }
        }
        */        
        
        
        return answer;
    }
}