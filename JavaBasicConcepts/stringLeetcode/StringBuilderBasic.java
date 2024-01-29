public class StringBuilderBasic{

    public static String concatenateStrings(String[] words){
        StringBuilder sentence = new StringBuilder();

        for(String word : words)    
            sentence.append(word);
        sentence.insert(6, "Siemens");
        sentence.delete(6, 10);
        sentence.reverse();
        return sentence.toString();
    }

    public static void main(String[] args){
        String[] words = {"Rohit", "is a ", "Software Engineer"};

        String result = concatenateStrings(words);
        
        System.out.println(result);
    }

}