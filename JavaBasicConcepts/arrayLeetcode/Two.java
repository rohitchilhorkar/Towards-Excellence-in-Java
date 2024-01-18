import java.util.*;

public class Two {
    public static void main(String[] args){
        int[] nums = {2,5,7,9};
        int target = 12;
        
        // int[] answer = twoSumBruteForce(nums, target);
        int[] answer = twoSumHashMap(nums, target);


        for(int i=0; i<answer.length; i++)
            System.out.println(answer[i]);
    }

    public static int[] twoSumBruteForce(int[] nums, int target){
        int sizeOfArray = nums.length;
        for(int i=0 ; i<sizeOfArray-1; i++){
            for(int j=i+1; j<sizeOfArray; j++){
                if(nums[i]+nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }

    public static int[] twoSumHashMap(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            map.put(nums[i], i);
        }
        
        for(int i=0; i<nums.length; i++){
            // consider 3,2,4 target = 6 for second condition
            if(map.containsKey(target - nums[i]) && map.get(target - nums[i]) != i)
                return new int[]{i, map.get(target - nums[i])};
            
        }
        return new int[]{};
    }
}
