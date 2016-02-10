
package Agentes;
import Comportamientos.ComportamientoAgenteControlador;
import Comportamientos.ComportamientoAgenteEstacion4;
import jade.core.Agent;



public class AgenteEstacion4 extends Agent{

	@Override
	protected void setup(){
		
		ComportamientoAgenteEstacion4 e4=new ComportamientoAgenteEstacion4();
		addBehaviour(e4);
	}
	
	@Override
	protected void takeDown(){
		super.takeDown();

	}
	
	
	

}
