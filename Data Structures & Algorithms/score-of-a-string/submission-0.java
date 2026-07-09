class Solution {
    public int scoreOfString(String s) {
        int score = 0;
        for( int i = 1 ; i < s.length() ; i++){
            char firstCh = (char)s.charAt(i - 1);
            char secondCh = (char)s.charAt(i);
            score += Math.abs((int) firstCh - (int) secondCh);
            
        }
        return score;
    }
}