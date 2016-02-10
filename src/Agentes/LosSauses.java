/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Agentes;

import Comportamientos.CLosSauses;
import jade.core.Agent;

/**
 *
 * @author juan
 */
public class LosSauses extends Agent
{

    @Override
    protected void setup() {
        super.setup(); //To change body of generated methods, choose Tools | Templates.  
        CLosSauses c1= new CLosSauses();
        addBehaviour(c1);
    }

    @Override
    protected void takeDown() {
        super.takeDown(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
