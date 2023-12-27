//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-- > 0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int[] a = new int[n];
            String[] inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }
            
            Compute obj = new Compute();
            System.out.println(obj.findElement(a, n));
            
        }
	}
}
// } Driver Code Ends


//User function Template for Java

class Compute {
    public int findElement(int arr[], int n){
       int max=arr[0];
		int flag1=0;
		for(int i=1;i<n-1;i++){
		    if(arr[i]>=max){
		        max=arr[i];
		        for(int j=i+1;j<n;j++){
		            if(arr[j]<max){
		                flag1=1;
		                break;
		            }
		        }
		        if(flag1==0){
		            return arr[i];
		        }
		    }
		    flag1=0;
		}
	    return -1;
    }
}