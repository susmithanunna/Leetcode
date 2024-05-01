class Solution {
    public String reversePrefix(String word, char ch) {
        String ans="";
        int index=-1;
        for(int i=0;i<word.length();i++){
            if(ch==word.charAt(i)){
                index=i+1;
                System.out.println(index);
                 ans=word.charAt(i)+ans;
                break;
            }
            ans=word.charAt(i)+ans; 
        }
        if(index==-1 ){
            return word;
        }
        if(index<word.length() && index>=0){
            for(int i=index;i<word.length();i++){
                 ans=ans+word.charAt(i);
            }
        }
        
        return ans;
    }
}