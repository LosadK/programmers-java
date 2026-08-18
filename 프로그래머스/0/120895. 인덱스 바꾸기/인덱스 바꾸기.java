class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        
        // 내 풀이
        char num1_char = my_string.charAt(num1);
        char num2_char = my_string.charAt(num2);

        String[] my_string_arr = my_string.split("");

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < my_string.length(); i++) {
            if (i == num1) {
                my_string_arr[i] = String.valueOf(num2_char);
            }  else if (i == num2) {
                my_string_arr[i] = String.valueOf(num1_char);
            }

            sb.append(my_string_arr[i]);
        }
        
        answer = sb.toString();
        
        
        return answer;
    }
}