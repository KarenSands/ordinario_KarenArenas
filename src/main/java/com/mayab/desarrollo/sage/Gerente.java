/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.desarrollo.sage;

/**
 *
 * @author karen
 */
public class Gerente implements Observer{
    public String nombre;
    public int notificacion;
    
    public Gerente(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void alertar(int cant){
        System.out.println("Se realizo una venta por la cantidad de: " + cant);
    }

    @Override
    public void update(int cant) {
        if(cant>this.notificacion)
            alertar(cant);
    }
    
    public void setNotification(int i){
        this.notificacion = i;
    }
}