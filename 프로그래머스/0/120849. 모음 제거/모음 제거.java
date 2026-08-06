class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        // 내 풀이
        final String[] VOWELS = {"a", "e", "i", "o", "u"};
        
        for (String v : VOWELS) {
            my_string = my_string.replace(v, "");
        }
        
        answer = my_string;
        
        return answer;
    }
}