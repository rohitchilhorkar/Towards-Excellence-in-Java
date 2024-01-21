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

    public static void printArray(int[] arr){
        for(int i: arr){
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6};
        int rotateBy = 7;

        bruteForce(arr, rotateBy%arr.length);
    }
}