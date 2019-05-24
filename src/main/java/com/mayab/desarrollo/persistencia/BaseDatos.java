/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.desarrollo.persistencia;

/**
 *
 * @author karen
 */
public abstract class BaseDatos {

    public String sentences;
    
    public BaseDatos(String sent){
        sentences = sent;
    }
    final void update(String valor){
        
        if(abrir()){
            sentencia(valor);
            ejecutar();
        }
            
    }
    public abstract boolean abrir();
    
    public abstract void sentencia(String valor);
    
    public abstract void ejecutar();
    
}
