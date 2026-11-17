import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                list.add(i);

                while (n % i == 0) {
                    n /= i;
                }
            }
        }

        answer = list.stream().mapToInt(Integer::intValue).toArray();
        
        
        return answer;
    }
}