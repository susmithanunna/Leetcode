//{ Driver Code Starts
//Initial Template for Java

import java.util.*;

public class GFG
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while (t-- > 0)
        {
            int n = sc.nextInt();
            int A[] = new int[n];
            
            for (int i = 0;i < n;i++)
            {
                A[i] = sc.nextInt();
            }
            
            Solution sol = new Solution();
            System.out.println(sol.findMin(A, n));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    int findMin(int arr[], int n)
    {
        //complete the function here
        int s=0;
        int e=n-1;
        if(arr[s]<=arr[e]){
            return arr[s];
        }
        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid]==arr[s] && arr[mid]==arr[e]){
                return arr[s];
            }
            else if(arr[mid]>=arr[s] && arr[mid]>=arr[e]){
                s=mid+1;
            }
            else{
                e=mid;
            }
        }
        return arr[s];
    }
}
