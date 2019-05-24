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
public class BaseDatosB extends BaseDatos{
    
    public BaseDatosB(String s) {
        super(s);
    }

    @Override
    public boolean abrir() {
        return true;
    }

    @Override
    public void sentencia(String valor) {
       System.out.println(valor.toLowerCase());
    }

    @Override
    public void ejecutar() {
        System.out.println("Ejecutando");
    }
        
    
}