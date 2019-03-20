package edu.ub.prog2.BernabePauVinyalsNilMartinezMiriam.model;

import edu.ub.prog2.BernabePauVinyalsNilMartinezMiriam.controlador.Reproductor;
import java.io.File;
import java.util.Iterator;


public abstract class FitxerReproduible extends FitxerMultimedia {
    public abstract void reproduir();
    private String codec;
    private float durada;
    private transient Reproductor r;
    
    protected FitxerReproduible(String pathname, String descripcio,String codec, float durada, Reproductor r){
        super(pathname,descripcio);
        this.r=r;
        this.codec=codec;
        this.durada=durada;
    }
    
   public void setReproductor(Reproductor r){
       this.r=r;
   }
   
   public Reproductor getRepro(){
       return r;
   }
   
   public String toString(){
       String s= super.toString();
       s+= "Codec: "+"'"+this.codec+
               "Durada: " + "'" + this.durada + "'";
       return s;
   }
   
  
}
