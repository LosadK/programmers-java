import java.util.stream.IntStream;

class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        
        // 내 풀이
        /*
        String[] num_arr = String.valueOf(num).split("");

        answer = -1;

        for (int i = 0; i < num_arr.length; i++) {
            if (k == Integer.parseInt(num_arr[i])) {
                answer = i + 1;
                break;
            }
        }
        */
        
        
        // 다른 풀이1
        /*
        String[] num_arr = String.valueOf(num).split("");

        answer = IntStream.range(0, num_arr.length)
                .filter(i -> k == Integer.parseInt(num_arr[i]))
                .map(i -> i + 1)
                .findFirst()
                .orElse(-1);
        */
        
        
        // 다른 풀이2
        /*
        String num_str = String.valueOf(num);

        answer = IntStream.range(0, num_str.length())
                .filter(i -> num_str.charAt(i) - '0' == k)
                .map(i -> i + 1)
                .findFirst()
                .orElse(-1);
        */
        
        
        // 다른 풀이3
        int index = String.valueOf(num).indexOf(String.valueOf(k));
        answer = index == -1 ? -1 : index + 1;
        
        
        return answer;
    }
}