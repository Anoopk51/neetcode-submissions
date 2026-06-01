class Solution {
    public boolean isSubsequence(String s, String t) {
         boolean found=false;
         int match=0;
        if(s.length()==0) return true;
        if(s.length()>t.length()) return false;
        for(int i=0;i<s.length();i++){
            found=false;
            for(int j=match;j<t.length();j++){
                char sub=s.charAt(i);
                char domain=t.charAt(j);
                if(sub==domain){
                    match=j+1;
                    found=true;
                    break;
                }
            }
            if(!found){
                return false;
            }
        }
        // return found;
        if(found){
            return true;
        }else{
            return false;
        }
       
    }
}