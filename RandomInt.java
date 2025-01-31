public class RandomInt{
    public static void main(String[] args){
        int num1 = Integer.parseInt(args[0]);

        double randomint;
        randomint = Math.random()*num1 ;
        randomint = (int)randomint;

        System.out.println("The random number is  : " + randomint);


    }
}