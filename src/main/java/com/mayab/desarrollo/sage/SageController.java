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
        Gerente p1 = new Gerente("Karen");
        v1.addObserverToList(p1);
        
        p1.setNotification(30);
        
        v1.sell(29);
        v1.sell(50);
        v1.sell(100);
        
    }
}
