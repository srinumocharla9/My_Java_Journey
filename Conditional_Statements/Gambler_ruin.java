
/**************** 
public class Gambler_ruin {
    public static void main(String[] args){
        int initial_amount = Integer.parseInt(args[0]);
        int goal_amount = Integer.parseInt(args[1]);
        int games = Integer.parseInt(args[2]);

        for(int i=1 ; i <= games ; i++){
            double bet = (double) (Math.random());

            System.out.print("Match : " + i);

            if(bet < 0.5){
                initial_amount -=1 ;
                System.out.println(" Lost ");
                
            }else {
                initial_amount +=1 ;
                System.out.println(" Won ");

            }

            if(initial_amount == 0 || initial_amount==goal_amount){
                System.out.println("Total matches : " + i);
                i = games + 1 ;
            }

        }

        System.out.println("Money Left after the gambling : " + initial_amount);
    }
}

****************************************************************************************/


/**********************
 Gambler's ruin Suppose a gambler makes a series of fair $1 bets, 
 starting with $50, and continue to play until she either goes broke or has $250. 
 What are the chances that she will go home with $250, and how many bets might 
 she expect to make before winning or losing?  
 */

public class Gambler_ruin{
    public static void main(String[] args){
        int initial_amount = Integer.parseInt(args[0]);
        int goal_amount = Integer.parseInt(args[1]);
        int trails = Integer.parseInt(args[2]);
        int cash = 0 ;
        
        int wins = 0 ;
        int bets = 0 ;

        for(int i=0 ; i<trails ; i++){
            cash = initial_amount ;

            while(cash > 0 && cash < goal_amount){
                bets++;

                if(Math.random()< 0.5)cash-- ;
                else cash++;
            }

            if(cash==goal_amount){
                wins++;
            }
        }

        System.out.println("Total wins : " + wins + " out of " + trails + " games");
        System.out.println("Total No of bets made : " + bets);


    }
}