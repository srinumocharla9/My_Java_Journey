public class Quadratic_roots {
    public static void main(String[] args){

        Double a = Double.parseDouble(args[0]);
        Double b = Double.parseDouble(args[1]);
        Double c = Double.parseDouble(args[2]);

        Double discriminant = b*b - 4*a*c ;
        Double sqroot = Math.sqrt(discriminant);

        Double root1 = (-b + sqroot)/2*a;
        Double root2 = (-b - sqroot)/2*a;

        System.out.println("Root 1 : " + root1);
        System.out.println("Root 2 : " + root2);





    }
}