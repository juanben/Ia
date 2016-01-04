
package Agentes;
import Comportamientos.ComportamientoAgenteControlador;
import jade.core.Agent;



public class AgenteControlador extends Agent{

	@Override
	protected void setup(){
		
		ComportamientoAgenteControlador c1=new ComportamientoAgenteControlador();
		addBehaviour(c1);
	}
	
	@Override
	protected void takeDown(){
		super.takeDown();

	}
	
	
	

}
