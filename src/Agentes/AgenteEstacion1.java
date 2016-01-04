package Agentes;
import Comportamientos.ComportamientoAgenteEstacion1;
import jade.core.Agent;



public class AgenteEstacion1 extends Agent{

	@Override
	protected void setup(){

		
		ComportamientoAgenteEstacion1 e1=new ComportamientoAgenteEstacion1();
		addBehaviour(e1);
	}
	
	@Override
	protected void takeDown(){
		super.takeDown();

	}
	
	
	

}

