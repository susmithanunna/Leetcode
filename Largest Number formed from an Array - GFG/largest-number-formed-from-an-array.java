//{ Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            String[] arr = br.readLine().trim().split(" ");

            String ans = new Solution().printLargest(arr);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    String printLargest(String[] arr) {
        // code here
        int n=arr.length;
        String result="";
        int c=0;
        Arrays.sort(arr,(n1,n2)->(n2+n1).compareTo(n1+n2));
        for(int i=0;i<n;i++){
            if(arr[i]=="0"){
                c++;
            }
            result+=arr[i];
        }
        if(c==n){
            return "0";
        }
        return result;
    }
}