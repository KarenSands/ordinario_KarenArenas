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
public class SageController {
    public static void main(String[] args) {
        
        Cliente v1 = new Cliente("Cliente1");
        Cliente v2 = new Cliente("Cliente1");
        Gerente p1 = new Gerente("Karen",5,16,1);
        Gerente p2 = new Gerente("Felipe",5,19,0);
        v1.addObserverToList(p1);
        v2.addObserverToList(p2);
        
        p1.setNotification(30);
        p2.setNotification(60);
        
        
        v1.sell(31);
        v1.sell(29);
        v2.sell(69);
        
    }
}
