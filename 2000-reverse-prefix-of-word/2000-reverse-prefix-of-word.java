class Solution {
    public String reversePrefix(String word, char ch) {
        String ans="";
        int index=word.indexOf(ch);
        if(index==-1){
            return word;
        }
        return new StringBuilder(word.substring(0,index+1)).reverse().toString()+word.substring(index+1,word.length());
    }
}