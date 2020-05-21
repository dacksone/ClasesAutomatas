/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

import java.awt.Graphics;

/**
 *
 * @author Juan Rodriguez
 */
public class pila 
{
    
    char a[];
    int t;
    int MAXIMO = 10;
    
    pila()
    {
       t=0;
       a= new char[10];
    }
    
    void initpila ()
    {
        t=0;
    }
    
    boolean pilavacia()
    {
        return t==0;
    }
    
    int inspila(char objeto)
    {
        if (t==MAXIMO -1)
            return -1;
        else
        {
            t++;
            a[t-1]=objeto;
        }
        return 1;
    }
    
    char retirarpila()
    {
        if (pilavacia())
            return '#';
        else 
        {
            t=t-1;
            return a[t];
        }
    }
    
    void imprimir(Graphics g, int fila)
    {
        String cad;
        int col = 20;
        for (int i = 0; i < t; i++)
        {
            g.drawString(""+a[i], col, fila);
            col = col + 20;
            
        }
    }
    
   
    
    public static void main(String [] args)
    {
        
        
        
       
        
    }
    
}
