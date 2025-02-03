public class ThreeSort {

    public static void main(String[] args){

        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        int num3 = Integer.parseInt(args[2]);

        int order1 = Math.min(num1,Math.min(num2,num3));
        int order3 = Math.max(num1,Math.max(num2,num3));
        int order2 = num1+num2+num3-order1-order3 ;

        System.out.println("Ascending order is : " + order1 + " , " + order2 + " , " + order3) ;

    }
}