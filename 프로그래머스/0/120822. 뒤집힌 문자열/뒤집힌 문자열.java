class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        // 내 풀이
        /*
        String[] normal = my_string.split("");
        int length = normal.length;
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 1; i <= length; i++) {
            sb.append(normal[length - i]);
        }
        
        answer = sb.toString();
        */
        
        // 다른 풀이1
        StringBuilder sb = new StringBuilder();
        sb.append(my_string);
        sb.reverse();
        
        answer = sb.toString();
            
        return answer;
    }
}