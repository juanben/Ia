/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Agentes;

import Comportamientos.CSanMartin;
import jade.core.Agent;

/**
 *
 * @author juan
 */
public class SanMartin  extends Agent
{

    @Override
    protected void setup() {
        super.setup(); //To change body of generated methods, choose Tools | Templates.
          
        CSanMartin c1= new CSanMartin();
        addBehaviour(c1);
    }

    @Override
    protected void takeDown() {
        super.takeDown(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
