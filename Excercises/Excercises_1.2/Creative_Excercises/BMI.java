public class BMI {

    public static void main (String[] args){

        Double Weight = Double.parseDouble(args[0]);
        Double Height = Double.parseDouble(args[1]);
        Height = Height /100;

        boolean b = true;

        Double Bmi_value = Weight /(Height * Height); 

        System.out.println("YOUR BMI INDEX VALUE IS : " + Bmi_value);
    }
}