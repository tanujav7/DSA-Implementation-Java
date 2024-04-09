public class MergeSort {
    public static void main(String[] args) {
        int arr[] = {1, 7, 6, 8, 0, 9, 4, 5};
        int n = arr.length;

        mergeSort(arr, 0, n-1);

        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }

  private static void mergeSort(int arr[], int left, int right){
        if(left>=right)
        return;

        int mid = left+(right-left)/2;

        mergeSort(arr, left, mid);
        mergeSort(arr, mid+1, right);

        merge(arr, left, mid, right);
    }

   private static void merge(int arr[], int left, int mid, int right){
        int n1 = mid-left+1;
        int n2 = right-mid;

        int leftArr[] = new int[n1];
        int rightArr[] = new int[n2];

        for(int i=0; i<n1; i++){
            leftArr[i] = arr[left+i];
        }

        for(int i=0; i<n2; i++){
            rightArr[i] = arr[mid+1+i];
        }

        int i = 0, j = 0, k = left;

        while(i<n1 && j<n2){
            if(leftArr[i]<=rightArr[j])
            arr[k++] = leftArr[i++];

            else
            arr[k++] = rightArr[j++];
        }

        while(i<n1){
            arr[k++] = leftArr[i++];
        }

        while(j<n2){
            arr[k++] = rightArr[j++];
        }
    }
}
