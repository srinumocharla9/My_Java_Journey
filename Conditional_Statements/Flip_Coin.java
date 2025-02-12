public class Flip_Coin {

    public static void main(String[] args){

        int Toss = (int) (Math.random()*2.0 + 1.0) ;

        if (Toss == 1){
            System.out.println("Heads");
        }else{
            System.out.println("Tails");
        }
    }
}