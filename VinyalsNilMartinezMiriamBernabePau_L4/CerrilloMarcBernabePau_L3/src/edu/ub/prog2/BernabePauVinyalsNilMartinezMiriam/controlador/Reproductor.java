package edu.ub.prog2.BernabePauVinyalsNilMartinezMiriam.controlador;

import edu.ub.prog2.BernabePauVinyalsNilMartinezMiriam.model.FitxerReproduible;
import edu.ub.prog2.utils.AplicacioException;
import edu.ub.prog2.utils.EscoltadorReproduccioBasic;

import edu.ub.prog2.utils.ReproductorBasic;
import java.io.File;


public class Reproductor extends ReproductorBasic {
    public Reproductor (EscoltadorReproduccioBasic er){
        super(er);
    }
   public Reproductor(String vlcPath, EscoltadorReproduccioBasic controlador) {
       super(vlcPath, controlador);
   }
    
    //METODES REPRODUCCIO DELS FITXERSREPRODUIBLES
   public void reprodueix(FitxerReproduible fr) throws AplicacioException{
       super.play(fr);
       
   }
   
   public void reprodueix(FitxerReproduible r, File fitxerImatge) throws AplicacioException{
       super.play(r, fitxerImatge);
       
   }
   
   

    
    
}
