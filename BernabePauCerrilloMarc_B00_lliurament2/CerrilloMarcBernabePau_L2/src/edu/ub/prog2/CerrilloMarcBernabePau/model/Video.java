/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ub.prog2.CerrilloMarcBernabePau.model;

import edu.ub.prog2.CerrilloMarcBernabePau.controlador.Reproductor;


/**
 *
 * @author paubc
 */
public class Video extends FitxerReproduible{
    private int alcada, amplada;
    private float fps;

    public Video(String pathname, String nom, String codec, float durada,int alcada,int amplada, float fps,Reproductor r) {
        super(pathname, nom, codec, durada, r);
        this.alcada=alcada;
        this.amplada=amplada;
        this.fps=fps;
        this.codec=codec;
        this.durada=durada;
    }
    
    

    
   

    

    @Override
    protected void reproduir() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    @Override
        public String toString(){
        String f="";
       f+=     "Cami " +"'"+ this.getPathTotal()+
               " Nom: " + "'"+ this.getNom()+"'" +
               "Codec: "+"'"+this.codec+ "'  "+
               "Durada: " + "'" + this.durada + "' "+
               "Alçada: "+ "'" + this.alcada +"'  " +
               "Amplada: " + "'" + this.amplada +
               "fps: " + "'" + this.fps + "' " ;
       return f;
               
    }

    
    
    
    
}

