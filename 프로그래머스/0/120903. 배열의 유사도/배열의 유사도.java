import java.util.*;

class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        
        // 내 풀이
        /*
        for (String a : s1) {
            for (String b : s2) {
                if (a.equals(b)) {
                    answer++;
                }
            }
        }
        */
        
        
        // 다른 풀이
        Set<String> set = new HashSet<>(Arrays.asList(s1));
        
        // for (String s : s2) {
        //     if (set.contains(s)) {
        //         answer++;
        //     }
        // }
        
        answer = (int) Arrays.stream(s2)
            .filter(set::contains)
            .count();
        
        
        return answer;
    }
}