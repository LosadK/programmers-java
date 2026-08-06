import java.util.Arrays;

class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = {};
        
        // 내 풀이
        int strlist_length = strlist.length;
        answer = new int[strlist_length];

        for (int i = 0; i < strlist_length; i++) {
            answer[i] = strlist[i].length();
        }
        
        
        // 다른 풀이
        /*
        answer = Arrays.stream(strlist)
            .mapToInt(String::length)
            .toArray();
        */
        
        
        return answer;
    }
}