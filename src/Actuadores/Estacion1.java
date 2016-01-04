package Actuadores;

public class Estacion1 {
	private boolean requerimientoBus;
			

	public void enviarPeticionBus(){
					System.out.println("Se requiere más buses en la estación.");
					requerimientoBus=true;
				
	}
	
	public void cancelarEnvioPeticionBus(){
		System.out.println("No se requiere más buses en la estación.");
		requerimientoBus=false;
	}

	public boolean isRequerimientoBus() {
		return requerimientoBus;
	}

	public void setRequerimientoBus(boolean requerimientoBus) {
		this.requerimientoBus = requerimientoBus;
	}



}
