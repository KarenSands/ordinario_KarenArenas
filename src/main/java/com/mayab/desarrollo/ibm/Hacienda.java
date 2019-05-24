/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.desarrollo.ibm;


/**
 *
 * @author karen
 */
public class Hacienda implements PersonaNueva{
 
    public String name;
    public String surname;
    
    public Hacienda() {
        this.name = "Karen";
        this.surname = "Arenas";
    }

    public Hacienda(String name, String surname) {
        this.name = name;
        this.surname = surname;
    } 

    
    @Override
    public String nombre() {
        return name;
    }

    
    @Override
    public String apellido() {
        return surname;
    }
}

