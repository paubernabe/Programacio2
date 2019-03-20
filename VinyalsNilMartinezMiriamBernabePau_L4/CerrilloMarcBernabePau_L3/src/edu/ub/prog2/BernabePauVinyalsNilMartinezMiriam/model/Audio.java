package edu.ub.prog2.BernabePauVinyalsNilMartinezMiriam.model;

import edu.ub.prog2.BernabePauVinyalsNilMartinezMiriam.controlador.Reproductor;
import edu.ub.prog2.utils.AplicacioException;
import java.io.File;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;



public class Audio extends FitxerReproduible implements Serializable  {
    File fitxerImatge;
    int kbps;
    public Audio(String pathname,File fitxerImatge, String descripcio, String codec, float durada, int kbps, Reproductor r) {
        super(pathname, descripcio, codec, durada, r);
        this.fitxerImatge=fitxerImatge;
        this.kbps=kbps;
        
        
    }

    public int getKBPS(){
        return this.kbps;
    }
    

    @Override
    public void reproduir()   {
        
        try {
            this.getRepro().reprodueix(this, fitxerImatge);
        } catch (AplicacioException ex) {
            ex.getMessage();
        }
        
    }

    public String toString(){
        String f=super.toString();
       f+=     
               "Cami Miniatura: " + fitxerImatge.getAbsolutePath() +
               
               "kbps: " + "'" + this.getKBPS() + "'";
       return f;
               
    }
    
    
    
 
    
}
