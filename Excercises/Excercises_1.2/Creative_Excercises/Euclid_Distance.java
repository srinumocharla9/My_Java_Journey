public class Euclid_Distance {

    public static void main (String[] args){

        int x1 = Integer.parseInt(args[0]);
        int x2 = Integer.parseInt(args[2]);

        int y1 = Integer.parseInt(args[1]);
        int y2 = Integer.parseInt(args[3]);

        double distance = Math.sqrt(Math.pow((x2-x1) , 2) + Math.pow((y2-y1) , 2));

        System.out.println("Distance between " + "(" + x1 + " , "+  y1 + ") and (" + x2 + " , " + y2 + ") is : "+ distance);


    }
}