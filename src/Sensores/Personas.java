package Sensores;

import java.util.Random;

public class Personas 
{


	private double varPers;
	
	public double numPers(double minima, double maxima){
		
	Random pers=new Random();
	return Math.rint((pers.nextDouble()*maxima+minima)*100)/100;
	
	}

	public double getVarPers() {
		return varPers;
	}

	public void setVarPers(double varPers) {
		this.varPers = varPers;
	}


}
