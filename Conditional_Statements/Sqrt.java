
public class Sqrt {

    public static void main(String[] args){

        Double x = Double.parseDouble(args[0]);

        Double t_avg = 1.0 ;

        for(int t = 1 ; t <= x ; t = t+1){
            if (t_avg == x/t){
                System.out.println("Square root of the " + x + " is : " + t_avg);
            }else {
                t_avg = (t + x/t )/2.0 ;
            }
        }
    }
}