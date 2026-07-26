class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {};
        
        int evenCnt = 0;
        int oddCnt = 0;

        for (int num : num_list) {
            if (num % 2 == 0) {
                evenCnt += 1;
            } else {
                oddCnt += 1;
            }
        }
        
        answer = new int[]{evenCnt, oddCnt};
        
        return answer;
    }
}