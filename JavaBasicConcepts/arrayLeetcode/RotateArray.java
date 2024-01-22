public class RotateArray{

    public static void bruteForce(int[] arr, int rotateBy){
        
        System.out.println(rotateBy);
        while(rotateBy > 0){
            int temp = arr[0];
            for(int i=0; i<arr.length-1; i++){
                arr[i] = arr[i+1];
            }
            arr[arr.length-1] = temp;
            rotateBy--;
        }
        printArray(arr);
    }

    public static void reversalTechinque(int arr[], int rotateBy){
        int N = arr.length;

        rotateBy =  rotateBy%N;

        reverse(arr, 0, N-1);

        reverse(arr, 0, rotateBy-1);
     
        reverse(arr, rotateBy, N-1);

        printArray(arr);
    }

    public static void reverse(int arr[], int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start++] = arr[end];
            arr[end--] = temp;            
        }
    }

    public static void printArray(int[] arr){
        for(int i: arr){
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6};
        int rotateBy = 2;

        // bruteForce(arr, rotateBy%arr.length);
        reversalTechinque(arr, rotateBy);
    }
}