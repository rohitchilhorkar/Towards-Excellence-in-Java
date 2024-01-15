public class StringInJava{
    public static void main(String[] args){
        String name = "Rohit Chilhorkar";
        System.out.println(name.indexOf('l'));

        String surname = "Chilhorkar";
        System.out.println(surname.charAt(3));

        System.out.println(name + " " +surname);
        System.out.println("Length of name is: "+name.length());

        System.out.println("Wohit".compareToIgnoreCase("rohit"));
        System.out.println("Rohit Chilhorkar".replace('l', 'o'));
    }
}