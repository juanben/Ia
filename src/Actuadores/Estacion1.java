package Actuadores;

public class Estacion1 {
	private boolean requerimientoBus;
			

	public void enviarPeticionBus(){
					System.out.println("Se requiere m�s buses en la estaci�n.");
					requerimientoBus=true;
				
	}
	
	public void cancelarEnvioPeticionBus(){
		System.out.println("No se requiere m�s buses en la estaci�n.");
		requerimientoBus=false;
	}

	public boolean isRequerimientoBus() {
		return requerimientoBus;
	}

	public void setRequerimientoBus(boolean requerimientoBus) {
		this.requerimientoBus = requerimientoBus;
	}



}
