package Actuadores;

public class Controlador {
	private boolean requerimientoBus;
			
	public void enviarBuses(){
		System.out.println("Se han enviado m�s buses.");
		requerimientoBus=true;
	
}

public void cancelarEnvioBuses(){
System.out.println("Se detuvo el env�o de buses.");
requerimientoBus=false;
}

public boolean isRequerimientoBus() {
return requerimientoBus;
}

public void setRequerimientoBus(boolean requerimientoBus) {
this.requerimientoBus = requerimientoBus;
}



	

}
