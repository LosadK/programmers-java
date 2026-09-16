import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        // 내 풀이1
        Set<String> duplicated = new HashSet<>();
        StringBuilder sb = new StringBuilder();

        for (String s : my_string.split("")) {
            if (duplicated.add(s)) {    // 최초 추가면 true, 이미 존재하면 false 반환 
                sb.append(s);
            }
        }

        answer = sb.toString();
        
        
        return answer;
    }
}