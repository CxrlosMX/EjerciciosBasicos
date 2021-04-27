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
public class Contraseña {
    public static void main (String args[]){
    String contraseña="LuisCRendon";
    JOptionPane.showMessageDialog(null, "---Bienvenido de nuevo Usuario_1---");
    int i=0;
    while (i<3){

    String c=JOptionPane.showInputDialog("Contraseña");
    if (c.equals(contraseña)){
        System.out.println("Contraseña correcta");
        i=2;
    }
    else if(i==2){
        System.out.println("Vuelva a intentar en unos minutos");
    }
    else {
        System.out.println("Contraseña incorrecta");
    }
    i++;
    }
    
    }
}
