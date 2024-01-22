public class Largest_Contigous_Array{
    public static void main(String[] args){
        int arr[] = {-1,-2,-3,-5};
        int current_sum = 0, largest_sum = Integer.MIN_VALUE;
        for(int i: arr){
            current_sum += i;
            largest_sum = Math.max(largest_sum, current_sum);
            if(current_sum < 0)
                current_sum = 0;
        }
        System.out.println(largest_sum);
    }
}