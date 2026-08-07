class Solution {
    public int[] solution(int[] array) {
        int[] answer = {};
        
        // 내 풀이
        int max = 0;
        int max_index=  0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                max_index = i;
            }
        }

        answer = new int[]{max, max_index};
        
        return answer;
    }
}