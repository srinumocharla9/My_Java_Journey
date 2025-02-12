/****************************************************************************************************

public class Prime_Factorization{
    public static void main(String[] args){
        int[] prime_nums = {2,3,5,7,11,13,17,19};

        int number = Integer.parseInt(args[0]);
        int i=0 ;

        while(number/2 > 0){
            if(number%prime_nums[i]==0){
                System.out.println(prime_nums[i]);
                number = number/prime_nums[i];
            }else{
                i = i+1;
            }
        }
    }
}

****************************************************************************************************/

public class Prime_Factorization{
    public static void main(String[] args){
        long num = Long.parseLong(args[0]);

        System.out.println("Prime Factorization of the  " + num + " is : ");

        while(num%2==0){
            System.out.print(2 + " ");
            num = num/2;
        }

        for(long factor = 3 ; factor*factor <=num ; factor ++ ){
           
            while(num%factor==0){
                System.out.print(factor + " ");
                num = num/factor; 
            }
        }
        if(num>1){
            System.out.println(num);
        }else System.out.println();
    }
}

