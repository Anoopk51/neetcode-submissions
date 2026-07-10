class Solution {
    public int countSeniors(String[] details) {
        int count = 0;
        for (int i = 0 ;i<details.length ;i++){
            String str = ""+details[i].charAt(11) + details[i].charAt(12);
            if ( Integer.parseInt(str) > 60){
                count++;
            }
        }
        return count;
    }
}