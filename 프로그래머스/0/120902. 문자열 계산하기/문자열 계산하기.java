class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        String[] my_string_arr = my_string.split(" ");

        answer = Integer.parseInt(my_string_arr[0]);

        for (int i = 1; i < my_string_arr.length; i+=2) {
            int num = Integer.parseInt(my_string_arr[i + 1]);

            if (my_string_arr[i].equals("+")) {
                answer += num;
            } else {
                answer -= num;
            }
        }
        
        
        return answer;
    }
}