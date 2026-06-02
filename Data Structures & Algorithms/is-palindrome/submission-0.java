class Solution {
    public boolean isPalindrome(String s) {
       int start=0;
       int end=s.length()-1;
        char[] ch=s.toCharArray();
       while(start<end){
        if(!Character.isLetterOrDigit(ch[start])){
            start++;
            continue;
        }
        if(!Character.isLetterOrDigit(ch[end])){
            end--;
            continue;
        }
        if (Character.toLowerCase(ch[start])!=Character.toLowerCase(ch[end])){
            return false;
        }
        start++;
        end--;
        }
        return true;
    }
}
