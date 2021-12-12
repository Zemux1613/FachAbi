
package bremswege;

import java.util.Scanner;

public class Bremswege {

    public static void main(String[] args) {
        
        boolean run = true;
        
        while(run){
        
            int type = input("\n[1] Bremsweg\n[2] Reaktionsweg\n[3] Anhalteweg\n[4] Beenden");
        
            switch(type){
                case 1:
                    int speed = input("\nGeben Sie die Geschwindigkeit in km/h an: ");
                    print("\nIhr Bremsweg ist " + callcBremsweg(speed));
                    break;
                case 2:
                    int speed1 = input("\nGeben Sie die Geschwindigkeit in km/h an: ");
                    print("\nIhr Reaktionsweg ist " + callcReaktionsweg(speed1));
                    break;
                    
                case 3:
                    int speed2 = input("\nGeben Sie die Geschwindigkeit in km/h an: ");
                    double result = callcAnhalteweg(callcBremsweg(speed2), callcReaktionsweg(speed2));
                    print("\nIhr Anhalteweg ist " + result);
                    break;
                case 4:
                    run = false;
                    break;
            }
            
        }        
        
    }
    
    public static void print(String text){
        System.out.println(text);
    }
    
    public static double callcAnhalteweg(double bremsweg, double reaktionsweg){
        return bremsweg+reaktionsweg;
    }

    public static double callcReaktionsweg(int speed){
        double s1 = (speed/10.0)*3;
        return s1;
    }
    
    public static double callcBremsweg(int speed){
        double s1 = speed/10.0;
        return s1 * s1;
    }
    
    public static int input(String text) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(text);
        int i = scanner.nextInt();
        return i;
    }
    
    
    
}
