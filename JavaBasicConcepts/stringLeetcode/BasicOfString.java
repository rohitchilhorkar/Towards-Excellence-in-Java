import java.lang.*;

public class BasicOfString{

    public static void reverse(String name){
        char[] nameToReverse = name.toCharArray();

        for(int i=0, j=nameToReverse.length-1; i<nameToReverse.length/2; i++,j--){
            char letter = nameToReverse[i];
            nameToReverse[i] = nameToReverse[j];
            nameToReverse[j] = letter;
        }
        System.out.println(nameToReverse);
    }

    public static void main(String[] args){
        String name = "Rohit";
        String name2 = new String("Rohit"); // if this is used only content is same
        // String name2 = "Rohit"; if this is used, pointing to same object

        // reverse(name);
        System.out.println(name.equals("Rohit"));
        if(name == name2)   
            System.out.println("Equal Reference, i.e pointing to the same object");
        else if(name.equals(name2))
            System.out.println("Equal Content");
        else
            System.out.println("Not Equal Content/Refrence to object");
    }
}