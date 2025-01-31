public class SpringSeason{
    public static void main(String[] args){
        int month = Integer.parseInt(args[0]);
        int days = Integer.parseInt(args[1]);
        days = days+ (month*30) ;

        boolean value = ((month >=3 && month <=6) && (days >=110 && days <= 200) );

        System.out.println(value);


    }
}