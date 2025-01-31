public class Distance{
    public static void main ( String[] args){
        int x1 = Integer.parseInt(args[0]);
        int y1 = Integer.parseInt(args[1]);

        double distance = Math.sqrt((x1*x1) + (y1*y1));

        System.out.println("Distance between (" + x1 + " , " + y1 + ") from  (0,0) is " + distance);
    }
}