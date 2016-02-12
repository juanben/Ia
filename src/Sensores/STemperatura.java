/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sensores;

import java.text.DecimalFormat;
import java.util.Random;

/**
 *
 * @author juan
 */
public class STemperatura 
{
    	 private double var;
//DecimalFormat df = new DecimalFormat("0.00"); 
	public STemperatura() {
		super();
		// TODO Auto-generated constructor stub
		var = randomico();
                
	}	
	public double getVar() {
		return var;
	}
	public void setVar(double var) {
		this.var = var;
	}
	public double randomico()
	{
	   double a;
	   Random numero = new Random();
	   a= (numero.nextDouble()+ numero.nextInt(30) )+ 1;
	   
	   return a;
	}
	@Override
	public String toString() {
		return "STemperatura [var=" + var+ "]";
	}

    
}
