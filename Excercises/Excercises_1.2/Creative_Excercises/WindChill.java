public class WindChill {

    public static void main(String[] args){

        double Temp = Double.parseDouble(args[0]);
        double speed_v = Double.parseDouble(args[1]);


        Temp = Math.abs(Temp);
        double value1 = Math.pow(speed_v , 0.16);

        boolean val2 = (Temp <= 50 && (speed_v >=3 && speed_v <=120));

        if(val2){
            double wind_Chill = 35.74 + 0.6215 * Temp + (0.4275*Temp - 35.75)*value1 ;

        System.out.println("WindChill value is  : " + wind_Chill);

        }else{
            System.out.println("Temperature and Windspeed must be in the range (Temp < 50 && Speed is <120 or >3)");
        }

        

    }
}