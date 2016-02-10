/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contenedor;

import Agentes.BacaOrtiz;
import Agentes.Bellavista;
import Agentes.Benalcazar;
import Agentes.CasaCultura;
import Agentes.EloyAlfaro;
import Agentes.EstacionRioCoca;
import Agentes.EugenioEspejo;
import Agentes.GaloPlaza;
import Agentes.Jipijapa;
import Agentes.LaPaz;
import Agentes.LosSauses;
import Agentes.ManuelaCanizares;
import Agentes.MarinCentral;
import Agentes.MarinPlayon;
import Agentes.Mayo24;
import Agentes.NacionesUnidas;
import Agentes.Orellana;
import Agentes.SanMartin;
import Agentes.SimonBolivar;
import jade.core.Profile;
import jade.core.ProfileImpl;
import jade.wrapper.AgentContainer;
import jade.wrapper.AgentController;
import jade.wrapper.StaleProxyException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author juan
 */
public class ContenedorPrincipal {

    /**
     * @param args the command line arguments
     */
    AgentController agenteControlador; //controlar agentes, inicializar, matarlo, suspenderlo, como hilos
    AgentContainer mainContainer; //declaro contenedor vacio
    public void contenedor() {
        
        //crea rutina
        jade.core.Runtime runtime = jade.core.Runtime.instance();
        runtime.setCloseVM(true); //cerrar vm de jade

        //perfil configuracion incial (puerto, IP)
        Profile profile = new ProfileImpl(null, 1099, null); //IP maquina, JADE port default, identificador
        
        mainContainer = runtime.createMainContainer(profile); //instacio container
    }
    

    public void iniciarAgentes () {
        try {
            agenteControlador = mainContainer.createNewAgent("BacaOrtiz",BacaOrtiz.class.getName(),null);
            agenteControlador.start();
            agenteControlador = mainContainer.createNewAgent("Bellavista",Bellavista.class.getName(),null);
            agenteControlador.start();
            agenteControlador = mainContainer.createNewAgent("Benalcazar",Benalcazar.class.getName(),null);
            agenteControlador.start();
            agenteControlador = mainContainer.createNewAgent("CasaCultura",CasaCultura.class.getName(),null);
            agenteControlador.start();
            agenteControlador = mainContainer.createNewAgent("EloyAlfaro",EloyAlfaro.class.getName(),null);
            agenteControlador.start();
            agenteControlador = mainContainer.createNewAgent("EugenioEspejo",EugenioEspejo.class.getName(),null);
            agenteControlador.start();
            agenteControlador = mainContainer.createNewAgent("GaloPlaza",GaloPlaza.class.getName(),null);
            agenteControlador.start();
            agenteControlador = mainContainer.createNewAgent("JipiJapa",Jipijapa.class.getName(),null);
            agenteControlador.start();
            agenteControlador = mainContainer.createNewAgent("LaPaz",LaPaz.class.getName(),null);
            agenteControlador.start();
            agenteControlador = mainContainer.createNewAgent("LosSauses",LosSauses.class.getName(),null);
            agenteControlador.start();
            agenteControlador = mainContainer.createNewAgent("ManuelaCañizares",ManuelaCanizares.class.getName(),null);
            agenteControlador.start();
            agenteControlador = mainContainer.createNewAgent("MarinCentral",MarinCentral.class.getName(),null);
            agenteControlador.start();
            agenteControlador = mainContainer.createNewAgent("MarinPlayon",MarinPlayon.class.getName(),null);
            agenteControlador.start();
            agenteControlador = mainContainer.createNewAgent("NacionesUnidas",NacionesUnidas.class.getName(),null);
            agenteControlador.start();
            agenteControlador = mainContainer.createNewAgent("Orellana",Orellana.class.getName(),null);
            agenteControlador.start();
            agenteControlador = mainContainer.createNewAgent("RioCoca",EstacionRioCoca.class.getName(),null);
            agenteControlador.start();
            agenteControlador = mainContainer.createNewAgent("SanMartin",SanMartin.class.getName(),null);
            agenteControlador.start();
            agenteControlador = mainContainer.createNewAgent("SimonBolivar",SimonBolivar.class.getName(),null);
            agenteControlador.start();
            agenteControlador = mainContainer.createNewAgent("Mayo24",Mayo24.class.getName(),null);
            agenteControlador.start();
            
            
        } catch (StaleProxyException ex) {
            Logger.getLogger(ContenedorPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    public static void main(String[] args)
    {
        // TODO code application logic here
        ContenedorPrincipal cp = new ContenedorPrincipal();
        cp.contenedor();
        cp.iniciarAgentes();

    }
    
}
