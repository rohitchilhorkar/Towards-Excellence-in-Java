import java.util.*;

public class CountPairs {
    public static int countPairs(int arr[], int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;

        // Count the frequency of each element in the array
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        // Count pairs with the given sum
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(target - arr[i])) {
                count += map.get(target - arr[i]);

                // Avoid counting the same pair twice
                if (arr[i] * 2 == target) {
                    count--;
                }
            }
        }

        return count / 2; // Each pair is counted twice, so divide by 2
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 1, 5};
        int target = 6;

        int count = countPairs(arr, target);
        System.out.println(count);
    }
}
