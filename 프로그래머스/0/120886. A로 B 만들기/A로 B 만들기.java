import java.util.*;

class Solution {
    public int solution(String before, String after) {
        int answer = 0;

        char[] before_arr = before.toCharArray();
        char[] after_arr = after.toCharArray();
        
        Arrays.sort(before_arr);
        Arrays.sort(after_arr);
        
        answer = Arrays.equals(before_arr, after_arr) ? 1 : 0;
        
        
        return answer;
    }
}