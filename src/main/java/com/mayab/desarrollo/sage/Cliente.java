/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.desarrollo.sage;

import java.util.ArrayList;

/**
 *
 * @author karen
 */
public class Cliente implements Observable{
    
    String nombre;
    
    public ArrayList<Gerente> gerente= new ArrayList<Gerente>();

    public Cliente(String n) {
        this.nombre = n;
    }
    
    @Override
    public void addObserverToList(Gerente p){
        gerente.add(p);
        System.out.println("Observer " + p.getNombre() + " va ser observado.");
    }
    
    @Override
    public void deleteObserverFromList(Gerente gerente){
        this.gerente.remove(gerente);
        System.out.println("Observer " + gerente.getNombre() + " ya no va a ser observado.");
    }
    
    @Override
    public void NotifyObservers(int x){
        for(Gerente p: gerente){
            p.update(x);
        }
    }
    
    public void sell(int i){
        NotifyObservers(i);
    }
}
