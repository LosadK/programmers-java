import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        // 내 풀이
        // Arrays.sort(0)는 O(n log n) 소모
        /*
        int lastIndex = numbers.length - 1;
        
        Arrays.sort(numbers);
        
        answer = numbers[lastIndex] * numbers[lastIndex - 1];
        */

        
        // 다른 풀이 O(n)
        int max1 = 0;
        int max2 = 0;
        
        for (int num : numbers) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max2 = num;
            }
        }
        
        answer = max1 * max2;
        
        
        return answer;
    }
}