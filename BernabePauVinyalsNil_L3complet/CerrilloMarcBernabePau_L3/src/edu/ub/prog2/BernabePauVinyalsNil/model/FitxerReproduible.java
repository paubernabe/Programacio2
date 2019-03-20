/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ub.prog2.BernabePauVinyalsNil.model;

import edu.ub.prog2.BernabePauVinyalsNil.controlador.Reproductor;
import java.io.File;
import java.util.Iterator;





/**
 *
 * @author paubc
 */
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
