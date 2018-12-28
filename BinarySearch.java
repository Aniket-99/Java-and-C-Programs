public class BinarySearch{
	int binarySearch(int arr[],int x){

		int low = 0;
		int r = arr.length - 1;
		while(low<=r){
			int mid = low + (r - 1)/2;

			if(arr[mid] == x)
				return mid;

			else if (arr[mid] < x)
				low = mid + 1;

			else
				r = mid + 1;
		}
		return -1;






	}

	public static void main(String args[]){
		BinarySearch b = new BinarySearch();
		int arr[] ={2,5,10,50,60,30};
		int n = arr.length;
		int x = 10;
		int result = b.binarySearch(arr,x);

		if(result == -1){
			System.out.println("element not found");
		}
		else{
			System.out.println("element found at index: " + result);
		}
	}
}