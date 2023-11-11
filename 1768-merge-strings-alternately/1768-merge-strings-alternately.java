class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n1=word1.length();
        int n2=word2.length();
        String s="";
        int i=0;
        int j=0;
        while(i<n1 && j<n2){
            s=s+word1.charAt(i);
            s=s+word2.charAt(j);
            i++;
            j++;
        }
        if(i<n1){
            while(i<n1){
                s=s+word1.charAt(i);
                i++;
            }
        }
        if(j<n2){
            while(j<n2){
                s=s+word2.charAt(j);
                j++;
            }
        }
        return s;
    }
}