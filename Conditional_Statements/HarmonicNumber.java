public class HarmonicNumber {

    public static void main(String[] args){

        int num = Integer.parseInt(args[0]);

        Double HmNum = 0.0;

        for (int i=1 ; i <=num ; i++){

            HmNum += 1.0/i ;
        }

        System.out.println("Harmonic Number for N : " + HmNum);
    }
}