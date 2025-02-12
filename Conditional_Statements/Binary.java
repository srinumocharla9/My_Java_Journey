/******************************************************************** 

public class Binary {
    public static void main(String[] args){
        int Num = Integer.parseInt(args[0]);

        int i = 0 ;

        while(Num >0){

        int base2_value = (int)Math.pow(2,i);

        while(base2_value >= Num && base2_value >0)
        {

            if(base2_value == Num){
                System.out.print(base2_value);
                
                       
            }else{
                base2_value = (int)Math.pow(2 , i-1);
                System.out.println(base2_value);
    
            }

            Num = Num - base2_value ;
            base2_value = 0 ;
            i = 0 ; 
        }
        i = i+1 ;
        }
    }

}


*******************************************************************************************/

public class Binary {

    public static void main(String[] args){

        //Take input Number from command - Line

        int n = Integer.parseInt(args[0]);

        //Calculate the Highest power for the number

        int power = 1 ;

        while ( power <=n/2){
            power *= 2 ;

        }

        while (power > 0){

            if(n < power){
                System.out.print(0);
            }
            else{
                System.out.print(1);
                n -=power ;
            }

            power /= 2 ;
            
        }

       System.out.println() ;

    }
}