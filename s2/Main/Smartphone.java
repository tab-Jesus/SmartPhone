
package co.edu.udec.s2.Main;

/**
 *: Smartphone (Marca del smartphone
 * , Modelo del smartphone
 * , Sistema operativo del smartphone)
 * @author JESUS DAVID
 */
public class Smartphone {
    
    String marca;
    String modelo;
    String sistemaOperativo;
    
 
  public Smartphone ( String marca, String modelo, String sistemaOperativo){
      
      
      this.marca = marca; 
      this.modelo = modelo;
      this.sistemaOperativo =  sistemaOperativo;
      
      
  } 

   public boolean ValidarModelo  (){
       
       
       return this.modelo != null && !this.modelo.isEmpty();
       
       
   }
  
public String getMarca (){
    
    return marca;
    
}
    
public void setMarca (String marca){
    
    this.marca = marca;
}


public String getModelo(){
    
    return modelo;
}

public void setModelo (String modelo){
    
    this.modelo = modelo;
    
}

public String getSistemaOperativo(){
    
    return sistemaOperativo;
    
}

public void setSistemaOperativo (String sistemaOperativo){
    
    this.sistemaOperativo = sistemaOperativo;
}


}




