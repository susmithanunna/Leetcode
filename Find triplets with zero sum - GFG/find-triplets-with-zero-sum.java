//{ Driver Code Starts
import java.util.*;
class Triplets{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int[] a=new int[n];
			for(int i=0;i<n;i++){
				a[i]=sc.nextInt();
			}
			Solution g=new Solution();
			if(g.findTriplets(a,n))
				System.out.println("1");
			else
				System.out.println("0");
			
		}
	}
}
// } Driver Code Ends


/*Complete the function below*/


class Solution
{
    // arr[]: input array
    // n: size of the array
    //Function to find triplets with zero sum.
	public boolean findTriplets(int arr[] , int n)
    {
        //add code here.
        Arrays.sort(arr);
        int c=0;
        for(int i=0;i<n;i++){
           int j=i+1;
           int k=n-1;
           if(i>0 && arr[i]==arr[i-1])
           {
               continue;
           }
           while(j<k){
               int sum=arr[i]+arr[j]+arr[k];
               if(sum<0){
                   j++;
               }
               else if(sum>0){
                   k--;
               }
               else{
                   c++;
                   j++;
                   k--;
                   while( j<k && arr[j]==arr[j-1]){
                     j++;
                  }
                  while(j<k && arr[k]==arr[k+1]){
                      k--;
                  }
               }
               
           }
       }
        if(c>0){
            return true;
        }
        return false;
    }
}