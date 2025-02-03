public class Max_Two {

    public static void main(String[] args){

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        int max = (a+b+Math.abs(a-b))/2;

        System.out.println("Max of Two numbers is : " + max);
    }
}