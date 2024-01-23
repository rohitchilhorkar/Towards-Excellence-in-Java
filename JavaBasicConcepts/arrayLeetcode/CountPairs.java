import java.util.*;

public class CountPairs {
    public static int countPairs(int[] arr, int target){

        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for(int i=0; i<arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        for(int i=0; i<arr.length; i++){
            if(map.containsKey(target - arr[i])){
                count += map.get(arr[i]);
            }

            if( arr[i] * 2 == target)
                count--;
        }
        return count/2;
    }

    public static void main(String[] args) {
        int arr[] = {3,3,3,2,5};
        int target = 6;

        int count = countPairs(arr, target);
        System.out.println(count);
    }
}
