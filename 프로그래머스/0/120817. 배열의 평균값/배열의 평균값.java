class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        
        int length = numbers.length;
        double sum = 0;
        
        for (int i = 0; i <= length -1; i++) {
            sum += numbers[i];
        }
        
        return sum / length;
    }
}