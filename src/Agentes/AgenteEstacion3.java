
package Agentes;
import Comportamientos.ComportamientoAgenteControlador;
import Comportamientos.ComportamientoAgenteEstacion3;
import jade.core.Agent;



public class AgenteEstacion3 extends Agent{

	@Override
	protected void setup(){

		
		ComportamientoAgenteEstacion3 e3=new ComportamientoAgenteEstacion3();
		addBehaviour(e3);
	}
	
	@Override
	protected void takeDown(){
		super.takeDown();

	}
	
	
	

}
