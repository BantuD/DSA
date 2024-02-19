
public class Main
{
	public static void main(String[] args) {
	int arr[] ={10, 20, 15, 2, 23, 90, 67}, n = arr.length;
    int low=0,high=n-1;
    while(low<=high){
        int mid = (low+high)/2;
        if((mid==0 || arr[mid]>=arr[mid-1]) && (mid==n-1 || arr[mid]>=arr[mid+1])){
            System.out.println(arr[mid]);
            break;
         
        }
        //if(arr[mid]<=arr[mid-1])
        else if(arr[mid]<=arr[mid+1]){ // just change the interchange (if and else) to get first peak element
            // high=mid-1;
            low = mid+1;
        }
        else{
            high = mid-1;
            //low=mid+1
        }
    }
	}
}
