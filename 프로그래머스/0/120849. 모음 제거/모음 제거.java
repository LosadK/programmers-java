class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        final String[] VOWELS = {"a", "e", "i", "o", "u"};
        
        // 내 풀이
        for (String v : VOWELS) {
            my_string = my_string.replace(v, "");
        }
        
        
        // 다른 풀이1
        /*
        my_string = my_string.replaceAll("[aeiou]", "");
        */
        
        
        // 다른 풀이2
        /*
        for (String v : VOWELS) {
            if (my_string.contains(v)) {
                my_string = my_string.replace(v, "");
            }
        }
        */
        
        answer = my_string;
        
        
        return answer;
    }
}