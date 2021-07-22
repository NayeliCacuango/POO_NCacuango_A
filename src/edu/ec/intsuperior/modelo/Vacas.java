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
public class Vacas {
    //Metodo de clase de salida
    
   public static void razas(){
       System.out.println("simmental, angus, holstein");
   }
   
   //Metodo de clase de retorno
   public static String habitat(){
       String h="Las vacas pueden vivir bien con el ser humano en un lugar en el que tengan"
               + "buena alimantacion y bajo el cuidado del ser humano";
       return h;
   }
   
   //Metodo de Instancia(Objeto) de salida
   public void producenAlimento(){
       System.out.println("Producen leche, carne, queso, manjar");
   }
   
   //Metodo de Instancia(Objeto)de retorno
   public String valor(){
     String a="La edad de las vacas puede variar, pueden vivir"
             + "desde los 18-22 anios";
     return a;
   }
      
}
