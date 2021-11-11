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
public class Main {
    public static void main(String[] args) {
        System.out.println("########Objetos se comportan como superclases##########");
        PoligonoC poligonoC = new PoligonoC();
        //Poligono puede comportarse como su superclase
        Object objeto = poligonoC;
        System.out.println(poligonoC);
        System.out.println(objeto);
        
        poligonoC = new TrianguloC();
        System.out.println(poligonoC);
        poligonoC = new CuadrilateroC();
        System.out.println(poligonoC.toString());
        
        PoligonoC poli = new CuadrilateroC();
        System.out.println(poli.toString());
       // poli.setBase(5.5f); Método no definido
       // No puede sobreescribirse
       
        System.out.println("########Clases Abstractas##########");
        
        // PoligonoA polA = new PoligonoA(); No se definen de esta manera
       PoligonoA polA = new TrianguloA() {};
       System.out.println(polA);
       polA = new CuadrilateroA();
        System.out.println(polA);
        System.out.println("#######Interfaces##########");
        //<Podemos crear referencia, pero no implementarla
        InstrumentoMusical instrumento;
        //InstrumentoMusical instru = new InstrumentoMusical();
        
        instrumento = new Flauta();
        instrumento.tocar();
        System.out.println(instrumento.tipoInstrumento());
        System.out.println(instrumento);
        
       
        
    }
    
}
