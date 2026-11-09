import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        // 내 풀이
        /*
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(my_string);

        while (matcher.find()) {
            int num = Integer.parseInt(matcher.group());
            answer += num;
        }
        */
        
        
        // 다른 풀이
        String[] my_string_arr = my_string.split("[a-zA-Z]");
        for (String s : my_string_arr) {
            if (s != null && !s.isEmpty()) {
                answer += Integer.parseInt(s);
            }
        }
        
        
        return answer;
    }
}