
package randomnumbers;

import java.util.Random;

/**
 *
 * @author fos2-19e2-tloeser
 */
public class RandomNumbers {

    public static void main(String[] args) {
        
        int[] array = new int[10];
        
        final Random random = new Random();
        
        System.out.println("Generiere zufällige Zahlen...");
        
        for(int i = 0; i < array.length; i++){
            
            array[i] = random.nextInt(100);
        
            System.out.println(array[i]);
            
        }
        
        int max = 0;
        int min = 0;
        double sum = 0;
        
        for(int i = 0; i < array.length; i++){
            if(array[max] < array[i]){
                max = i;
            }
            
            if(array[min] > array[i]){
                min = i;
            }
            sum += array[i];
        }
        
        System.out.println("Maximum: " + array[max] + " - Position: " + max);
        System.out.println("Minimum: " + array[min] + " - Position: " + min);
        System.out.println("Summe: " + sum);
        System.out.println("Durchschnitt: " + sum/array.length);
        
    }
    
}
