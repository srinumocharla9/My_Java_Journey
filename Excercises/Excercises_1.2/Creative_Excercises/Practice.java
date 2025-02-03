public class Practice {
    public static void main(String[] args){
      /****************  
        long x = 65536 ;
        long y = x * x ;
        System.out.println(y);

        ************************/

      /********************************************************
       *  boolean value = (Math.sqrt(2)*Math.sqrt(2)==2);
       *  System.out.println(value);
       *
       ************************************************************/

      /************************** Divide by Zero 
       * 
       * 
       * 
       * 
       */

 /**********************************************************************************************
  * 
  * 
  * Guess the biggest number. Consider the following game. Alice writes down two integers 
  * between 0 and 100 on two cards. Bob gets to select one of the two cards and see its value.
  *  After looking at the value, Bob commits to one of the two cards. If he chooses a card 
  * with the largest value, he wins; otherwise he loses. Devise a strategy (and 
  * corresponding computer program) for Bob so that he guarantees to win strictly 
  * more than half the time. 

     double num1 =(Math.random()*100) ;   
     double num2 = (Math.random()*100);

     num1 =(int)num1;
     num2 = (int)num2;
     int threshold = 50 ;

     System.out.println ( " Num1 is : " + num1 );
     System.out.println ( " Num2 is : " + num2 );

     boolean result = (num1 < threshold && num2 >= num1) || (num1 >=threshold && num1 >= num2);
     System.out.println("Bob wins : " + result);
       

          
  **********************************************************************************************************/

 /***********************************************************************************************
  *Write a program that reads in three parameters and prints 
  true if all three are equal, and false otherwise. 
  * 
  * 
  * 
  

 int a = Integer.parseInt(args[0]);
 int b = Integer.parseInt(args[1]);
 int c = Integer.parseInt(args[2]);

 boolean resule = (a==b && b==c);

 System.out.println("The given three numbers are equal : " + resule);

 ****************************************************************************************************/
int threeInt = 3;
int fourInt  = 4;
double threeDouble = 3.0;
double fourDouble  = 4.0;
System.out.println(threeInt / fourInt);
System.out.println(threeInt / fourDouble);
System.out.println(threeDouble / fourInt);
System.out.println(threeDouble / fourDouble);
    }
}