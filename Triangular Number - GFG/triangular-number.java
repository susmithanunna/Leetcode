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
            int N=Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.isTriangular(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int isTriangular(int N){
        //code here
        int n=N*2-1;
        int sr=(int)Math.sqrt(n);
        int sum_n=(sr*(sr+1))/2;
        if(sum_n==N){
            return 1;
        }
        else{
            return 0;
        }
    }
}