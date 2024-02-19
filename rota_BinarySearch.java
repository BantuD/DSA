//This is program we search for an element into sorted and roted array our task is to get the element in log(n) time complexity
// this is the program which is developed by me only

public class Main
{
    static int bSearch(int[] arr,int low,int high,int x){
        if(low>high){
          return -1;
        }
        
        int mid = (low+high)/2;
        
        if(arr[mid]>x){
            return bSearch(arr,low,mid-1,x);
        }
        
        else if(arr[mid]<x){
            return bSearch(arr,mid+1,high,x);
        }
        
        else{
            return arr[mid];
        }
   
    }
    
    static int rotaBS(int[] arr,int low,int high,int x){
        
        if(low>high)
         {
             return -1;
         }
        int mid = (low+high)/2;
        int result=-1;
        
        if(arr[mid]==x)
            return arr[mid];
            
        if(arr[low]<arr[mid]){
            result = bSearch(arr,low,mid,x);
            if(result==-1)
                return rotaBS(arr,mid,high,x);
        }
        else if(arr[mid]<arr[high]){
            result = bSearch(arr,mid,high,x);
            if(result==-1)
                return rotaBS(arr,low,mid,x);
        }
        
        
        return -1;    
        
    }
	public static void main(String[] args) {
			
			int arr[] = {10, 20, 40, 60, 5, 8}, n = 6;
            int x = 9;
           
            int result = rotaBS(arr,0,n-1,x);
            System.out.println(result);
	}
}
