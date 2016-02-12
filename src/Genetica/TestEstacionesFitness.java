/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Genetica;

import java.util.ArrayList;

import java.util.List;
import java.util.StringTokenizer;
import org.jgap.Chromosome;
import org.jgap.Configuration;
import org.jgap.DefaultFitnessEvaluator;
import org.jgap.Gene;
import org.jgap.Genotype;
import org.jgap.IChromosome;
import org.jgap.impl.DefaultConfiguration;
import org.jgap.impl.IntegerGene;
import org.jgap.impl.SwappingMutationOperator;

import Agentes.BacaOrtiz;
import Comportamientos.CBacaOrtiz;
import Comportamientos.CRioCoca;




public class TestEstacionesFitness {

    private Configuration conf;
    //private SwappingMutationOperator swapper;
    private EstacionesFitnessFunction fitnessFunction = null;
    public List estaciones = new ArrayList();
    //public List genres = new ArrayList();

    private static final int MAX_ALLOWED_EVOLUTIONS = 1500;
    private Chromosome estacionesChromosome = null;
    
    
    

    public void initialize() throws Exception {
        

        estaciones = this.loadMovies();

        conf = new DefaultConfiguration();
//        Configuration.resetProperty(Configuration.PROPERTY_FITEVAL_INST);
//        conf.setFitnessEvaluator(new DefaultFitnessEvaluator());
//        conf.getGeneticOperators().clear();

//        swapper = new SwappingMutationOperator(conf);
//        conf.addGeneticOperator(swapper);
        conf.setPreservFittestIndividual(true);
        conf.setPopulationSize(1000);
        conf.setKeepPopulationSizeConstant(false);

        fitnessFunction = new EstacionesFitnessFunction(estaciones);

        conf.setFitnessFunction(fitnessFunction);

        Gene[] movieGenes = new Gene[3];

        movieGenes[0] = new IntegerGene(conf, 0, estaciones.size() - 1);
        movieGenes[1] = new IntegerGene(conf, 0, estaciones.size() - 1);
        movieGenes[2] = new IntegerGene(conf, 0, estaciones.size() - 1);

        estacionesChromosome = new Chromosome(conf, movieGenes);
        movieGenes[0].setAllele(new Integer(0));
        movieGenes[1].setAllele(new Integer(1));
        movieGenes[2].setAllele(new Integer(2));

        conf.setSampleChromosome(estacionesChromosome);

    }

    private List loadMovies() {
        List list = new ArrayList();
        
              
        

        Estaciones BacaOrtiz = new Estaciones();
        BacaOrtiz.setNombre("BacaOrtiz");
        BacaOrtiz.setNumGente(CRioCoca.BacaOrtiz1);
        Estaciones Bellavista = new Estaciones();
        Bellavista.setNombre("Bellavista");
        Bellavista.setNumGente(CRioCoca.Bellavista1);
        Estaciones Benalcazar = new Estaciones();
        Benalcazar.setNombre("Benalcazar");
        Benalcazar.setNumGente(CRioCoca.Benalcazar1);
        Estaciones CasaCultura = new Estaciones();
        CasaCultura.setNombre("CasaCultura");
        CasaCultura.setNumGente(CRioCoca.CasaCultura1);
        Estaciones EloyAlfaro = new Estaciones();
        EloyAlfaro.setNombre("EloyAlfaro");
        EloyAlfaro.setNumGente(CRioCoca.EloyAlfaro1);
        Estaciones EugenioEspejo = new Estaciones();
        EugenioEspejo.setNombre("EugenioEspejo");
        EugenioEspejo.setNumGente(CRioCoca.EugenioEspejo1);
        Estaciones GaloPlaza = new Estaciones();
        GaloPlaza.setNombre("GaloPlaza");
        GaloPlaza.setNumGente(CRioCoca.GaloPlaza1);
        Estaciones JipiJapa = new Estaciones();
        JipiJapa.setNombre("JipiJapa");
        JipiJapa.setNumGente(CRioCoca.JipiJapa1);
        Estaciones LaPaz = new Estaciones();
        LaPaz.setNombre("LaPaz");
        LaPaz.setNumGente(CRioCoca.LaPaz1);
        Estaciones LosSauses = new Estaciones();
        LosSauses.setNombre("LosSauses");
        LosSauses.setNumGente(CRioCoca.LosSauces1);
        Estaciones ManuelaCanizares = new Estaciones();
        ManuelaCanizares.setNombre("ManuelaCanizares");
        ManuelaCanizares.setNumGente(CRioCoca.ManuelaCanizares1);
        Estaciones MarinCentral = new Estaciones();
        MarinCentral.setNombre("MarinCentral");
        MarinCentral.setNumGente(CRioCoca.MarinCentral1);
        Estaciones MarinPlayon = new Estaciones();
        MarinPlayon.setNombre("MarinPlayon");
        MarinPlayon.setNumGente(CRioCoca.MarinPlayon1);
        Estaciones NacionesUnidas = new Estaciones();
        NacionesUnidas.setNombre("NacionesUnidas");
        NacionesUnidas.setNumGente(CRioCoca.NacionesUnidas1);
        Estaciones Orellana = new Estaciones();
        Orellana.setNombre("Orellana");
        Orellana.setNumGente(CRioCoca.Orellana1);
        Estaciones RioCoca = new Estaciones();
        RioCoca.setNombre("RioCoca");
        RioCoca.setNumGente(CRioCoca.rioCoca);
        Estaciones SanMartin = new Estaciones();
        SanMartin.setNombre("SanMartin");
        SanMartin.setNumGente(CRioCoca.SanMartin1);
        Estaciones SimonBolivar = new Estaciones();
        SimonBolivar.setNombre("SimonBolivar");
        SimonBolivar.setNumGente(CRioCoca.SimonBolivar1);
        Estaciones Mayo24 = new Estaciones();
        Mayo24.setNombre("Mayo24");
        Mayo24.setNumGente(CRioCoca.Mayo241);

        




        list.add(BacaOrtiz);
        list.add(Bellavista);
        list.add(Benalcazar);
        list.add(CasaCultura);
        list.add(EloyAlfaro);
        list.add(EugenioEspejo);
        list.add(GaloPlaza);
        list.add(JipiJapa);
        list.add(LaPaz);
        list.add(LosSauses);
        list.add(ManuelaCanizares);
        list.add(MarinCentral);
        list.add(MarinPlayon);
        list.add(NacionesUnidas);
        list.add(Orellana);
        list.add(RioCoca);
        list.add(SanMartin);
        list.add(SimonBolivar);
        list.add(Mayo24);

      

        return list;

    }

    public void testSelectFittestMovies() throws Exception {

        estaciones = this.loadMovies();

        Genotype population = Genotype.randomInitialGenotype(conf);

        IChromosome bestSolutionSoFar = estacionesChromosome;

        for (int i = 0; i < MAX_ALLOWED_EVOLUTIONS; i++) {
            population.evolve();
            IChromosome candidateBestSolution = population.getFittestChromosome();

            if (candidateBestSolution.getFitnessValue() > bestSolutionSoFar.getFitnessValue()) {
                bestSolutionSoFar = candidateBestSolution;

            }
        }
        printSolution(bestSolutionSoFar, estaciones);
    }

    public void printSolution(IChromosome solution, List estaciones) {
        System.out.println("#################################################################################################################");
        System.out.println("Valor del Fitness: " + solution.getFitnessValue());

        for (int i = 0; i < solution.size(); i++) {
            int index = (Integer) solution.getGene(i).getAllele();
            Estaciones estacion = (Estaciones) estaciones.get(index);
            System.out.println(estacion.toString());
        }
        System.out.println("#################################################################################################################");
    }
}
