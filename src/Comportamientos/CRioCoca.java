/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comportamientos;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.jgap.Configuration;

import Actuadores.AireAcond;
import Actuadores.EnviarBus;
import Genetica.TestEstacionesFitness;
import Sensores.SNumGente;
import Sensores.STemperatura;
import jade.core.AID;
import jade.core.behaviours.Behaviour;
import jade.lang.acl.ACLMessage;

/**
 *
 * @author juan
 */
public class CRioCoca extends Behaviour{

	 public static int rioCoca;
	 public static int BacaOrtiz1;
	 public static int Bellavista1;
	 public static int Benalcazar1;
	 public static int CasaCultura1;
	 public static int EloyAlfaro1;
	 public static int EugenioEspejo1;
	 public static int GaloPlaza1;
	 public static int JipiJapa1;
	 public static int LaPaz1;
	 public static int LosSauces1;
	 public static int ManuelaCanizares1;
	 public static int MarinCentral1;
	 public static int MarinPlayon1;
	 public static int Mayo241;
	 public static int NacionesUnidas1;
	 public static int Orellana1;
	 public static int SanMartin1;
	 public static int SimonBolivar1;

     
     
	
    @Override
    public void action() 
    {
    	
    	
    	
        //Declaracion de variables
    	SNumGente numGente=new SNumGente(1);
        STemperatura sense = new STemperatura();
        
    	AireAcond vent = new AireAcond();
    	EnviarBus env = new EnviarBus();
        rioCoca = numGente.getVar();
        if(sense.getVar()>20)
        {
            vent.encender();
        }
        else 
        {
            if(sense.getVar()<13)
            {
                vent.apagar();
            }
        }
        System.out.println(sense.toString());
        System.out.println(vent.toString());
       
        
        
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
    	mensajeBacaOrtiz.setLanguage("Espanol");
    	mensajeBacaOrtiz.addReceiver(BacaOrtiz);
    	mensajeBacaOrtiz.setContent("Enviame informacion");

        System.out.println("\nComunicacion Agente BacaOrtiz");
    	System.out.println(getAgent().getLocalName() +": Enviando mensaje");
    	System.out.println(mensajeBacaOrtiz);

    	getAgent().send(mensajeBacaOrtiz);



    	ACLMessage respuestaBacaOrtiz = getAgent().blockingReceive();
    	if (respuestaBacaOrtiz!= null)
    	{
    	    System.out.println(getAgent().getLocalName() + ": acaba de recibir el siguiente mensaje: ");
    	    System.out.println(respuestaBacaOrtiz);            
            BacaOrtiz1 =Integer.parseInt(respuestaBacaOrtiz.getContent());
            
    	}
    	ACLMessage mensajeBellavista= new ACLMessage(ACLMessage.REQUEST);
    	mensajeBellavista.setSender(getAgent().getAID());
    	mensajeBellavista.setLanguage("Espanol");
    	mensajeBellavista.addReceiver(Bellavista);
    	mensajeBellavista.setContent("Enviame informacion");

    		System.out.println("\nComunicacion Agente Bellavista");
    	System.out.println(getAgent().getLocalName() +": Enviando mensaje");
    	System.out.println(mensajeBellavista);

    	getAgent().send(mensajeBellavista);



    	ACLMessage respuestaBellavista = getAgent().blockingReceive();
    	if (respuestaBellavista!= null)
    	{
    	    System.out.println(getAgent().getLocalName() + ": acaba de recibir el siguiente mensaje: ");
    	    System.out.println(respuestaBellavista);
             Bellavista1 =Integer.parseInt(respuestaBellavista.getContent());

            
             
    	    }
    	ACLMessage mensajeBenalcazar= new ACLMessage(ACLMessage.REQUEST);
    	mensajeBenalcazar.setSender(getAgent().getAID());
    	mensajeBenalcazar.setLanguage("Espanol");
    	mensajeBenalcazar.addReceiver(Benalcazar);
    	mensajeBenalcazar.setContent("Enviame informacion");

    		System.out.println("\nComunicacion Agente Benalcazar");
    	System.out.println(getAgent().getLocalName() +": Enviando mensaje");
    	System.out.println(mensajeBenalcazar);

    	getAgent().send(mensajeBenalcazar);



    	ACLMessage respuestaBenalcazar = getAgent().blockingReceive();
    	if (respuestaBenalcazar!= null)
    	{
    	    System.out.println(getAgent().getLocalName() + ": acaba de recibir el siguiente mensaje: ");
    	    System.out.println(respuestaBenalcazar);
             Benalcazar1 =Integer.parseInt(respuestaBenalcazar.getContent());
             
            

    	    }
    	ACLMessage mensajeCasaCultura= new ACLMessage(ACLMessage.REQUEST);
    	mensajeCasaCultura.setSender(getAgent().getAID());
    	mensajeCasaCultura.setLanguage("Espanol");
    	mensajeCasaCultura.addReceiver(CasaCultura);
    	mensajeCasaCultura.setContent("Enviame informacion");

    		System.out.println("\nComunicacion Agente CasaCultura");
    	System.out.println(getAgent().getLocalName() +": Enviando mensaje");
    	System.out.println(mensajeCasaCultura);

    	getAgent().send(mensajeCasaCultura);



    	ACLMessage respuestaCasaCultura = getAgent().blockingReceive();
    	if (respuestaCasaCultura!= null)
    	{
    	    System.out.println(getAgent().getLocalName() + ": acaba de recibir el siguiente mensaje: ");
     	    System.out.println(respuestaCasaCultura);
            CasaCultura1 =Integer.parseInt(respuestaCasaCultura.getContent());
    	    }
    	ACLMessage mensajeEloyAlfaro= new ACLMessage(ACLMessage.REQUEST);
    	mensajeEloyAlfaro.setSender(getAgent().getAID());
    	mensajeEloyAlfaro.setLanguage("Espanol");
    	mensajeEloyAlfaro.addReceiver(EloyAlfaro);
    	mensajeEloyAlfaro.setContent("Enviame informacion");

    		System.out.println("\nComunicacion Agente EloyAlfaro");
    	System.out.println(getAgent().getLocalName() +": Enviando mensaje");
    	System.out.println(mensajeEloyAlfaro);

    	getAgent().send(mensajeEloyAlfaro);



    	ACLMessage respuestaEloyAlfaro = getAgent().blockingReceive();
    	if (respuestaEloyAlfaro!= null)
    	{
    	    System.out.println(getAgent().getLocalName() + ": acaba de recibir el siguiente mensaje: ");
    	    System.out.println(respuestaEloyAlfaro);
            EloyAlfaro1 =Integer.parseInt(respuestaEloyAlfaro.getContent());

    	    }
    	ACLMessage mensajeEugenioEspejo= new ACLMessage(ACLMessage.REQUEST);
    	mensajeEugenioEspejo.setSender(getAgent().getAID());
    	mensajeEugenioEspejo.setLanguage("Espanol");
    	mensajeEugenioEspejo.addReceiver(EugenioEspejo);
    	mensajeEugenioEspejo.setContent("Enviame informacion");

    		System.out.println("\nComunicacion Agente EugenioEspejo");
    	System.out.println(getAgent().getLocalName() +": Enviando mensaje");
    	System.out.println(mensajeEugenioEspejo);

    	getAgent().send(mensajeEugenioEspejo);



    	ACLMessage respuestaEugenioEspejo = getAgent().blockingReceive();
    	if (respuestaEugenioEspejo!= null)
    	{
    	    System.out.println(getAgent().getLocalName() + ": acaba de recibir el siguiente mensaje: ");
    	    System.out.println(respuestaEugenioEspejo);
            EugenioEspejo1=Integer.parseInt(respuestaEugenioEspejo.getContent());

    	    }
    	ACLMessage mensajeGaloPlaza= new ACLMessage(ACLMessage.REQUEST);
    	mensajeGaloPlaza.setSender(getAgent().getAID());
    	mensajeGaloPlaza.setLanguage("Espanol");
    	mensajeGaloPlaza.addReceiver(GaloPlaza);
    	mensajeGaloPlaza.setContent("Enviame informacion");

    		System.out.println("\nComunicacion Agente GaloPlaza");
    	System.out.println(getAgent().getLocalName() +": Enviando mensaje");
    	System.out.println(mensajeGaloPlaza);

    	getAgent().send(mensajeGaloPlaza);



    	ACLMessage respuestaGaloPlaza = getAgent().blockingReceive();
    	if (respuestaGaloPlaza!= null)
    	{
    	    System.out.println(getAgent().getLocalName() + ": acaba de recibir el siguiente mensaje: ");
    	    System.out.println(respuestaGaloPlaza);
            GaloPlaza1 =Integer.parseInt(respuestaGaloPlaza.getContent());

    	    }
    	ACLMessage mensajeJipiJapa= new ACLMessage(ACLMessage.REQUEST);
    	mensajeJipiJapa.setSender(getAgent().getAID());
    	mensajeJipiJapa.setLanguage("Espanol");
    	mensajeJipiJapa.addReceiver(JipiJapa);
    	mensajeJipiJapa.setContent("Enviame informacion");

    		System.out.println("\nComunicacion Agente JipiJapa");
    	System.out.println(getAgent().getLocalName() +": Enviando mensaje");
    	System.out.println(mensajeJipiJapa);

    	getAgent().send(mensajeJipiJapa);



    	ACLMessage respuestaJipiJapa = getAgent().blockingReceive();
    	if (respuestaJipiJapa!= null)
    	{
    	    System.out.println(getAgent().getLocalName() + ": acaba de recibir el siguiente mensaje: ");
    	    System.out.println(respuestaJipiJapa);
            JipiJapa1 =Integer.parseInt(respuestaJipiJapa.getContent());

    	    }
    	ACLMessage mensajeLaPaz= new ACLMessage(ACLMessage.REQUEST);
    	mensajeLaPaz.setSender(getAgent().getAID());
    	mensajeLaPaz.setLanguage("Espanol");
    	mensajeLaPaz.addReceiver(LaPaz);
    	mensajeLaPaz.setContent("Enviame informacion");

    		System.out.println("\nComunicacion Agente LaPaz");
    	System.out.println(getAgent().getLocalName() +": Enviando mensaje");
    	System.out.println(mensajeLaPaz);

    	getAgent().send(mensajeLaPaz);



    	ACLMessage respuestaLaPaz = getAgent().blockingReceive();
    	if (respuestaLaPaz!= null)
    	{
    	    System.out.println(getAgent().getLocalName() + ": acaba de recibir el siguiente mensaje: ");
    	    System.out.println(respuestaLaPaz);
            LaPaz1 =Integer.parseInt(respuestaLaPaz.getContent());

    	    }
    	ACLMessage mensajeLosSauses= new ACLMessage(ACLMessage.REQUEST);
    	mensajeLosSauses.setSender(getAgent().getAID());
    	mensajeLosSauses.setLanguage("Espanol");
    	mensajeLosSauses.addReceiver(LosSauses);
    	mensajeLosSauses.setContent("Enviame informacion");

    		System.out.println("\nComunicacion Agente LosSauses");
    	System.out.println(getAgent().getLocalName() +": Enviando mensaje");
    	System.out.println(mensajeLosSauses);

    	getAgent().send(mensajeLosSauses);



    	ACLMessage respuestaLosSauses = getAgent().blockingReceive();
    	if (respuestaLosSauses!= null)
    	{
    	    System.out.println(getAgent().getLocalName() + ": acaba de recibir el siguiente mensaje: ");
    	    System.out.println(respuestaLosSauses);
            LosSauces1 =Integer.parseInt(respuestaLosSauses.getContent());
    	    }
    	ACLMessage mensajeManuelaCanizares= new ACLMessage(ACLMessage.REQUEST);
    	mensajeManuelaCanizares.setSender(getAgent().getAID());
    	mensajeManuelaCanizares.setLanguage("Espanol");
    	mensajeManuelaCanizares.addReceiver(ManuelaCanizares);
    	mensajeManuelaCanizares.setContent("Enviame informacion");

    		System.out.println("\nComunicacion Agente ManuelaCanizares");
    	System.out.println(getAgent().getLocalName() +": Enviando mensaje");
    	System.out.println(mensajeManuelaCanizares);

    	getAgent().send(mensajeManuelaCanizares);



    	ACLMessage respuestaManuelaCanizares = getAgent().blockingReceive();
    	if (respuestaManuelaCanizares!= null)
    	{
    	    System.out.println(getAgent().getLocalName() + ": acaba de recibir el siguiente mensaje: ");
    	    System.out.println(respuestaManuelaCanizares);
           ManuelaCanizares1 = Integer.parseInt(respuestaManuelaCanizares.getContent());

    	    }
    	ACLMessage mensajeMarinCentral= new ACLMessage(ACLMessage.REQUEST);
    	mensajeMarinCentral.setSender(getAgent().getAID());
    	mensajeMarinCentral.setLanguage("Espanol");
    	mensajeMarinCentral.addReceiver(MarinCentral);
    	mensajeMarinCentral.setContent("Enviame informacion");

    		System.out.println("\nComunicacion Agente MarinCentral");
    	System.out.println(getAgent().getLocalName() +": Enviando mensaje");
    	System.out.println(mensajeMarinCentral);

    	getAgent().send(mensajeMarinCentral);



    	ACLMessage respuestaMarinCentral = getAgent().blockingReceive();
    	if (respuestaMarinCentral!= null)
    	{
    	    System.out.println(getAgent().getLocalName() + ": acaba de recibir el siguiente mensaje: ");
    	    System.out.println(respuestaMarinCentral);
           MarinCentral1 =Integer.parseInt(respuestaMarinCentral.getContent());

    	    }
    	ACLMessage mensajeMarinPlayon= new ACLMessage(ACLMessage.REQUEST);
    	mensajeMarinPlayon.setSender(getAgent().getAID());
    	mensajeMarinPlayon.setLanguage("Espanol");
    	mensajeMarinPlayon.addReceiver(MarinPlayon);
    	mensajeMarinPlayon.setContent("Enviame informacion");

    		System.out.println("\nComunicacion Agente MarinPlayon");
    	System.out.println(getAgent().getLocalName() +": Enviando mensaje");
    	System.out.println(mensajeMarinPlayon);

    	getAgent().send(mensajeMarinPlayon);



    	ACLMessage respuestaMarinPlayon = getAgent().blockingReceive();
    	if (respuestaMarinPlayon!= null)
    	{
    	    System.out.println(getAgent().getLocalName() + ": acaba de recibir el siguiente mensaje: ");
    	    System.out.println(respuestaMarinPlayon);
            MarinPlayon1 =Integer.parseInt(respuestaMarinPlayon.getContent());

    	    }
    	ACLMessage mensajeNacionesUnidas= new ACLMessage(ACLMessage.REQUEST);
    	mensajeNacionesUnidas.setSender(getAgent().getAID());
    	mensajeNacionesUnidas.setLanguage("Espanol");
    	mensajeNacionesUnidas.addReceiver(NacionesUnidas);
    	mensajeNacionesUnidas.setContent("Enviame informacion");

    		System.out.println("\nComunicacion Agente NacionesUnidas");
    	System.out.println(getAgent().getLocalName() +": Enviando mensaje");
    	System.out.println(mensajeNacionesUnidas);

    	getAgent().send(mensajeNacionesUnidas);



    	ACLMessage respuestaNacionesUnidas = getAgent().blockingReceive();
    	if (respuestaNacionesUnidas!= null)
    	{
    	    System.out.println(getAgent().getLocalName() + ": acaba de recibir el siguiente mensaje: ");
    	    System.out.println(respuestaNacionesUnidas);
            NacionesUnidas1 = Integer.parseInt(respuestaNacionesUnidas.getContent());

    	    }
    	ACLMessage mensajeOrellana= new ACLMessage(ACLMessage.REQUEST);
    	mensajeOrellana.setSender(getAgent().getAID());
    	mensajeOrellana.setLanguage("Espanol");
    	mensajeOrellana.addReceiver(Orellana);
    	mensajeOrellana.setContent("Enviame informacion");

    		System.out.println("\nComunicacion Agente Orellana");
    	System.out.println(getAgent().getLocalName() +": Enviando mensaje");
    	System.out.println(mensajeOrellana);

    	getAgent().send(mensajeOrellana);



    	ACLMessage respuestaOrellana = getAgent().blockingReceive();
    	if (respuestaOrellana!= null)
    	{
    	    System.out.println(getAgent().getLocalName() + ": acaba de recibir el siguiente mensaje: ");
    	    System.out.println(respuestaOrellana);
           Orellana1 =Integer.parseInt(respuestaOrellana.getContent());

    	    }
    	
    	
    	
    	ACLMessage mensajeSanMartin= new ACLMessage(ACLMessage.REQUEST);
    	mensajeSanMartin.setSender(getAgent().getAID());
    	mensajeSanMartin.setLanguage("Espanol");
    	mensajeSanMartin.addReceiver(SanMartin);
    	mensajeSanMartin.setContent("Enviame informacion");

    		System.out.println("\nComunicacion Agente SanMartin");
    	System.out.println(getAgent().getLocalName() +": Enviando mensaje");
    	System.out.println(mensajeSanMartin);

    	getAgent().send(mensajeSanMartin);



    	ACLMessage respuestaSanMartin = getAgent().blockingReceive();
    	if (respuestaSanMartin!= null)
    	{
    	    System.out.println(getAgent().getLocalName() + ": acaba de recibir el siguiente mensaje: ");
    	    System.out.println(respuestaSanMartin);
           SanMartin1 =Integer.parseInt(respuestaSanMartin.getContent());
    	    }
    	ACLMessage mensajeSimonBolivar= new ACLMessage(ACLMessage.REQUEST);
    	mensajeSimonBolivar.setSender(getAgent().getAID());
    	mensajeSimonBolivar.setLanguage("Espanol");
    	mensajeSimonBolivar.addReceiver(SimonBolivar);
    	mensajeSimonBolivar.setContent("Enviame informacion");

    		System.out.println("\nComunicacion Agente SimonBolivar");
    	System.out.println(getAgent().getLocalName() +": Enviando mensaje");
    	System.out.println(mensajeSimonBolivar);

    	getAgent().send(mensajeSimonBolivar);



    	ACLMessage respuestaSimonBolivar = getAgent().blockingReceive();
    	if (respuestaSimonBolivar!= null)
    	{
    	    System.out.println(getAgent().getLocalName() + ": acaba de recibir el siguiente mensaje: ");
    	    System.out.println(respuestaSimonBolivar);
            SimonBolivar1 =Integer.parseInt(respuestaSimonBolivar.getContent());

    	    }
    	ACLMessage mensajeMayo24= new ACLMessage(ACLMessage.REQUEST);
    	mensajeMayo24.setSender(getAgent().getAID());
    	mensajeMayo24.setLanguage("Espanol");
    	mensajeMayo24.addReceiver(Mayo24);
    	mensajeMayo24.setContent("Enviame informacion");

    		System.out.println("\nComunicacion Agente Mayo24");
    	System.out.println(getAgent().getLocalName() +": Enviando mensaje");
    	System.out.println(mensajeMayo24);

    	getAgent().send(mensajeMayo24);



    	ACLMessage respuestaMayo24 = getAgent().blockingReceive();
    	if (respuestaMayo24!= null)
    	{
    	    System.out.println(getAgent().getLocalName() + ": acaba de recibir el siguiente mensaje: ");
    	    System.out.println(respuestaMayo24);
            Mayo241 =Integer.parseInt(respuestaMayo24.getContent());

    	    }
		
		
    	try {
    		TestEstacionesFitness test = new TestEstacionesFitness();
			test.initialize();
			test.testSelectFittestMovies();
			Configuration.reset();
			env.enviar();
		} catch (Exception ex) {
            Logger.getLogger(CRioCoca.class.getName()).log(Level.SEVERE, null, ex);
            env.noEnviar();
        }
        
    	System.out.println(env.toString());
    	
    	try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean done() {
    	return false;
    	//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
