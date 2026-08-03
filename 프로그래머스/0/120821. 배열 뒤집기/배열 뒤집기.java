import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {};
        
        int length = num_list.length;
        answer = new int[length];
        
        // 내 풀이
        /*
        
        int lastIndex = length - 1;
        
        for (int i = 0; i < length; i ++) {
            answer[i] = num_list[lastIndex];
            lastIndex--;
        }
        */
        
        
        // 다른 풀이1
        List<Integer> list = Arrays.stream(num_list)
            .boxed()
            .collect(Collectors.toList());
        
        Collections.reverse(list);
        answer = list.stream().mapToInt(Integer::intValue).toArray();
        
        
        // 다른 풀이2
        /*
        answer = LongStream.range(1, length + 1)
            .mapToInt(i -> num_list[(int) (length - i)])
            .toArray();
        */
        
        
        return answer;
    }
}