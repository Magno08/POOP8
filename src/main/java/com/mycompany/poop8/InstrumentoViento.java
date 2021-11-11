/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.poop8;

/**
 *
 * @author Magno
 */
public class InstrumentoViento extends Object implements InstrumentoMusical{

    public InstrumentoViento() {
    }

    
    
    @Override
    public void tocar() {
        System.out.println("Tocando...");
    }

    @Override
    public void afinar() {
        System.out.println("Afinando...");
    }

    @Override
    public String tipoInstrumento() {
       return "Instrumento viento";
    }

    @Override
    public String toString() {
        return "InstrumentoViento{" + '}';
    }
    
    
    
}
