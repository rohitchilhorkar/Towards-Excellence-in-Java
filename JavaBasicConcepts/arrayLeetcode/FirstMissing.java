
public class FirstMissing{

    public static int firstMissingNumber(int[] arr, int n){
        // Make all negative number as "0"
        for(int i=0; i<n; i++){
            if(arr[i] < 0)    
                arr[i] = 0;
        }

        // Main Logic
        for(int i=0; i<n; i++){
            int current = Math.abs(arr[i]);

            if(1 <= current && current <= n){
                if(arr[current-1] > 0){
                    int index = current-1;
                    arr[index] *= -1;
                }else if(arr[current-1] == 0){
                    arr[current-1] = -1 * (n+1);
                }
            }
        }
        for(int i=0; i<n; i++){
            if(arr[i] >= 0)
                return i+1;
        }
        return n+1;
    }
    public static void main(String[] args){
        int arr[] = {3, 4, -1, 1};
        int n = 4;

        System.out.println("First Missing Positive Number is : " + firstMissingNumber(arr, n));
    }
}