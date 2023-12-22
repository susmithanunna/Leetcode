//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            long n = Long.parseLong(br.readLine().trim());
            long a[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            
            Solution ob = new Solution();
            System.out.println(ob.MaxNumber(a, n));
            
        }
	}
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    
    public String MaxNumber(long arr[], long n)
    {
        //code here.
         Arrays.sort(arr);
       StringBuilder sb = new StringBuilder();
       for(int i = 0;i<n;i++){
           sb.append(arr[i]);
       }
       return sb.reverse().toString();
    }
}