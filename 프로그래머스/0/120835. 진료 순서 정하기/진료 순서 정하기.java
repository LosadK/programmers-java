import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        
        // 내 풀이1
        int[] emergency_sort = emergency.clone();
        Arrays.sort(emergency_sort);

        Map<Integer, Integer> map = new HashMap();

        for (int i = 0; i < emergency_sort.length; i++) {
            map.put(emergency_sort[i], emergency_sort.length - i);
        }

        for (int i = 0; i < emergency.length; i++) {
            answer[i] = map.get(emergency[i]);
        }
        
        
        // 다른 풀이
        /*
        for (int i = 0; i < emergency.length; i++) {
            int rank = 1;
    
            for (int j = 0; j < emergency.length; j++) {
                if (emergency[i] < emergency[j]) {
                    rank++;
                }
            }
    
            answer[i] = rank;
        }
        */
        
        
        return answer;
    }
}