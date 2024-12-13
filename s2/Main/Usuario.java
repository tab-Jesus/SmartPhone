
package co.edu.udec.s2.Main;

/**
 *
 * @author JESUS DAVID
 * Usuario (Nombre del usuario, 
 * Número de teléfono del usuario,
 * Correo del usuario) 
 */
public class Usuario {
    
    String nombre;
    String telefono;
    String email;
    
    public Usuario (String nombre, String telefono, String email){
        
       this.email = email;
       this.nombre = nombre;
       this.telefono = telefono;
    }
    
    
    public String getTelefono (){
        
        return telefono;
        
    }
   
    public boolean validarTelefono (){
        
        return this.telefono.length() == 10;
    }
    
    
    public boolean validarEmail(){
        
        return this.email.contains("@");
    }

}
