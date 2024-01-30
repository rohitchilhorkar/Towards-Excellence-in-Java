import java.util.Arrays;

public class reverseStringWithWords{
    public static void main(String[] args){
        String name = "Hello I am Shreyashish Sengupta";

        String reverseName = reverseWord(name, name.length());

        System.out.println(reverseName);

    }

    public static String[] splitBySpaces(String name){

        char[] namesArray = name.toCharArray();
        String[] result = new String[name.length()];
        int i=0,j=0;
        while(i < namesArray.length){
            StringBuilder word = new StringBuilder();

            while (i < namesArray.length && namesArray[i] == ' ') {
                i++;
            }

            while(i < namesArray.length && namesArray[i] != ' '){
                word.append(namesArray[i]);
                i++;
            }
            System.out.println(word);

            if (word.length() > 0) {
                result[j++] = word.toString();
            }

            word.setLength(0);
        }
        return Arrays.copyOf(result, j);
    }
    public static String reverseWord(String name, int n){
        StringBuilder reversedString = new StringBuilder();

        String[] splitWords = splitBySpaces(name);

        for(int i=splitWords.length-1; i>=0; i--){
            reversedString.append(splitWords[i] + " ");
        }

        return reversedString.toString();
    }
}