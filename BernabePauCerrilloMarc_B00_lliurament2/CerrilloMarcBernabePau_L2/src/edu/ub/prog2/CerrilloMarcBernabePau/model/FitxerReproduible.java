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
public abstract class FitxerReproduible extends FitxerMultimedia {
    
    
    protected abstract void reproduir();
    String codec;
    float durada;
    
    protected FitxerReproduible(String pathname, String nom,String codec, float durada, Reproductor r){
        super(pathname);
    }
    
   
  
}
