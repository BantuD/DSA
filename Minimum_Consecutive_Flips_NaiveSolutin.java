public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		int arr[] = {1, 0, 0, 0, 1, 0, 0, 1, 0, 1}, n=arr.length;
		for(int i=1;i<n;i++){
		    if(arr[i]!=arr[i-1]){
		        if(arr[i]!=arr[0]){
		            System.out.print(" From "+i+" to ");
		        }
		        else{
		            System.out.println(i-1);
		        }
		    }
		    
		}
	}
}
