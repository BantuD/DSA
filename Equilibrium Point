public class Main
{
	public static void main(String[] args) {
	 int arr[] = {5,2,2,4,3,4,2},n=arr.length;
	 int[] prefixSum = new int[n];
	 int[] sufixSum = new int[n];
	 
	 prefixSum[0]=arr[0];
	 for(int i=1;i<n;i++){
	     prefixSum[i]+=prefixSum[i-1]+arr[i];
	 }
	 
	 sufixSum[n-1]=arr[n-1];
	 for(int i=n-2;i>=0;i--){
	     sufixSum[i]+=sufixSum[i+1]+arr[i];
	 }
	 
	 int prefix=prefixSum[n-1],suffix=sufixSum[0];
	 for(int i=0;i<n;i++){
	     if(prefix-arr[n-i-1] == suffix-arr[i])
	     {
	         System.out.println(arr[i]);
	     }
	 }
	 
	 
	}
}
