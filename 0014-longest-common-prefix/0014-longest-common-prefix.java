class Solution {
    public String longestCommonPrefix(String[] strs) {
        String ans=strs[0];
       for(int i=1;i<strs.length;i++){
           if(ans.length()>strs[i].length()){
               ans=ans.substring(0,strs[i].length());
           }
           else if(ans.length()<strs[i].length()){
               strs[i]=strs[i].substring(0,ans.length());
           }
           for(int j=0;j<strs[i].length();j++){
               if(ans.charAt(j)!=strs[i].charAt(j)){
                   ans=ans.substring(0,j);
                   break;
               }
           }
           if(ans.length()==0){
               return "";
           }
       }
        return ans;
    }
}