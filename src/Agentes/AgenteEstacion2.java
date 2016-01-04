
package Agentes;
import Comportamientos.ComportamientoAgenteControlador;
import Comportamientos.ComportamientoAgenteEstacion2;
import jade.core.Agent;



public class AgenteEstacion2 extends Agent{

	@Override
	protected void setup(){
		
		ComportamientoAgenteEstacion2 e2=new ComportamientoAgenteEstacion2();
		addBehaviour(e2);
	}
	
	@Override
	protected void takeDown(){
		super.takeDown();

	}
	
	
	

}
