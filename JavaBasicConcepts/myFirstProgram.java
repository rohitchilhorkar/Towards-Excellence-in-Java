
public class myFirstProgram{
    public static void main(String[] args)
    {
        if(args.length > 0){
            System.out.println(args[0]);
        }else{
            System.out.println("Hey!!, You didn't passed anything in the command line argument!");
        }

        System.out.println("I am Rohit, a software engineer by profession");
    }
}