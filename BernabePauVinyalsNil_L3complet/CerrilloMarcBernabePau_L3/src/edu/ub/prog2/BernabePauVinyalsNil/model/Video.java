/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ub.prog2.BernabePauVinyalsNil.model;

import edu.ub.prog2.BernabePauVinyalsNil.controlador.Reproductor;
import edu.ub.prog2.utils.AplicacioException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author paubc
 */
public class Video extends FitxerReproduible{
    private int alcada, amplada;
    private float fps;
    private String descripcio;
    public Video(String pathname, String descripcio, String codec, float durada,int alcada,int amplada, float fps,Reproductor r) {
        super(pathname, descripcio, codec, durada, r);
        this.alcada=alcada;
        this.amplada=amplada;
        this.fps=fps;
        
        
    }
    
    

    
   

    

    @Override
    public void reproduir() {
        try {
            this.getRepro().reprodueix(this);
        } catch (AplicacioException ex) {
            ex.getMessage();
        }
        
    }
    
    
    @Override
        public String toString(){
        String f=super.toString();
       f+=     
               
               "Alçada: "+ "'" + this.alcada +"'  " +
               "Amplada: " + "'" + this.amplada +
               "fps: " + "'" + this.fps + "' " ;
       return f;
               
    }

    
    
    
    
}

