import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        
        // 내 풀이
        /*
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
        */
        
        
        // 다른 풀이1
        /*
        char[] my_string_arr = my_string.toCharArray();

        my_string_arr[num1] = my_string.charAt(num2);
        my_string_arr[num2] = my_string.charAt(num1);

        answer = String.valueOf(my_string_arr);
        */
        
        
        // 다른 풀이2
        /*
        char num1_char = my_string.charAt(num1);
        char num2_char = my_string.charAt(num2);

        StringBuilder sb = new StringBuilder(my_string);
        sb.setCharAt(num1, num2_char);
        sb.setCharAt(num2, num1_char);

        answer = sb.toString();
        */
        
        
        // 다른 풀이3
        answer = IntStream.range(0, my_string.length())
                .mapToObj(i ->
                        String.valueOf(
                                (i == num1) ? my_string.charAt(num2)
                                        : (i == num2) ? my_string.charAt(num1)
                                        : my_string.charAt(i)
                        )
                )
                .collect(Collectors.joining());
        
        
        
        return answer;
    }
}