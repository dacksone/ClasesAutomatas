/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

import java.applet.Applet;
import java.awt.Graphics;

/**
 *
 * @author Juan Rodriguez
 */
public class Ejercicio extends Applet {
    
    public void paint (Graphics g)
    {
        pila pil = new pila();
        pil.initpila();
        pil.inspila('A');
        pil.inspila('B');
        pil.inspila('C');
       
                
        pil.imprimir(g,50);
        pil.retirarpila();
        
        pil.imprimir(g,70);
         pil.inspila('D');
        pil.inspila('E');
        pil.inspila('F');
        pil.inspila('G');
        pil.imprimir(g,90);
        
    }
    
    
}
