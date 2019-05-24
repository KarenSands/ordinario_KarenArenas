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
public interface Observable {
    public void addObserverToList(Gerente gerente);
    public void deleteObserverFromList(Gerente gerente);
    public void NotifyObservers(int x);

}
