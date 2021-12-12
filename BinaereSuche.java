
package binaeresuche;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BinaereSuche {

    public static void main(String[] args) {
       
        final Random rdm = new Random();
        
        int[] arr = new int[100];
        
        /*
         * Generiere zufällige Zahlen an alle Stellen
         */
        for(int i = 0; i < arr.length; i++){
            arr[i] = rdm.nextInt(1000);
        }
        
        /*
         * Erstelle variablen
         */
        int pos = -1;
        int start = 0;
        int end = arr.length-1;
        int mitte = (start+end)/2;
        
        /*
         * Array sortieren 
         */
        Arrays.sort(arr);
                
        /*
        * Werte ausgeben oder []
        */
        System.out.println("Elemente: " + Arrays.toString(arr).replace("[", "").replace("]", ""));
        
        /*
         * Eingabe des gesuchten Elements 
         */
        Scanner scanner = new Scanner(System.in);
          
        System.out.print("Geben Sie die Zahl ein die Sie suchen: ");
        
        int search = scanner.nextInt();
        
        /*
        Suche nach dem Element
        */
        
        while(start <= end){
            
            if(search != arr[mitte]){
                
                /*
                Element nicht gefunden, neue Teilmenge erstellen
                */
                
                if(search < arr[mitte]){
                    
                    end = mitte-1;
                    
                } else {
                    
                    start = mitte+1;
                    
                }
                   
                mitte = (start+end)/2;
                
            } else {
                
                /*
                Element gefunden
                */
                
                pos = mitte;
                end = -1;
                
            }
            
        }
        
        /*
        Ausgabe Suchergebnis
        */
        if(pos != -1){
            System.out.println("Element an stelle " + (pos+1) + " gefunden.");
        } else {
            System.out.println("Element nicht enthalten!");
        }
        
    }
    
}