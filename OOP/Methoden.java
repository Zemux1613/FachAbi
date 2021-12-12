
package methoden;

import java.util.Scanner;

public class Methoden {

    public static void main(String[] args) {
        
        meineMethode();
        
    }

    public static void meineMethode() {
        int z1 = input(), z2 = input(),result;
        result = mal(z1, z2);
        ausgabe(result, z1, z2);
    }
    
    public static void ausgabe(int result, int z1, int z2){
        
        System.out.println("1. Zahl: " + z1);
        
        System.out.println("2. Zahl: " + z2);
        
        System.out.println("Ergebnis: " + result);
        
    } 
    
    public static int mal(int z1, int z2){
        return z1*z2;
    }
    
    public static int input(){
        
        int ret = 0;
        
        Scanner s = new Scanner(System.in);
        System.out.println("Gebe die eine Zahl ein: ");
        ret = s.nextInt();
        
        return ret;
        
    }
    
}
