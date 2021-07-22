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
public class Casa {
   
    //metodo de clase de salida
public static void cuartos(){
    System.out.println("La casa cuenta con 5 habitaciones");
} 

//Metodo de clase de retorno
public static String pisos(){
   String p= "La casa es de 2 pisos" ;
   return p;
}
//Metodo de Instancia (Objeto)de salida 
public void salaEstar(){
    System.out.println("La casa cuanta con 2 salas de estar");
}
//Metodo de instancia (Objeto)de retorno
public String valor(){
    String t="El valor de la casa esta a $50100";
    return t;
}
}
