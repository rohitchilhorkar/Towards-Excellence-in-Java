import java.util.*;

public class SubsetOfArray{
    public static void main(String[] args){
        long[] A = {1,2,3,4,5,5,6,2};
        long[] B = {4,2,1,5,5,5};

        boolean isSubset = isSubset(A, B);

        if(isSubset)
            System.out.println("B is a subset of A");
        else
            System.out.println("B is not a subset of A");
    }

    public static boolean isSubset(long[] arr1, long[] arr2){
        Map<Long, Integer> elements = new HashMap<>();

        for(long i : arr1)
            elements.put(i, elements.getOrDefault(i, 0) + 1);

        for(long j : arr2){
            if(elements.containsKey(j)){
                if(elements.get(j) == 0)
                    return false;
                else
                    elements.put(j, elements.getOrDefault(j,0) - 1);                    
            }else
                return false;
        }       
        return true;
    }
}