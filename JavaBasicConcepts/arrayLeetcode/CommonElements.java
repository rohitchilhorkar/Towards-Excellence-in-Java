import java.util.*;

public class CommonElements{
    public static void main(String[] args){

        int[] A = {1,5,10,20,40,80};
        int[] B = {6,7,20,80,100};
        int[] C = {3,4,15,20,30,70,80,120};

        ArrayList<Integer> commoElements = commonElements(A,B,C,A.length,B.length,C.length);
        System.out.println("All");
        for(Integer i: commoElements)
            System.out.println(i);

    }

    public static ArrayList<Integer> commonElements(int[] A,int[] B,int[] C,int n1, int n2, int n3){        
        int i,j,k;
        i = j = k = 0;
        ArrayList<Integer> result = new ArrayList<>();
        while(i<n1 && j<n2 && k<n3){
            if(A[i] == B[j] && B[j] == C[k]){
                if(result.isEmpty() || A[i] != result.get(result.size()-1)){
                    result.add(A[i]);
                }
                i++; j++; k++;
            }else if(A[i] < B[j])
                i++;
            else if(B[j] < C[k])
                j++;
            else
                k++;
        }
        return result;
    }
}