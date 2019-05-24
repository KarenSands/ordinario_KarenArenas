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
public class Cliente implements PersonaVieja{
    
        public String completeName;

    public Cliente() {
        this.completeName = "Karen Arenas";
    }

    public Cliente(String completeName) {
        this.completeName = completeName;
    }

    public String nombreC(){
        return completeName;
    }

}
