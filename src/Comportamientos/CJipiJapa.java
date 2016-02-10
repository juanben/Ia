/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comportamientos;

import Sensores.SNumGente;
import jade.core.behaviours.Behaviour;
import jade.lang.acl.ACLMessage;

/**
 *
 * @author juan
 */
public class CJipiJapa extends Behaviour
{

    @Override
    public void action() {
    	
    	SNumGente numGente=new SNumGente(2);
    	
    	ACLMessage mensajeRioCoca = getAgent().blockingReceive();
    	if (mensajeRioCoca!= null)
    	{
    	    System.out.println(getAgent().getLocalName() + ": acaba de recibir el siguiente mensaje: ");
    	    System.out.println(mensajeRioCoca);

    	    }


    	ACLMessage respuestaRioCoca = new ACLMessage( ACLMessage.INFORM );
    	respuestaRioCoca.setSender(getAgent().getAID());
    	respuestaRioCoca.setLanguage(mensajeRioCoca.getLanguage());
    	respuestaRioCoca.addReceiver( mensajeRioCoca.getSender() );
    	respuestaRioCoca.setContent(String.valueOf(numGente.getVar()));
    	System.out.println(getAgent().getLocalName() +": Enviando contestacion");
    	System.out.println(respuestaRioCoca);
    	getAgent().send(respuestaRioCoca);
    	
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean done() {
    	return false;
    	//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
