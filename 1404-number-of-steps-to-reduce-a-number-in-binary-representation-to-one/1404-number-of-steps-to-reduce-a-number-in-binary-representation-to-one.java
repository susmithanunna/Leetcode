class Solution {
    public int numSteps(String s) {
       int n=s.length()-1;
        int c=0;
        int carry=0;
        while(n>0){
            if((s.charAt(n)-'0')+carry==0){
                c++;
                carry=0;
            }
            else if((s.charAt(n)-'0')+carry==1){
                carry=1;
                c=c+2;
            }
            else{
                carry=1;
                c=c+1;
            }
            n--;
            
        }
        if(carry==1){
            c++;
        }
        return c;
        
    }
}