public class Math_functionality{

    public static void main(String[] args){
        Double num1 = Double.parseDouble(args[0]);
        int num2 = Integer.parseInt(args[1]);

        // Maths functions for Double data type.
        System.out.println("************************** Absolute Value ******************");
        System.out.println(Math.abs(num1));
        System.out.println(Math.abs(num2));

        System.out.println("************************** Max Value ***********************");
        System.out.println(Math.max(num1,num2));

        System.out.println("************************** Min Value ***********************");
        System.out.println(Math.min(num1,num2));

        System.out.println("************************** sin Value ***********************");
        System.out.println(Math.sin(num1));

        System.out.println("************************** Exponential Value (e^a) ***********************");
        System.out.println(Math.exp(num2));

        System.out.println("************************** Log Value ***********************");
        System.out.println(Math.log(num1));

        System.out.println("************************** Power Value ***********************");
        System.out.println(Math.pow(num1,num2));

        System.out.println("************************** sqroot Value ***********************");
        System.out.println(Math.sqrt(num1));

        System.out.println("************************** Random Value ***********************");
        System.out.println(Math.random());
    }
}