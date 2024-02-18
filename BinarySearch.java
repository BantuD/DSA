//This is the reccursive solution
public class Main
{
    static int bSearch(int[] arr,int start,int end,int x){
        if(start>end){
            return -1;
        }
        int mid = (start+end)/2;
        
        if(arr[mid]==x)
            return x;
        else if(arr[mid]>x)
                return bSearch(arr,start,mid-1,x);
        else{
            return bSearch(arr,mid+1,end,x);
        }
        
    }
	public static void main(String[] args) {
		int arr[] = {10, 20, 30, 40, 50, 60}, n = arr.length;
	    System.out.println(bSearch(arr,0,n-1,30));
		
	}
}
