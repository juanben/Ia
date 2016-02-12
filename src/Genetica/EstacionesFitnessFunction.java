/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Genetica;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.jgap.FitnessFunction;
import org.jgap.IChromosome;
import org.jgap.impl.IntegerGene;



public class EstacionesFitnessFunction extends FitnessFunction {

    List listaEstaciones = new ArrayList();
    

    public EstacionesFitnessFunction(List estaciones) {
        this.listaEstaciones = estaciones;
        
    }

    @Override
    protected double evaluate(IChromosome chromosome) {
        double score = 0;
        double numGenteScore = 0;

        List dups = new ArrayList();
        int badSolution = 1;

        for (int i = 0; i < chromosome.size(); i++) {

            IntegerGene agene = (IntegerGene) chromosome.getGene(i);
            int index = (Integer) chromosome.getGene(i).getAllele();

            if (dups.contains(index)) {
                badSolution = 0;
            } else {
                dups.add(index);
            }

            Estaciones estacion = (Estaciones) listaEstaciones.get(index);


            score = (score + estacion.getNumGente()) ;
//            System.out.println(movie + " socore: " + score);
        }
        return (score * badSolution);
    }



}
