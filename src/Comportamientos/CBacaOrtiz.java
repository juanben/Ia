/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comportamientos;

import jade.core.behaviours.Behaviour;

/**
 *
 * @author juan
 */
public class CBacaOrtiz extends Behaviour{

    @Override
    public void action() 
    {
        System.out.println("hola baca ortiz");
    }

    @Override
    public boolean done() {
return false;    }
    
}
