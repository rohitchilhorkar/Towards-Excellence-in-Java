
// Array: int/string has length property
// String: has length function

public class Array{
    public static void main(String[] args){        
        String[] Cars = {"Volvo", "BMW", "Mercedes", "Aston Martin"};

        Array obj = new Array();
        String[] modifiedCarList = obj.displayArray(Cars);

        for(int i=0; i<modifiedCarList.length; i++){
            System.out.println(modifiedCarList[i]);
        }
    }

    String[] displayArray(String[] carsList){
        int i = 0;
        while(i < carsList.length){
            System.out.println(carsList[i]);
            i++;
        }
        System.out.println("--------");

        carsList[2] = "Maybach";
        carsList[0] = "Rolls-Royce";

        return carsList;
    }
}