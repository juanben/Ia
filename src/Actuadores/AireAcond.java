/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Actuadores;

/**
 *
 * @author juan
 */
public class AireAcond 
{
    private boolean encendido;

    public AireAcond() 
    {
        encendido=false;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }
    public void encender()
    {
        encendido= true;
    }
    public void apagar()
    {
        encendido = false;
    }

    @Override
    public String toString()
    {
        return "AireAcond encendido = " + encendido ;
    }
    
    
    
}
