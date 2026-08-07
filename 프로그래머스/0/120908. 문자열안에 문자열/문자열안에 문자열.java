class Solution {
    public int solution(String str1, String str2) {
        int answer = 2;

        // 내 풀이
        answer = str1.contains(str2) ? 1 : 2;
        
        
        // 다른 풀이
        /*
        for (int i = 0; i < str1.length() - str2.length(); i++) {
            boolean isMatch = true;
            
            for (int j = 0; j < str2.length(); j++) {
                if (str1.charAt(i + j) != str2.charAt(j)) {
                    isMatch = false;
                    break;
                }
            }
            
            if (isMatch) {
                answer = 1;
                return answer;
            }
                
        }
        */
        
        
        return answer;
    }
}