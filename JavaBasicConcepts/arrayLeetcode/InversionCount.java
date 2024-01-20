public class InversionCount{

    // O(N^2)
    public static int inversionCountBruteForceApproach(int arr[], int lengthOfArray){
        int count = 0;
        for(int i=0; i<lengthOfArray-1; i++){
            for(int j=i+1; j<lengthOfArray; j++){
                if(arr[i] > arr[j]){
                    System.out.println(arr[i]+" , "+arr[j]);
                    count++;
                }
            }
        }
        return count;
    }
    public static int mergeArrays(int arr[], int low, int mid, int high){
        
        int temp[] = new int[high-low+1];
        int i=0, inversionCount =0;
        int left = low;
        int right = mid+1;

        while(left <= mid && right <= high){
            if(arr[left] < arr[right]){
                temp[i++] = arr[left++];               
            }
            else{
                inversionCount  += (mid - left + 1);
                temp[i++] = arr[right++];
            }
        }    
        return inversionCount ;    
    }

    public static int inversionCountMergeSortApproach(int arr[], int low, int high){
        int inversionCount  = 0;
        if(low == high)
            return 0;
        else{
            int mid = (low + high) / 2;
            inversionCount  += inversionCountMergeSortApproach(arr, low, mid);
            inversionCount  += inversionCountMergeSortApproach(arr, mid+1, high);
            inversionCount  += mergeArrays(arr, low, mid, high);
        }
        return inversionCount ;
    }

    public static void main(String[] args){
        int arr[] = {2,4,1,2,6,3};
        int N = arr.length;

        int count = inversionCountBruteForceApproach(arr, N);
        int countM = inversionCountMergeSortApproach(arr, 0, N-1);
        System.out.println(count);
        System.out.println(countM);

    }
}