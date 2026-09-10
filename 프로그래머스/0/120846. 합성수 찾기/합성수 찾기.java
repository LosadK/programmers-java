class Solution {
    public int solution(int n) {
        int answer = 0;
        
        // 합성수는 1과 자기 자신을 제외한 약수가 있어야 함
        // 1은 합성수에 기본 포함되므로 2부터 판별 시작

        // 풀이1
        /*
        for (int i = 2; i <= n; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    answer++;
                    break;
                }
            }
        }
        */
        
        // 풀이2
        for (int i = 2; i <= n; i++) {
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    answer++;
                    break;
                }
            }
        }
        
        
        return answer;
    }
}