class Solution {
    public String longestDiverseString(int a, int b, int c) {
        int n=a+b+c;
        String s="";
        int currA=0;
        int currB=0;
        int currC=0;
        for(int i=0;i<n;i++){
            if((a>=b && a>=c && currA!=2) || (a>0 &&(currB==2 || currC==2))){
                s=s+'a';
                //System.out.println(s);
                currA++;
                a--;
                currB=0;
                currC=0;
            }
           else if((b>=a && b>=c && currB!=2)|| (b>0 &&(currA==2 || currC==2))){
                s=s+'b';
                currB++;
               //System.out.println(s);
                 b--;
                currA=0;
                currC=0;
            }
           else if((c>=a && c>=b && currC!=2)|| (c>0 &&(currB==2 || currA==2))){
                s=s+'c';
                currC++;
               //System.out.println(s);
                 c--;
                currB=0;
                currA=0;
            }
        }
               return  s;
        
    }
}