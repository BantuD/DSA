// Given an array a of n positive integers. The task is to find the maximum of j - i subjected to the constraint of a[i] < a[j] and i < j.

// Example 1:

// Input:
// n = 2
// a[] = {1, 10}
// Output:
// 1
// Explanation:
// a[0] < a[1] so (j-i) is 1-0 = 1.

class Solution{
    
    // A[]: input array
    // N: size of array
    // Function to find the maximum index difference.
    static int maxIndexDiff(int arr[], int n) { 
        
       int[] lMin = new int[n];
       int[] rMax = new int[n];
       int i=0,j=0;
       
       lMin[0] = arr[0];
       for(i=1;i<n;i++)
        lMin[i]=Math.min(lMin[i-1],arr[i]);
        
       rMax[n-1]=arr[n-1];
       for(i=n-2;i>=0;i--)
        rMax[i]=Math.max(rMax[i+1],arr[i]);
    
       i=0; j=0;
       int res=Integer.MIN_VALUE;
       
       while(i<n && j<n){
           if(lMin[i]<=rMax[j]){
               res=Math.max(res,(j-i));
               j++;
           }
           else{
               i++;
           }
       }
       
       if(res<0)
        res=0;
        
        
       return res;
        
    }
}
