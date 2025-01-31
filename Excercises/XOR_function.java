/************************************************************************************************
 * 
 * 
 * The exclusive or operator ^ for boolean operands is defined to be true if they are different,
 *  false if they are the same. Give a truth table for this function. 
 * 
 * 
 *************************************************************************************************/

public class XOR_function{
    public static void main(String[] args){
        boolean a = true ;
        boolean b = false;

        System.out.println("True   XoR  False   " + (a^b));
        System.out.println("True   Xor  True    " + (a ^ (!b)));
        System.out.println("False  XoR  False   " + ((!a)^b));
        System.out.println("False  Xor  True    " + ((!a)^(!b)));
    }
}