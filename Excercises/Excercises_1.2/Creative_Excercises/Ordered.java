/************************************************************************************
 * 
 * Write a program Ordered.java that reads in three integer 
 * command line arguments, x, y, and z. Create a boolean variable b 
 * that is true if the three values are either in ascending or in 
 * descending order, and false otherwise. Print the variable b. 
 * 
 * ***************************************************************************************/

public class Ordered {
    public static void main (String[] args){
        
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int z = Integer.parseInt(args[2]);

        boolean b , b1 , b2 ;
        b1 = (x < y && y < z);
        b2 = (x > y && y > z);
        b = b1 || b2 ;

        System.out.println(b);

    

    }
}