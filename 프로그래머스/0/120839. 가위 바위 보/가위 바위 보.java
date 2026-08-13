class Solution {
    public String solution(String rsp) {
        String answer = "";
        
        final String SCISSORS = "2";
        final String ROCK = "0";
        final String PAPER = "5";

        StringBuilder sb = new StringBuilder();

        
        // 내 풀이
        /*
        for (String s : rsp.split("")) {
            switch (s) {
                case SCISSORS:
                    sb.append(ROCK);
                    break;
                case ROCK:
                    sb.append(PAPER);
                    break;
                case PAPER:
                    sb.append(SCISSORS);
                    break;
                default:
                    sb.append("");
            }
        }
        */
        
        
        // Java 14 이상일 경우
        for (char c : rsp.toCharArray()) {
            sb.append(switch (c) {
                case '2' -> ROCK;
                case '0' -> PAPER;
                case '5' -> SCISSORS;
                default -> c;
            });
        }

        answer = sb.toString();
        
        
        return answer;
    }
}