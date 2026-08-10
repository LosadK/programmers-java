class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        
        // 내 풀이1
        for (int num : array) {
            if (num == n) answer ++;
        }        
        
        
        // 내 풀이2
        /*
        answer = (int) Arrays.stream(array)
                .filter(num -> num == n)
                .count();
        */        
        
        return answer;
    }
}