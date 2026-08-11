class Solution {
    public int solution(int hp) {
        int answer = 0;
        
        // 내 풀이
        final int GENERAL = 5;
        final int SOLDIER = 3;
        final int WORKER = 1;

        int count_general = hp / GENERAL;
        int remain = hp % GENERAL;

        answer = count_general;

        for (int i = remain; i > 0; i--) {
            if (remain >= SOLDIER) {
                answer += (remain / SOLDIER);
                remain %= SOLDIER;
            } else if (remain >= WORKER) {
                answer += remain;
                remain %= WORKER;
            }

            if (remain == 0) {
                break;
            }
        }        
        
        
        return answer;
    }
}