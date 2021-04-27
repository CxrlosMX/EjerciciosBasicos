/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion_basica;
import javax.swing.JOptionPane;
/**
 *
 * @author El Camaleon
 */
public class Divisible_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        
        // TODO code application logic here
        String n1=JOptionPane.showInputDialog("Introduce un numero por favor");
        int n2=Integer.parseInt(n1);
        if (n2%2==0){
            System.out.println("El numero "+n2+" es divisible entre cero");
        }
        else {
            System.out.println("El numero "+n2+" no es divisible");
        }
        
    }
    
}
