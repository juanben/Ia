/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Genetica;

import java.util.List;


public class Estaciones {

    private String nombre;
    private int numGente;

    
    
    public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public int getNumGente() {
		return numGente;
	}



	public void setNumGente(int numGente) {
		this.numGente = numGente;
	}



	@Override
    public String toString() {
        return "Estaciones [Nombre=" + nombre + ", Numero de Personas=" + numGente +"]";
    }
}
