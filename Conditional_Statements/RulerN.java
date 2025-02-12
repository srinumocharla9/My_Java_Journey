public class RulerN{

    public static void main(String[] args){

        int RulerNum = Integer.parseInt(args[0]);

        String ruler ;

        ruler = " ";

        for(int i = 1 ; i <=RulerNum ; i++){
            ruler = ruler + i + ruler; 
            System.out.println(ruler);
        }
    }
}