/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comportamientos;

import jade.core.AID;
import jade.core.behaviours.Behaviour;
import jade.lang.acl.ACLMessage;

/**
 *
 * @author juan
 */
public class CRioCoca extends Behaviour{

    @Override
    public void action() {
    	
    	AID BacaOrtiz=new AID();
    	BacaOrtiz.setLocalName("BacaOrtiz");

    	AID Bellavista=new AID();
    	Bellavista.setLocalName("Bellavista");

    	AID Benalcazar=new AID();
    	Benalcazar.setLocalName("Benalcazar");

    	AID CasaCultura=new AID();
    	CasaCultura.setLocalName("CasaCultura");

    	AID EloyAlfaro=new AID();
    	EloyAlfaro.setLocalName("EloyAlfaro");

    	AID EugenioEspejo=new AID();
    	EugenioEspejo.setLocalName("EugenioEspejo");

    	AID GaloPlaza=new AID();
    	GaloPlaza.setLocalName("GaloPlaza");

    	AID JipiJapa=new AID();
    	JipiJapa.setLocalName("JipiJapa");

    	AID LaPaz=new AID();
    	LaPaz.setLocalName("LaPaz");

    	AID LosSauses=new AID();
    	LosSauses.setLocalName("LosSauses");

    	AID ManuelaCanizares=new AID();
    	ManuelaCanizares.setLocalName("ManuelaCanizares");

    	AID MarinCentral=new AID();
    	MarinCentral.setLocalName("MarinCentral");

    	AID MarinPlayon=new AID();
    	MarinPlayon.setLocalName("MarinPlayon");

    	AID NacionesUnidas=new AID();
    	NacionesUnidas.setLocalName("NacionesUnidas");

    	AID Orellana=new AID();
    	Orellana.setLocalName("Orellana");

    	AID RioCoca=new AID();
    	RioCoca.setLocalName("RioCoca");

    	AID SanMartin=new AID();
    	SanMartin.setLocalName("SanMartin");

    	AID SimonBolivar=new AID();
    	SimonBolivar.setLocalName("SimonBolivar");

    	AID Mayo24=new AID();
    	Mayo24.setLocalName("Mayo24");


    	ACLMessage mensajeBacaOrtiz= new ACLMessage(ACLMessage.REQUEST);
    	mensajeBacaOrtiz.setSender(getAgent().getAID());
    	mensajeBacaOrtiz.setLanguage("Español");
    	mensajeBacaOrtiz.addReceiver(BacaOrtiz);
    	mensajeBacaOrtiz.setContent("Enviame informacion");

    		System.out.println("Comunicación Agente BacaOrtiz");
    	System.out.println(getAgent().getLocalName() +": Enviando mensaje");
    	System.out.println(mensajeBacaOrtiz);

    	getAgent().send(mensajeBacaOrtiz);



    	ACLMessage respuestaBacaOrtiz = getAgent().blockingReceive();
    	if (respuestaBacaOrtiz!= null)
    	{
    	    System.out.println(getAgent().getLocalName() + ": acaba de recibir el siguiente mensaje: ");
    	    System.out.println(respuestaBacaOrtiz);

    	    }
    	ACLMessage mensajeBellavista= new ACLMessage(ACLMessage.REQUEST);
    	mensajeBellavista.setSender(getAgent().getAID());
    	mensajeBellavista.setLanguage("Español");
    	mensajeBellavista.addReceiver(Bellavista);
    	mensajeBellavista.setContent("Enviame informacion");

    		System.out.println("Comunicación Agente Bellavista");
    	System.out.println(getAgent().getLocalName() +": Enviando mensaje");
    	System.out.println(mensajeBellavista);

    	getAgent().send(mensajeBellavista);



    	ACLMessage respuestaBellavista = getAgent().blockingReceive();
    	if (respuestaBellavista!= null)
    	{
    	    System.out.println(getAgent().getLocalName() + ": acaba de recibir el siguiente mensaje: ");
    	    System.out.println(respuestaBellavista);

    	    }
    	ACLMessage mensajeBenalcazar= new ACLMessage(ACLMessage.REQUEST);
    	mensajeBenalcazar.setSender(getAgent().getAID());
    	mensajeBenalcazar.setLanguage("Español");
    	mensajeBenalcazar.addReceiver(Benalcazar);
    	mensajeBenalcazar.setContent("Enviame informacion");

    		System.out.println("Comunicación Agente Benalcazar");
    	System.out.println(getAgent().getLocalName() +": Enviando mensaje");
    	System.out.println(mensajeBenalcazar);

    	getAgent().send(mensajeBenalcazar);



    	ACLMessage respuestaBenalcazar = getAgent().blockingReceive();
    	if (respuestaBenalcazar!= null)
    	{
    	    System.out.println(getAgent().getLocalName() + ": acaba de recibir el siguiente mensaje: ");
    	    System.out.println(respuestaBenalcazar);

    	    }
    	ACLMessage mensajeCasaCultura= new ACLMessage(ACLMessage.REQUEST);
    	mensajeCasaCultura.setSender(getAgent().getAID());
    	mensajeCasaCultura.setLanguage("Español");
    	mensajeCasaCultura.addReceiver(CasaCultura);
    	mensajeCasaCultura.setContent("Enviame informacion");

    		System.out.println("Comunicación Agente CasaCultura");
    	System.out.println(getAgent().getLocalName() +": Enviando mensaje");
    	System.out.println(mensajeCasaCultura);

    	getAgent().send(mensajeCasaCultura);



    	ACLMessage respuestaCasaCultura = getAgent().blockingReceive();
    	if (respuestaCasaCultura!= null)
    	{
    	    System.out.println(getAgent().getLocalName() + ": acaba de recibir el siguiente mensaje: ");
    	    System.out.println(respuestaCasaCultura);

    	    }
    	ACLMessage mensajeEloyAlfaro= new ACLMessage(ACLMessage.REQUEST);
    	mensajeEloyAlfaro.setSender(getAgent().getAID());
    	mensajeEloyAlfaro.setLanguage("Español");
    	mensajeEloyAlfaro.addReceiver(EloyAlfaro);
    	mensajeEloyAlfaro.setContent("Enviame informacion");

    		System.out.println("Comunicación Agente EloyAlfaro");
    	System.out.println(getAgent().getLocalName() +": Enviando mensaje");
    	System.out.println(mensajeEloyAlfaro);

    	getAgent().send(mensajeEloyAlfaro);



    	ACLMessage respuestaEloyAlfaro = getAgent().blockingReceive();
    	if (respuestaEloyAlfaro!= null)
    	{
    	    System.out.println(getAgent().getLocalName() + ": acaba de recibir el siguiente mensaje: ");
    	    System.out.println(respuestaEloyAlfaro);

    	    }
    	ACLMessage mensajeEugenioEspejo= new ACLMessage(ACLMessage.REQUEST);
    	mensajeEugenioEspejo.setSender(getAgent().getAID());
    	mensajeEugenioEspejo.setLanguage("Español");
    	mensajeEugenioEspejo.addReceiver(EugenioEspejo);
    	mensajeEugenioEspejo.setContent("Enviame informacion");

    		System.out.println("Comunicación Agente EugenioEspejo");
    	System.out.println(getAgent().getLocalName() +": Enviando mensaje");
    	System.out.println(mensajeEugenioEspejo);

    	getAgent().send(mensajeEugenioEspejo);



    	ACLMessage respuestaEugenioEspejo = getAgent().blockingReceive();
    	if (respuestaEugenioEspejo!= null)
    	{
    	    System.out.println(getAgent().getLocalName() + ": acaba de recibir el siguiente mensaje: ");
    	    System.out.println(respuestaEugenioEspejo);

    	    }
    	ACLMessage mensajeGaloPlaza= new ACLMessage(ACLMessage.REQUEST);
    	mensajeGaloPlaza.setSender(getAgent().getAID());
    	mensajeGaloPlaza.setLanguage("Español");
    	mensajeGaloPlaza.addReceiver(GaloPlaza);
    	mensajeGaloPlaza.setContent("Enviame informacion");

    		System.out.println("Comunicación Agente GaloPlaza");
    	System.out.println(getAgent().getLocalName() +": Enviando mensaje");
    	System.out.println(mensajeGaloPlaza);

    	getAgent().send(mensajeGaloPlaza);



    	ACLMessage respuestaGaloPlaza = getAgent().blockingReceive();
    	if (respuestaGaloPlaza!= null)
    	{
    	    System.out.println(getAgent().getLocalName() + ": acaba de recibir el siguiente mensaje: ");
    	    System.out.println(respuestaGaloPlaza);

    	    }
    	ACLMessage mensajeJipiJapa= new ACLMessage(ACLMessage.REQUEST);
    	mensajeJipiJapa.setSender(getAgent().getAID());
    	mensajeJipiJapa.setLanguage("Español");
    	mensajeJipiJapa.addReceiver(JipiJapa);
    	mensajeJipiJapa.setContent("Enviame informacion");

    		System.out.println("Comunicación Agente JipiJapa");
    	System.out.println(getAgent().getLocalName() +": Enviando mensaje");
    	System.out.println(mensajeJipiJapa);

    	getAgent().send(mensajeJipiJapa);



    	ACLMessage respuestaJipiJapa = getAgent().blockingReceive();
    	if (respuestaJipiJapa!= null)
    	{
    	    System.out.println(getAgent().getLocalName() + ": acaba de recibir el siguiente mensaje: ");
    	    System.out.println(respuestaJipiJapa);

    	    }
    	ACLMessage mensajeLaPaz= new ACLMessage(ACLMessage.REQUEST);
    	mensajeLaPaz.setSender(getAgent().getAID());
    	mensajeLaPaz.setLanguage("Español");
    	mensajeLaPaz.addReceiver(LaPaz);
    	mensajeLaPaz.setContent("Enviame informacion");

    		System.out.println("Comunicación Agente LaPaz");
    	System.out.println(getAgent().getLocalName() +": Enviando mensaje");
    	System.out.println(mensajeLaPaz);

    	getAgent().send(mensajeLaPaz);



    	ACLMessage respuestaLaPaz = getAgent().blockingReceive();
    	if (respuestaLaPaz!= null)
    	{
    	    System.out.println(getAgent().getLocalName() + ": acaba de recibir el siguiente mensaje: ");
    	    System.out.println(respuestaLaPaz);

    	    }
    	ACLMessage mensajeLosSauses= new ACLMessage(ACLMessage.REQUEST);
    	mensajeLosSauses.setSender(getAgent().getAID());
    	mensajeLosSauses.setLanguage("Español");
    	mensajeLosSauses.addReceiver(LosSauses);
    	mensajeLosSauses.setContent("Enviame informacion");

    		System.out.println("Comunicación Agente LosSauses");
    	System.out.println(getAgent().getLocalName() +": Enviando mensaje");
    	System.out.println(mensajeLosSauses);

    	getAgent().send(mensajeLosSauses);



    	ACLMessage respuestaLosSauses = getAgent().blockingReceive();
    	if (respuestaLosSauses!= null)
    	{
    	    System.out.println(getAgent().getLocalName() + ": acaba de recibir el siguiente mensaje: ");
    	    System.out.println(respuestaLosSauses);

    	    }
    	ACLMessage mensajeManuelaCanizares= new ACLMessage(ACLMessage.REQUEST);
    	mensajeManuelaCanizares.setSender(getAgent().getAID());
    	mensajeManuelaCanizares.setLanguage("Español");
    	mensajeManuelaCanizares.addReceiver(ManuelaCanizares);
    	mensajeManuelaCanizares.setContent("Enviame informacion");

    		System.out.println("Comunicación Agente ManuelaCanizares");
    	System.out.println(getAgent().getLocalName() +": Enviando mensaje");
    	System.out.println(mensajeManuelaCanizares);

    	getAgent().send(mensajeManuelaCanizares);



    	ACLMessage respuestaManuelaCanizares = getAgent().blockingReceive();
    	if (respuestaManuelaCanizares!= null)
    	{
    	    System.out.println(getAgent().getLocalName() + ": acaba de recibir el siguiente mensaje: ");
    	    System.out.println(respuestaManuelaCanizares);

    	    }
    	ACLMessage mensajeMarinCentral= new ACLMessage(ACLMessage.REQUEST);
    	mensajeMarinCentral.setSender(getAgent().getAID());
    	mensajeMarinCentral.setLanguage("Español");
    	mensajeMarinCentral.addReceiver(MarinCentral);
    	mensajeMarinCentral.setContent("Enviame informacion");

    		System.out.println("Comunicación Agente MarinCentral");
    	System.out.println(getAgent().getLocalName() +": Enviando mensaje");
    	System.out.println(mensajeMarinCentral);

    	getAgent().send(mensajeMarinCentral);



    	ACLMessage respuestaMarinCentral = getAgent().blockingReceive();
    	if (respuestaMarinCentral!= null)
    	{
    	    System.out.println(getAgent().getLocalName() + ": acaba de recibir el siguiente mensaje: ");
    	    System.out.println(respuestaMarinCentral);

    	    }
    	ACLMessage mensajeMarinPlayon= new ACLMessage(ACLMessage.REQUEST);
    	mensajeMarinPlayon.setSender(getAgent().getAID());
    	mensajeMarinPlayon.setLanguage("Español");
    	mensajeMarinPlayon.addReceiver(MarinPlayon);
    	mensajeMarinPlayon.setContent("Enviame informacion");

    		System.out.println("Comunicación Agente MarinPlayon");
    	System.out.println(getAgent().getLocalName() +": Enviando mensaje");
    	System.out.println(mensajeMarinPlayon);

    	getAgent().send(mensajeMarinPlayon);



    	ACLMessage respuestaMarinPlayon = getAgent().blockingReceive();
    	if (respuestaMarinPlayon!= null)
    	{
    	    System.out.println(getAgent().getLocalName() + ": acaba de recibir el siguiente mensaje: ");
    	    System.out.println(respuestaMarinPlayon);

    	    }
    	ACLMessage mensajeNacionesUnidas= new ACLMessage(ACLMessage.REQUEST);
    	mensajeNacionesUnidas.setSender(getAgent().getAID());
    	mensajeNacionesUnidas.setLanguage("Español");
    	mensajeNacionesUnidas.addReceiver(NacionesUnidas);
    	mensajeNacionesUnidas.setContent("Enviame informacion");

    		System.out.println("Comunicación Agente NacionesUnidas");
    	System.out.println(getAgent().getLocalName() +": Enviando mensaje");
    	System.out.println(mensajeNacionesUnidas);

    	getAgent().send(mensajeNacionesUnidas);



    	ACLMessage respuestaNacionesUnidas = getAgent().blockingReceive();
    	if (respuestaNacionesUnidas!= null)
    	{
    	    System.out.println(getAgent().getLocalName() + ": acaba de recibir el siguiente mensaje: ");
    	    System.out.println(respuestaNacionesUnidas);

    	    }
    	ACLMessage mensajeOrellana= new ACLMessage(ACLMessage.REQUEST);
    	mensajeOrellana.setSender(getAgent().getAID());
    	mensajeOrellana.setLanguage("Español");
    	mensajeOrellana.addReceiver(Orellana);
    	mensajeOrellana.setContent("Enviame informacion");

    		System.out.println("Comunicación Agente Orellana");
    	System.out.println(getAgent().getLocalName() +": Enviando mensaje");
    	System.out.println(mensajeOrellana);

    	getAgent().send(mensajeOrellana);



    	ACLMessage respuestaOrellana = getAgent().blockingReceive();
    	if (respuestaOrellana!= null)
    	{
    	    System.out.println(getAgent().getLocalName() + ": acaba de recibir el siguiente mensaje: ");
    	    System.out.println(respuestaOrellana);

    	    }
    	
    	
    	
    	ACLMessage mensajeSanMartin= new ACLMessage(ACLMessage.REQUEST);
    	mensajeSanMartin.setSender(getAgent().getAID());
    	mensajeSanMartin.setLanguage("Español");
    	mensajeSanMartin.addReceiver(SanMartin);
    	mensajeSanMartin.setContent("Enviame informacion");

    		System.out.println("Comunicación Agente SanMartin");
    	System.out.println(getAgent().getLocalName() +": Enviando mensaje");
    	System.out.println(mensajeSanMartin);

    	getAgent().send(mensajeSanMartin);



    	ACLMessage respuestaSanMartin = getAgent().blockingReceive();
    	if (respuestaSanMartin!= null)
    	{
    	    System.out.println(getAgent().getLocalName() + ": acaba de recibir el siguiente mensaje: ");
    	    System.out.println(respuestaSanMartin);

    	    }
    	ACLMessage mensajeSimonBolivar= new ACLMessage(ACLMessage.REQUEST);
    	mensajeSimonBolivar.setSender(getAgent().getAID());
    	mensajeSimonBolivar.setLanguage("Español");
    	mensajeSimonBolivar.addReceiver(SimonBolivar);
    	mensajeSimonBolivar.setContent("Enviame informacion");

    		System.out.println("Comunicación Agente SimonBolivar");
    	System.out.println(getAgent().getLocalName() +": Enviando mensaje");
    	System.out.println(mensajeSimonBolivar);

    	getAgent().send(mensajeSimonBolivar);



    	ACLMessage respuestaSimonBolivar = getAgent().blockingReceive();
    	if (respuestaSimonBolivar!= null)
    	{
    	    System.out.println(getAgent().getLocalName() + ": acaba de recibir el siguiente mensaje: ");
    	    System.out.println(respuestaSimonBolivar);

    	    }
    	ACLMessage mensajeMayo24= new ACLMessage(ACLMessage.REQUEST);
    	mensajeMayo24.setSender(getAgent().getAID());
    	mensajeMayo24.setLanguage("Español");
    	mensajeMayo24.addReceiver(Mayo24);
    	mensajeMayo24.setContent("Enviame informacion");

    		System.out.println("Comunicación Agente Mayo24");
    	System.out.println(getAgent().getLocalName() +": Enviando mensaje");
    	System.out.println(mensajeMayo24);

    	getAgent().send(mensajeMayo24);



    	ACLMessage respuestaMayo24 = getAgent().blockingReceive();
    	if (respuestaMayo24!= null)
    	{
    	    System.out.println(getAgent().getLocalName() + ": acaba de recibir el siguiente mensaje: ");
    	    System.out.println(respuestaMayo24);

    	    }
		
		
		
    	
    	
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean done() {
    	return false;
    	//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
