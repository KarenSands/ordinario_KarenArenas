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
    public int horaMin;
    public int horaMax;
    public int tipoMsj;
    
    public Gerente(String nombre, int horaMin, int horaMax, int tipoMsj) {
        this.nombre = nombre;
        this.horaMin = horaMin;
        this.horaMax = horaMax;
        this.tipoMsj = tipoMsj;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void alertarCelular(int cant){
        System.out.println("Mensaje a celular---> Se realizo una venta por la cantidad de: " + cant);
    }
    public void alertarCorreo(int cant){
        System.out.println("Correo---> Se realizo una venta por la cantidad de: " + cant);
    }

    @Override
    public void update(int cant, int tiempo) {
        if(cant>this.notificacion){
            if(tiempo>this.horaMin && tiempo<this.horaMax){
                if(this.tipoMsj==0){
                    alertarCelular(cant);
                }else if(this.tipoMsj==1){
                    alertarCorreo(cant);
                }
            }
        }
    }
    
    public void setNotification(int i){
        this.notificacion = i;
    }
}