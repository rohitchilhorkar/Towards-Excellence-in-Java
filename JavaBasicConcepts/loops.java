
public class loops{
    public static void main(String[] arg){

        // for(float $i=0; $i<9; $i++){
        //     System.out.println($i);
        // }

        double price = 10.90d;

        while(price<20){
            price++;
            System.out.println(price);
        }
        double distanceToSun = 12e32d;
        int distanceToSunInteger = (int) distanceToSun;

        System.out.println(distanceToSun);
        System.out.println(distanceToSunInteger);
    }
}