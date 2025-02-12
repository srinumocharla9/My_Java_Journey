public class PowersOfTwo {

    public static void main(String[] args){

        int num = Integer.parseInt(args[0]);

        int i = 1 ; 

        int powerof2 = 1 ;

        while(i <= num){

            powerof2 = 2 * powerof2 ;

            System.out.println("Power of 2 " + i + " : " + powerof2);

            i = i + 1 ;


        }


    }
}