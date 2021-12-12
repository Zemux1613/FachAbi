
package arrayaufgabe;

import java.util.Scanner;

/**
 *
 * @author fos2-19e2-tloeser
 */
public class ArrayAufgabe {

    public static void main(String[] args) {
       
        boolean run = true;
        Scanner scanner = new Scanner(System.in);
        double[] array = new double[]{3.0,8.0,1.0,9.0,3.0,5.0,1.0};
        
        while(run){
            
            System.out.println("[1] neue Werte eingeben");
            System.out.println("[2] die Werte des Arrays ausgeben");
            System.out.println("[3] den Mittelwert ausgeben");
            System.out.println("[4] einen Wert ändern");
            System.out.println("[5] Programm beenden");
            System.out.println("");
            
            System.out.print("Eingabe: ");
            final int option = scanner.nextInt();
            
            System.out.println("");
            
            switch(option){
                
                case 2:
                    for(int i = 0; i < array.length; i++) System.out.println(i + ". " + array[i]);
                    break;
                
                case 1:
                    
                    System.out.println("Geben Sie bitte alle neuen Werte ein!");
                        
                    for(int i = 0; i < array.length; i++){
                        System.out.print("Wert: ");
                        array[i] = scanner.nextInt();
                    }
                    break;
                    
                case 3:
                    int sum = 0;
                    for(int i = 0; i < array.length; i++){
                        sum += array[i];
                    }
                    System.out.println("Mittelwert: " + sum/array.length);
                    break;
                case 4:
                    
                    boolean vailed = true;
                    do{
                        
                        System.out.print("Geben Sie die Position an die Sie verändern wollen: ");
                        int pos = (scanner.nextInt() - 1);
                        System.out.print("Geben Sie den Wert an den Sie an Position " + pos + " haben möchten: ");
                        int value = scanner.nextInt();
                   
                        if(pos > -1 && pos < array.length+1){
                            array[pos] = value;
                            vailed = false;
                        } else {
                            System.out.println("Diese Position ist nicht im Array vorhanden!");
                        }
                        
                    }while (vailed);
                    
                    break;
                    
                case 5:
                    run = false;
                    break;
                    
                default:
                    break;
            }            
        
        }
        
    }
    
}
