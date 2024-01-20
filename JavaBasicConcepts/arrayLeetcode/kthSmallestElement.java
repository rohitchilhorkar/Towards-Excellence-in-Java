import java.util.PriorityQueue;
import java.util.Collections;
// It's Collections not Collection
// Forgot to create new object 
public class kthSmallestElement{
    public static int kthSmallestElementFunc(int arr[], int position){
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0; i<arr.length; i++){
            maxHeap.add(arr[i]);
            if(maxHeap.size()>position){
                maxHeap.poll();
            }
        }        
        return maxHeap.peek();
    }

    public static void main(String[] args){

        int arr[] = {5,7,2,11,50};
        int position = 3;

        if(position > arr.length)
            return;

        int elementOnPosition = kthSmallestElementFunc(arr, position);

        System.out.println("Element on position " + position + " is " + elementOnPosition);
    }
}





