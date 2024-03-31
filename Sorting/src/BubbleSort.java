
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {4, 8, 2, 7, 9, 2};
		
		int len = arr.length;
		
		for(int i=len-1; i>0; --i) {
			int swapped = 0;
			for(int j=0; j<i; j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		for(int i=0; i<len; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
