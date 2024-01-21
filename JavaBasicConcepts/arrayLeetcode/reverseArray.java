public class reverseArray{
    public static void main(String[] args){
        int[] arr = {5,3,2,2,1,12,2};

        for(int i=0; i<(arr.length)/2; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;
        }

        for(int i : arr){
            System.out.print(i+" ");
        }
    }
}