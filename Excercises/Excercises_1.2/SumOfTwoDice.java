public class SumOfTwoDice{
    public static void main(String[] args){
        int dice1 = 1 + (int)(Math.random()*6);
        //int value_dice1 = (int) (dice1+1);

        int dice2 = 1 + (int)(Math.random()*6);
        //int value_dice2 = (int)(dice2+1) ;

        int sumofValues = dice1 + dice2;
        System.out.println("The Sum of Two dices is : "+dice1 + " , " + dice2 + " : " +  sumofValues);

    }
}