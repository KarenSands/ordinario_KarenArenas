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
public class AdapterPersona implements PersonaNueva{
    
    public Cliente personaVieja;

    public AdapterPersona(PersonaVieja personaNueva) {
        this.personaVieja = (Cliente) personaNueva;
    }
    
//    @Override
//    public String nombreC() {
//        String nombreCom=personaNueva.nombre() + " " + personaNueva.surname;
//        return nombreCom;
//    }
//
//    @Override
//    public String edad() {
//        String age = personaNueva.fecha();
//        return age;
//    }

    @Override
    public String nombre() {
        String nombreCom = personaVieja.nombreC();
        String[] nombres = nombreCom.split(" ");
        String name= nombres[0];
        return name;
    }

    @Override
    public String apellido() {
        String nombreCom = personaVieja.nombreC();
        String[] nombres = nombreCom.split(" ");
        String surname= nombres[1];
        return surname;
    }
}
