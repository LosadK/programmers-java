class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = {};
        
        // 내 풀이
        switch (direction) {
            case "left":
                for (int i = 0; i < numbers.length; i++) {
                    if (i == numbers.length - 1) {
                        break;
                    }

                    int prev_value = numbers[i];
                    int next_value = numbers[i + 1];
                    numbers[i + 1] = prev_value;
                    numbers[i] = next_value;
                }
                break;
            case "right":
                for (int i = numbers.length - 1; i >= 0; i--) {
                    if (i == 0) {
                        break;
                    }

                    int prev_value = numbers[i];
                    int next_value = numbers[i - 1];

                    numbers[i] = next_value;
                    numbers[i - 1] = prev_value;
                }
                break;
        }


        answer = numbers;        
        
        return answer;
    }
}