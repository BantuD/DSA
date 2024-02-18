public class Main
{
    
	public static void main(String[] args) {
	        int arr[] = {5, 10, 10, 15, 20, 20, 20}, n = arr.length;
	        
	        int low=0,high=n-1;
	        int x=20;
	        while(low<=high){
	            int mid = (low+high)/2;
	            
	            if(arr[mid]<x){
	                low=mid+1;
	            }
	            else if(arr[mid]>x){
	                high=mid-1;
	            }
	            else{
	                if(mid==n-1 || arr[mid]!=arr[mid+1]){
	                    System.out.println("at index: "+mid);
	                    return;
	                }
	                else{
	                    low=mid+1;
	                }
	            }
	        }

	}
}
