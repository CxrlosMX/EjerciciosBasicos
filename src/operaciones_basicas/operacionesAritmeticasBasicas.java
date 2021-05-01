/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones_basicas;

import java.util.Scanner;

/**
 *
 * @author El Camaleon
 */
public class operacionesAritmeticasBasicas {
   public static void main (String args[]){
       Scanner sc=new Scanner(System.in);
       System.out.println("Introduce el numero 1 por favor");
       double n1=sc.nextDouble();
       System.out.println("Introduce el numero 2 por favor");
       double n2=sc.nextDouble();
       
       //Suma
       System.out.println("Suma="+(n1+n2));
       //Resta
        System.out.println("Resta="+(n1-n2));
        //Multiplicacion
         System.out.println("Multiplicación="+(n1*n2));
         //Division
          System.out.println("Division="+(n1/n2));
       
   }
    
}
