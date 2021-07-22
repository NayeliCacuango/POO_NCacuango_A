/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ec.intsuperior.modelo;

/**
 *
 * @author Home
 */
public class Laptop {
   
    //metodo de clase salida
    
    public static void modelo(){
        System.out.println("El modelo del computador es ASUS x515J");
    }
    
    //metodo de clase retorno
    
    public static String descuento(){
      String v= "Existe descuento si sus compras son mayores a $1000";
      return v;
    }
    
    //Metodo de instancia(Objeto)de salida
    public void valor(){
        System.out.println("El valor del computador es de 1010");
    }
    
    //Metodo de Instancia(Objeto)de salida
    
   public boolean ExisteDescuento(){
      return true;
  
   }
       
}
