import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        // 내 풀이1
        array = Arrays.stream(array).sorted().toArray();
        answer = array[array.length / 2];        
        
        return answer;
    }
}