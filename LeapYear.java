public class LeapYear{
    public static void main(String[] args){
        int year = Integer.parseInt(args[0]);
        /* 
        int mod4 = year % 4 ;
        int div100 = year %100 ;
        int div400 = year % 400 ;

       
        if (mod4==0 && div100 !=0){
            System.out.println(year + " is Leap Year");
        }else if (div400 == 0 ){
            System.out.println(year + " is Leap year");
        }else{
            System.out.println(year + " is not a Leap Year");
        }*/

       boolean isLeapYear ;
       isLeapYear = (year % 4==0);
       isLeapYear = isLeapYear && (year %100 !=0);
       isLeapYear = isLeapYear || (year %400 ==0);

       System.out.println(isLeapYear);
    }
}