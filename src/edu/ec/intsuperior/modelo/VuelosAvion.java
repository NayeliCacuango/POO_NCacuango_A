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
public class VuelosAvion {
  
    //Metodo de clase de salida
    
   public static void pasajero(){
       System.out.println("El pasajero puede subir al avion");
   }
   //Metodo de clase de retorno
   public static String destino(){
      String d="El destino final del vuelo es Canada";
      return d;
   }
   //Metodo de Instancia (Objeto)de salida 
   
   public void cantidadPasajeros(){
       System.out.println("Maximo de capacidad en el avion es de 500 pasajeros");
   }
   
   //Metodo de instacia(Objeto)de retorno
   public boolean despegue(){
       return true;
       
   }
}
