
public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {7, 4, 10, 8, 3, 1};
		
		int len = arr.length;
		
		int i=0, j=0;
		
		for(i=0; i<len-1; i++) {
			int min = i;
			for(j=i; j<len; j++) {
				if(arr[j]<arr[min])
					min = j;
			}
			
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
		
		
		for(int k=0; k<len; k++) {
			System.out.print(arr[k]+" ");
		}
	}

}
