//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String N = read.readLine();
            
            Solution ob = new Solution();
            if(ob.check_duck(N))
            System.out.println("YES");
            else
            System.out.println("NO");

            
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    static boolean check_duck(String N){
        // code here
        if(N.charAt(0)=='0' ){
            return false;
        }
        for(int i=N.length()-1;i>=0;i--){
            if(N.charAt(i)=='0'){
                return true;
            }
        }
        return false;
    }
}