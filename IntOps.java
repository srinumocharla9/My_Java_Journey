public class IntOps {
    public static void main(String[] args){
        int value1 = Integer.parseInt(args[0]);
        int value2 = Integer.parseInt(args[1]);
        int sum = value1+value2;
        int product = value1*value2 ; 
        int sub = value1 - value2 ;
        int remainder = value1 % value2 ; 
        int quotation = value1 / value2 ; 

        System.out.println(value1 + " + " + value2 + " = " + sum );
        System.out.println(value1 + " - " + value2 + " = " + sub );
        System.out.println(value1 + " * " + value2 + " = " + product );
        System.out.println(value1 + " / " + value2 + " = " + quotation );
        System.out.println(value1 + " % " + value2 + " = " + remainder );
    }
}