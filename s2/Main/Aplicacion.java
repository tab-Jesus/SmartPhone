/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.s2.Main;

/**
 *Aplicación (Nombre de la aplicación,
 * Tipo de aplicación, 
 * Desarrollador de la aplicación)
 * @author JESUS DAVID
 */
public class Aplicacion {
    
    String nombre;
    String tipo;
    String desarrollador;
    
    public Aplicacion(String nombre, String desarrolador , String tipo){
        
        
        
           this.desarrollador= desarrollador;
           this.nombre = nombre;
           this.tipo = tipo;
                
                
        
    }
    
    
    public boolean validarNombre(){
        
        
        return  this.nombre != null && !this.nombre.isEmpty();
    }
    
    
}
