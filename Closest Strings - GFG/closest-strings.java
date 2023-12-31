//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            ArrayList<String> arr = new ArrayList<String>();
            String input[] = read.readLine().split(" ");
            
            for(int i = 0; i < n; i++){
                arr.add(input[i]);
            }
            String word1 = read.readLine();
            String word2 = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.shortestDistance(arr,word1,word2));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int shortestDistance(ArrayList<String> s, String word1, String word2) {
        int index=-1;
        int min=Integer.MAX_VALUE;
        int s_index=-1;
        int f_index=-1;
        for(int i=0;i<s.size();i++){
            if(s.get(i).equals(word1)){
                f_index=i;
            }
            if(s.get(i).equals(word2)){
                s_index=i;
            }
            if(f_index!=-1 && s_index!=-1){
                if(min>((int)Math.abs(s_index-f_index))){
                    min=(int)Math.abs(s_index-f_index);
            }
            }
            
        }
        
        return min;
    }
};