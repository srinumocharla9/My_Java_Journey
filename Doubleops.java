public class Doubleops{
    public static void main (String[] args ){
        double value1 = Double.parseDouble(args[0]);
        double value2 = Double.parseDouble(args[1]);
        double sum = value1 + value2 ;
        double product = value1 + value2;
        double quotation = value1 / value2 ;
        double substraction = value1 - value2 ;

        System.out.println(value1 + " + " + value2 + " = " + sum);
        System.out.println(value1 + " - " + value2 + " = " + substraction);
        System.out.println(value1 + " * " + value2 + " = " + product);
        System.out.println(value1 + " / " + value2 + " = " + quotation);

    }
}