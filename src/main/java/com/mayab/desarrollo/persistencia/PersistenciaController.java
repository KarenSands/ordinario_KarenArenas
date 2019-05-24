/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.desarrollo.persistencia;

/**
 *
 * @author karen
 */
public class PersistenciaController {
    public static void main(String[] args) {
        
        BaseDatos baseA = new BaseDatosA("Select FROM * WHERE id = 10;");
        BaseDatos baseB = new BaseDatosB("INSERT FROM id VALUES(10);");
        BaseDatos baseC = new BaseDatosC("DELETE from id where id = 1;");
        
        baseA.update(baseA.sentences);
        
        baseB.update(baseB.sentences);
        
        baseC.update(baseC.sentences);
    }    
}

