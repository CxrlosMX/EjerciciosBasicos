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
public class ASCII_numero {
    public static void main (String args[]){
    String n1=JOptionPane.showInputDialog("Introduce un numero por favor");
    int n2=Integer.parseInt(n1);
    
    char caracter=(char)n2;
        System.out.println("El caracter es;"+caracter);
    }
    
}
