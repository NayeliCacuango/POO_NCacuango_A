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
public class Estudiantes {
    
    //metodo de clase de salida
    
    public static void MetodoSalidaA(){
        System.out.println("Los estudiantes retomaran las clases el mes de Septiembre");  
    }
    
    //metodo de clase de retorno
    
   public static String MetodoRetornoA(){
       String x= "Las clases empiezan a las 6:30am";
       return x;
   }
   //metodo de instacia (objeto) de salida
   
   public void salida(){
       System.out.println("El costo de la matricula es:");
   }
   
   //metodo de instacia (Objeto)de retorno
   
        public String retorno(){
            return "BIENVENIDOS";
        }
}
