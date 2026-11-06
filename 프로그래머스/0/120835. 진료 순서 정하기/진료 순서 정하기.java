import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        
        int[] emergency_sort = emergency.clone();
        Arrays.sort(emergency_sort);

        Map map = new HashMap();

        int start = 1;
        for (int i = emergency_sort.length - 1; i >= 0; i--) {
            map.put(emergency_sort[i], start);
            start++;
        }

        for (int i = 0; i < emergency.length; i++) {
            answer[i] = Integer.parseInt(String.valueOf(map.get(emergency[i])));
        }        
        
        
        return answer;
    }
}