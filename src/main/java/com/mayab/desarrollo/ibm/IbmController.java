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
public class IbmController {
    public static void main(String[] args) {
    
        PersonaVieja pVieja1 = new Cliente();
        PersonaNueva pNueva1 = new Hacienda();
        PersonaNueva pVieja2 = new AdapterPersona(pVieja1);
        
        System.out.println("Cliente: ");
        System.out.println(pVieja1.nombreC());
        
        System.out.println("Hacienda: ");
        System.out.println(pNueva1.nombre());
        System.out.println(pNueva1.apellido());
        
        System.out.println("Adapter: ");
        System.out.println(pVieja2.nombre());
        System.out.println(pVieja2.apellido());
    }
}
