package Actuadores;

public class EnviarBus {
	private boolean enviando;
	
	public EnviarBus()
	{
		enviando = false;
	}
	
	public boolean isEnviando(){
		return enviando;
	}
	
	public void setEnviando(boolean enviando) {
        this.enviando = enviando;
    }
    public void enviar()
    {
    	enviando= true;
    }
    public void noEnviar()
    {
    	enviando = false;
    }

    @Override
    public String toString()
    {
        return "Envando unidades a estaciones state= " + enviando ;
    }
	
	

}
