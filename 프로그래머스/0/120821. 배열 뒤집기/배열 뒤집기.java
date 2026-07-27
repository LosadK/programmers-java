class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {};
        
        int length = num_list.length;
        int lastIndex = length - 1;
        answer = new int[length];
        
        for (int i = 0; i < length; i ++) {
            answer[i] = num_list[lastIndex];
            lastIndex--;
        }
        
        return answer;
    }
}