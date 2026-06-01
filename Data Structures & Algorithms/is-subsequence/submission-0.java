class Solution {
    public boolean isSubsequence(String s, String t) {
         String sub=s;
         String domain=t;
         boolean found=false;
         int match=0;
        if(sub.length()==0) return true;
        if(sub.length()>domain.length()) return false;
        for(int i=0;i<sub.length();i++){
            found=false;
            for(int j=match;j<domain.length();j++){
                char subs=sub.charAt(i);
                char dom=domain.charAt(j);
                if(subs==dom){
                    match=j+1;
                    found=true;
                    break;
                }
            }
            if(!found){
                return false;
            }
        }
       if(found){
        return true;
       }else{
        return false;
       }
       
    }
}