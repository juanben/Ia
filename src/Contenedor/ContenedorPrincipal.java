package Contenedor;

import java.util.logging.Level;

import Agentes.AgenteControlador;
import Agentes.AgenteEstacion2;
import Agentes.AgenteEstacion3;
import Agentes.AgenteEstacion4;
import jade.util.Logger;
import jade.wrapper.AgentContainer;
import jade.wrapper.StaleProxyException;
import jade.core.MainContainer;
import jade.core.Profile;
import jade.core.ProfileImpl;
import jade.wrapper.AgentController;
import Agentes.AgenteEstacion1;


public class ContenedorPrincipal {

	AgentController agenteControlador;
	AgentController agenteEstacion1;
	AgentController agenteEstacion2;
	AgentController agenteEstacion3;
	AgentController agenteEstacion4;
	
	AgentContainer mainContainer;
	
	
	public void contendeor(){
		jade.core.Runtime runtime=jade.core.Runtime.instance();

	
		
		runtime.setCloseVM(true);
		
	

		Profile profile=new ProfileImpl(null, 1099, null);
		mainContainer = (AgentContainer) runtime.createMainContainer(profile);
		
		
	
	}
	
	public void iniciarAgentes(){
		try {
			agenteControlador=mainContainer.createNewAgent("agenteControlador",AgenteControlador.class.getName(),null);
			agenteEstacion1=mainContainer.createNewAgent("agenteEstacion1",AgenteEstacion1.class.getName(),null);
			agenteEstacion2=mainContainer.createNewAgent("agenteEstacion2",AgenteEstacion4.class.getName(),null);
			agenteEstacion3=mainContainer.createNewAgent("agenteEstacion3",AgenteEstacion3.class.getName(),null);
			agenteEstacion4=mainContainer.createNewAgent("agenteEstacion4",AgenteEstacion2.class.getName(),null);
			agenteControlador.start();
			agenteEstacion1.start();
			agenteEstacion2.start();
			agenteEstacion4.start();
			agenteEstacion3.start();
		} catch (StaleProxyException ex) {

			Logger.getLogger(ContenedorPrincipal.class.getName()).log(Level.SEVERE,null,ex);
			
		}
		
		
	}
	
	public static void main(String[] args){
		ContenedorPrincipal cp=new ContenedorPrincipal();
		cp.contendeor();
		cp.iniciarAgentes();
		
	}
}

