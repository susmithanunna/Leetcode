//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

public class GFG {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int k = Integer.parseInt(inputLine[1]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            int ans = new Solution().getPairsCount(arr, n, k);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    int getPairsCount(int[] arr, int n, int k) {
        // code here
        // Arrays.sort(arr);
        // int i=0;
        // int j=n-1;
        // int c=0;
        // while(i<j){
        //     int sum=arr[i]+arr[j];
        //     if(sum==k){
        //         c++;
        //         int l=i+1;
        //         while(l<j && arr[i]==arr[l]){
        //             c++;
        //             l++;
        //         }
        //         int h=j-1;
        //         while(h>i && arr[j]==arr[h]){
        //             c++;
        //             h--;
        //         }
        //         i=l;
        //         j=h;
        //     }
        //     else if(sum<k){
        //         i++;
        //     }
        //     else{
        //         j--;
        //     }
            
            
        // }
        // return c;
        // Arrays.sort(arr);
        // int i = 0;
        // int j = n - 1;
        // int count = 0;

        // while (i < j) {
        //     int sum = arr[i] + arr[j];

        //     if (sum == k) {
        //         count++;

        //         // Handling duplicates for arr[i]
        //         int left = i + 1;
        //         while (left < j && arr[left] == arr[i]) {
        //             count++;
        //             left++;
        //         }

        //         // Handling duplicates for arr[j]
        //         int right = j - 1;
        //         while (right > i && arr[right] == arr[j]) {
        //             count++;
        //             right--;
        //         }

        //         i = left;
        //         j = right;
        //     } else if (sum < k) {
        //         i++;
        //     } else {
        //         j--;
        //     }
        // }

        // return count;
        //Arrays.sort(arr);
        HashMap<Integer,Integer> h=new HashMap<>();
        Integer c;
        int count=0;
        for(int i:arr){
            int x=i;
            int y=k-x;
            if(h.containsKey(y)){
                count=count+h.get(y);
            }
            h.put(i,h.getOrDefault(i,0)+1);
        }
        return count;

    }
}
