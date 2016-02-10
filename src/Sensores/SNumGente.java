/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sensores;

import java.util.Random;

/**
 *
 * @author juan
 */
public class SNumGente 
{
    private int var;
	public SNumGente(int x) 
        {
		super();
		// TODO Auto-generated constructor stub
		var = randomico(x);
	}
	public int getVar() {
		return var;
	}
	public void setVar(int var) {
		this.var = var;
	}
	public int randomico(int x)
	{
            
	   int a;
	   Random numero = new Random();
           if (x==1)
           {
               a= (numero.nextInt()%100)+1;
           }
           else
           {
               a= (numero.nextInt()%300)+1;
           }
	   
	   return a;
	}
	@Override
	public String toString() {
		return "SPersonas [var=" + var + "]";
	}

}
